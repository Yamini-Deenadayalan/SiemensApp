package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@Entity
@Table(name="Asserts")
@JacksonXmlRootElement(localName="Asserts")
public class Asserts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long asserId;
	
	@Column(name="assertName")
	private String assertName;
	
	@Column(name="orgId")
	private String orgId;
	
	@Column(name="assertAmt")
	private String assertAmt;

	public long getAsserId() {
		return asserId;
	}

	public void setAsserId(long asserId) {
		this.asserId = asserId;
	}
	
	public String getAssertName() {
		return assertName;
	}

	public void setAssertName(String assertName) {
		this.assertName = assertName;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getAssertAmt() {
		return assertAmt;
	}

	public void setAssertAmt(String assertAmt) {
		this.assertAmt = assertAmt;
	}
	
	
}
