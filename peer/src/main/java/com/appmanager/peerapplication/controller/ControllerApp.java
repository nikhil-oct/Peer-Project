package com.appmanager.peerapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerApp{
	
	public ControllerApp() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@RequestMapping("message")
	public String onMessage()
	{
		System.out.println("Invoked onMessage");
		return "message.jsp";
	}
	
	@RequestMapping("messageSave")
	public String onDisplayMes(@RequestParam("name") String name,
			@RequestParam("message") String message,Model model) {
		System.out.println("Invoked onDisplayMes");

		model.addAttribute("name", name);
		model.addAttribute("message", message);

		
		
		return "success.jsp";
		//return "Hello Peer Project and time on server is : "+LocalDateTime.now();
	}
}
