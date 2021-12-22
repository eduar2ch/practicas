package com.mx.api.practica.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
//@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "gender_id")
	private Long genderId;
	
	@NotNull
	@Column(name = "job_id")
	private Long jobId;
	
	@NotNull
	private String name;
	
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	private Date birthdate;

	public Employee(Long id, Long genderId, Long jobId, String name, String lastName, Date birthdate) {
		this.id = id;
		this.genderId = genderId;
		this.jobId = jobId;
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGenderId() {
		return genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", genderId=" + genderId + ", jobId=" + jobId + ", name=" + name + ", lastName="
				+ lastName + ", birthdate=" + birthdate + "]";
	}

}
