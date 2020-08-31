package com.niit.Project2.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Component

public class Circle {
	@Id
	@Column(name="circleName")
	private String circleName;
	@Column(name="createdBy")
	private String createdBy;
	private boolean status;
	@Column(name="creationDate")
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date creationDate;
	
	public Circle() {
		this.creationDate=new Date(0);
	}
	//constructor method
	//getter and setter methods

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
