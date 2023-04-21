package com.Company.entity;

import java.math.BigInteger;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="registration_table")
public class RegistrationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="companyId")
	 Long companyId;
	
	@Column(name="legalName")
	String legalName;
	
	@Column(name="registrationId")
	String registrationId;
	
	@Column(name="dateOfRegister")
	String dateOfRegister;
	
//	@OneToOne(mappedBy="registration" ,cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//    private CompanyEntity companyRegistration;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getDateOfRegister() {
		return dateOfRegister;
	}

	public void setDateOfRegister(String dateOfRegister) {
		this.dateOfRegister = dateOfRegister;
	}
	
//	public CompanyEntity getCompanyRegistration() {
//		return companyRegistration;
//	}
//
//	public void setCompanyRegistration(CompanyEntity companyRegistration) {
//		this.companyRegistration = companyRegistration;
//	}
	
	
}