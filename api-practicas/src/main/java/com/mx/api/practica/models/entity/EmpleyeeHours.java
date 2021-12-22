package com.mx.api.practica.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "employee_worked_hours")
public class EmpleyeeHours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "worked_hours")
	private Long workedHours;
	
	@Column(name = "worked_date")
	private Date workedDate;

	public EmpleyeeHours(Long id, Long employeeId, Long workedHours, Date workedDate) {
		this.id = id;
		this.employeeId = employeeId;
		this.workedHours = workedHours;
		this.workedDate = workedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Long workedHours) {
		this.workedHours = workedHours;
	}

	public Date getWorkedDate() {
		return workedDate;
	}

	public void setWorkedDate(Date workedDate) {
		this.workedDate = workedDate;
	}

	@Override
	public String toString() {
		return "EmpleyeeHours [id=" + id + ", employeeId=" + employeeId + ", workedHours=" + workedHours
				+ ", workedDate=" + workedDate + "]";
	}

}
