package com.suhas.springdatarest.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private String email;

	/* Should I have fields for CompanyName and SchoolNames here
	 to map with the Company and School Table like below
	 @OneToMany
	 private List<Company> companyNames;
	 @OneToMany
	 private List<School> schoolNames;
	 please use postman tool for testing. */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
