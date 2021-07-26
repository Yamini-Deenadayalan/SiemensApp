package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@Entity
@Table(name="organization")
@JacksonXmlRootElement(localName="Organization")
public class Organization {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JacksonXmlProperty(isAttribute = true)
	private long orgId;
	
	@Column(name="orgName")
	private String orgName;
	
	@Column(name="orgPlace")
	private String orgPlace;
	
	@Column(name="orgTurnver")
	private String orgTurnver;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="org_fid", referencedColumnName = "orgId") 
	List<Employee> employees= new ArrayList<Employee>();
	 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="org_assert_fid", referencedColumnName = "orgId")
	List<Asserts> asserts= new ArrayList<Asserts>();

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}


	public String getOrgName() {
		return orgName;
	}


	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}


	public String getOrgPlace() {
		return orgPlace;
	}


	public void setOrgPlace(String orgPlace) {
		this.orgPlace = orgPlace;
	}


	public String getOrgTurnver() {
		return orgTurnver;
	}


	public void setOrgTurnver(String orgTurnver) {
		this.orgTurnver = orgTurnver;
	}

	
	public List<Employee> getEmployees() { return employees; }
	 

	public void setEmployees(List<Employee> employees) { this.employees =
	  employees; }

	
	
	public List<Asserts> getAsserts() {
		return asserts;
	}

	public void setAsserts(List<Asserts> asserts) {
		this.asserts = asserts;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", orgPlace=" + orgPlace + ", orgTurnver="
				+ orgTurnver + ", employees=" + employees + ", asserts=" + asserts + "]";
	}

	
	
	 
}
