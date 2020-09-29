package com.appmanager.peerapplication.controller;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appmanager.peerapplication.entity.MessageEntity;
import com.appmanager.peerapplication.service.MessageService;

@Controller
public class ControllerApp{
	
	private static final Logger logger = Logger.getLogger(ControllerApp.class);
	
	@Autowired
	MessageService messageService;
	
	public ControllerApp() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@RequestMapping("save")
	public String onMessage()
	{
		System.out.println("Invoked onMessage");
		return "message";
	}
	
	@RequestMapping("messageSave")
	public String onDisplayMes(MessageEntity messageEntity,Model model) {
		System.out.println("Invoked onDisplayMes");

		

		if (Objects.nonNull(messageEntity)) {
			
			MessageEntity fetechedMessage= messageService.saveMessage(messageEntity);
			logger.info(fetechedMessage);
			
			model.addAttribute("name", messageEntity.getName());
			model.addAttribute("message", messageEntity.getMessage());
		
			
			logger.info("Directing to DisplayMessage.jsp");
			return "success";
			
		} else {
			logger.info("Message not valid");
			model.addAttribute("Error", "Please check which field and enter valid data");
			return "success";
		}
		
		//return "Hello Peer Project and time on server is : "+LocalDateTime.now();
	}
}
