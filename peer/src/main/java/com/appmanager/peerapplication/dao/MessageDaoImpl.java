package com.appmanager.peerapplication.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appmanager.peerapplication.service.MessageService;

@Component
public class MessageDaoImpl implements MessageDao{

	@Autowired
    MessageService messageService;
	
}
