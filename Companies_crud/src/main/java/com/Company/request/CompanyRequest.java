package com.Company.request;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class CompanyRequest {
	
	Long id;
	Long companyId;
	String companyName;
	String phoneNumber;
	Boolean isDeleted;


	RegistrationEntity registration;
	AddressEntity address;
	List<UsersEntity> users;

	public CompanyRequest(){
		
	}
	
	public Long getId() {
		return id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public RegistrationEntity getRegistration() {
		return registration;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}
	
	
}
