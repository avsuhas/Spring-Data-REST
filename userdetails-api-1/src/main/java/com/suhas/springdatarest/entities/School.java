package com.suhas.springdatarest.entities;


import javax.persistence.OneToMany;


public class School extends AbstractEntity{
	
	
	private String schoolName;
	@OneToMany(mappedBy = "user")
	private Long userId;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	

}
