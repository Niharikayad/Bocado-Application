package com.niit.Project2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component

public class UserCircle implements Serializable {
	
	
	@Id
	@GeneratedValue
	private int userCircleId;
	private String circleName;
	private String emailId;
	//constructor methods
	public UserCircle() {
		
		// TODO Auto-generated constructor stub
	}
	
	public UserCircle(int userCircleId, String circleName, String emailId) {
		super();
		this.userCircleId = userCircleId;
		this.circleName = circleName;
		this.emailId = emailId;
	}
	//getter and setter methods
	public int getUserCircleId() {
		return userCircleId;
	}
	public void setUserCircleId(int userCircleId) {
		this.userCircleId = userCircleId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
