package com.appmanager.peerapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appmanager.peerapplication.entity.MessageEntity;
import com.appmanager.peerapplication.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepository;

	private static final Logger logger = Logger.getLogger(MessageServiceImpl.class);

	@Override
	public MessageEntity saveMessage(MessageEntity messageEntity) {
		MessageEntity fetchedMsgEntity = null;
		try {
			logger.info("Started: saveMessage from MessageServiceImpl ");
			if (Objects.nonNull(messageEntity)) {
				
				logger.info("-------------------Saving entity into message_table "+messageEntity);
				messageRepository.save(messageEntity);

			}
			return fetchedMsgEntity;
		} catch (Exception e) {
			logger.error("Exception in saveMessage ", e);
			System.out.println(e);
		}
		logger.info("Ended: saveMessage from MessageServiceImpl");
		return messageEntity;
	}

}
