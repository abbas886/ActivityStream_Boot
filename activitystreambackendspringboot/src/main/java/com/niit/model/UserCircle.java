package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

@Component
@Entity
public class UserCircle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userCircleId;
	private int circleId;
	private String UserId;
	@Temporal(value = TemporalType.DATE)
	private Date UserJoinedDate;
	public int getUserCircleId() {
		return userCircleId;
	}
	public void setUserCircleId(int userCircleId) {
		this.userCircleId = userCircleId;
	}
	public int getCircleId() {
		return circleId;
	}
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getUserJoinedDate() {
		return UserJoinedDate;
	}
	public void setUserJoinedDate(Date userJoinedDate) {
		UserJoinedDate = userJoinedDate;
	}
	
	
	
	
}
