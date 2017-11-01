package com.suhas.springdatarest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="SCHOOL")
public class School {

	@Id
	@GeneratedValue
	public long id;

	private String schoolName;
	
	//private long userId;
	
	
	private User user;
	
	@ManyToOne
	@JoinColumn(name ="USER_ID")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/*public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}*/
}