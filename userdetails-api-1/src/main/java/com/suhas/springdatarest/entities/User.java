package com.suhas.springdatarest.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User extends AbstractEntity {

	private String firstName;
	private String lastName;
	private String email;

	@OneToMany(mappedBy = "school", fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID")
	private List<School> schoolName;

	@OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID")
	private List<Company> companyName;

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

	public List<School> getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(List<School> schoolName) {
		this.schoolName = schoolName;
	}

	public List<Company> getCompanyName() {
		return companyName;
	}

	public void setCompanyName(List<Company> companyName) {
		this.companyName = companyName;
	}

}
