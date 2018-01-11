package com.niit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Circle {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int circleId;
	private String circleName;
	private String adminId;
	private String status;
	@Column @Temporal(value=TemporalType.DATE)
	private Date circleDate;
	public int getCircleId() {
		return circleId;
	}
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCircleDate() {
		return circleDate;
	}
	public void setCircleDate(Date circleDate) {
		this.circleDate = new Date();
	}

}
