package com.xworkz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.spring.dto.NaturalCalamitiesDTO;
import com.xworkz.spring.service.NaturalCalamityService;

@Component	
@RequestMapping("/")
public class Controller {
	
	@Autowired
	private NaturalCalamityService service;
	
	public Controller() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/check.do" ,method = RequestMethod.POST)
	public String onRegister(NaturalCalamitiesDTO entity,Model model) {
		
		System.out.println("invoked onRegister");
		System.out.println(entity);
		
		int check=this.service.validateAndCreate(entity);
		if (check==0) {
			//String place = dto.getPlace();
			System.out.println("Sending response to success.jsp");
			model.addAttribute("place","Place: "+ entity.getPlace());	
			model.addAttribute("date","Date: "+entity.getDate());		
			model.addAttribute("type","CalamityType: "+ entity.getCalamityType());		
			model.addAttribute("area","Area: "+ entity.getArea());		
			model.addAttribute("injuries","Number Of Injuried: "+ entity.getNoOfInjured());
			model.addAttribute("deaths","Number Of Deaths: "+ entity.getNoOfDeaths());		
			model.addAttribute("loss","Avg Loss: "+ entity.getAvgLoss());
			model.addAttribute("catured","Captured By: "+ entity.getCapturedBy());		



			return "success";
		} else {
			System.out.println("sending response to welcome.jsp");
			model.addAttribute("valid", "Some fields are missing, so enter the details again");
			return "welcome";
		}
		
		

	}

}
