package com.Company.response;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class CompanyResponse {

	Long id;
	Long companyId;
	String companyName;
	String phoneNumber;
	Boolean isDeleted;
	private RegistrationEntity registration;
	private AddressEntity address;
	private List<UsersEntity> users;


	public CompanyResponse( Long id, Long companyId, String companyName, String phoneNumber, Boolean isDeleted, RegistrationEntity registration,AddressEntity address, List<UsersEntity> users) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.companyName=companyName;
		this.phoneNumber=phoneNumber;
		this.isDeleted=isDeleted;
		this.registration=registration;
		this.address=address;
		this.users=users;
		
	}

	public CompanyResponse() {
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
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Boolean getisDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public RegistrationEntity getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationEntity registration) {
		this.registration=registration;
		
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}

	public void setUsers (List<UsersEntity> users) {
		this.users = users;
	}
	

}
