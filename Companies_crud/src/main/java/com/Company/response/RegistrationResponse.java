package com.Company.response;


public class RegistrationResponse {

	Long id;
	Long companyId;
	String legalName;
	String registrationId;
	String dateOfRegister;
	
	public RegistrationResponse( Long id, Long companyId, String legalName, String registrationId, String dateOfRegister) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.legalName=legalName;
		this.registrationId=registrationId;
		this.dateOfRegister=dateOfRegister;
		
	}

	public RegistrationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	
	
	
}
