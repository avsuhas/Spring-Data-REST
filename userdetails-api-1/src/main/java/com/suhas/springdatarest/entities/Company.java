package com.suhas.springdatarest.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Company extends AbstractEntity {
	

	private String companyName;
	@OneToMany(mappedBy = "user")
	private Long userId;
	

	public String getSchoolName() {
		return companyName;
	}
	public void setSchoolName(String schoolName) {
		this.companyName = schoolName;
	}
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	

}
