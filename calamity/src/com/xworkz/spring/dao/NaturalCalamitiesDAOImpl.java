package com.xworkz.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamitiesDAOImpl implements NaturalCalamitiesDAO {

	
	private SessionFactory factory;

	
	public NaturalCalamitiesDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}
	

	@Override
	public void create(NaturalCalamitiesDTO entity) {
		Session session = null;
		System.out.println("Start : daoImpl");
		System.out.println("invoked save() method in daoImpl");
		System.out.println(entity);
		session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End : daoImpl");

		} catch (Exception e) {
			System.err.println("unable to insert");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
