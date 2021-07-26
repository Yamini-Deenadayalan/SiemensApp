package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name="Employee")
@JacksonXmlRootElement(localName="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empAdd")
	private String empAdd;
	
	@Column(name="orgId")
	private long orgId;
	
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}


	
	

}
