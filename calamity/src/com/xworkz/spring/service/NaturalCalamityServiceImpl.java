package com.xworkz.spring.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dao.NaturalCalamitiesDAO;
import com.xworkz.spring.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamityServiceImpl implements NaturalCalamityService {

	@Autowired
	private NaturalCalamitiesDAO dao;

	
	@Override
	public int validateAndCreate(NaturalCalamitiesDTO entity) {
		System.out.println("Start : service");
		int valid = 1;
		try {
			if (Objects.nonNull(entity)) {
				String place = entity.getPlace();
				if (Objects.nonNull(place) && !place.isEmpty()) {
					System.out.println("Place is valid");
					valid = 0;
				} else {
					System.out.println("Place is not Valid");
					valid = 1;
				}
				String date = entity.getDate();
				if (valid==0 && Objects.nonNull(date) && !date.isEmpty()) {
					System.out.println("Date is valid");
					valid = 0;
				} else {
					System.out.println("Date is not Valid");
					valid = 1;
				}
				String capturedby = entity.getCapturedBy();
				if (valid==0 && Objects.nonNull(capturedby) && !capturedby.isEmpty()) {
					System.out.println("CapturedB is valid");
					valid = 0;
				} else {
					System.out.println("CapturedB is not Valid");
					valid = 1;
				}
				String calamityType = entity.getCalamityType();
				if (valid==0 && Objects.nonNull(calamityType) && !calamityType.isEmpty()) {
					System.out.println("CalamityType is valid");
					valid = 0;
				} else {
					System.out.println("CalamityType is not Valid");
					valid = 1;
				}
				if (valid==0) {
					System.out.println("Going to call dao now");
					dao.create(entity);
					System.out.println("End : service");
				}
			} else {
				System.out.println("Data Not Availabel");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return valid;
	}

}
