package com.appmanager.peerapplication.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

//@Getter
//@Setter
//@Slf4j
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity
@Table(name="message_table")
public class MessageEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(MessageEntity.class);
	
	@Id
	@GenericGenerator(name="xworkz",strategy = "increment")
	@GeneratedValue(generator ="xworkz")
	@Column(name="id")
	private int id;
	@Column(name="message")
	private String message;
	@Column(name="name")
	private String name;
	
	public MessageEntity() {
		logger.info("Created Message Entity");
	}

	public MessageEntity(int id, String message, String name) {
		super();
		this.id = id;
		this.message = message;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
