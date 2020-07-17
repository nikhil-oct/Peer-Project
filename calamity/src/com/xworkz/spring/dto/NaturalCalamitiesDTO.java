package com.xworkz.spring.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NATURALCALAMITIES_TABLE")
public class NaturalCalamitiesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer nId;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "DATE")
	private String date;
	@Column(name = "CAPTUREDBY")
	private String capturedBy;
	@Column(name = "CALAMITYTYPE")
	private String calamityType;
	@Column(name = "AREA")
	private String area;
	@Column(name = "AVGLOSS")
	private String avgLoss;
	@Column(name = "NOOFDEATHS")
	private Integer noOfDeaths;
	@Column(name = "NOOFINJURED")
	private Integer noOfInjured;
	
	public NaturalCalamitiesDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "NaturalCalamities [nId=" + nId + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", avgLoss=" + avgLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}

	public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCalamityType() {
		return calamityType;
	}

	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAvgLoss() {
		return avgLoss;
	}

	public void setAvgLoss(String avgLoss) {
		this.avgLoss = avgLoss;
	}

	public Integer getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(Integer noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	public Integer getNoOfInjured() {
		return noOfInjured;
	}

	public void setNoOfInjured(Integer noOfInjured) {
		this.noOfInjured = noOfInjured;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
