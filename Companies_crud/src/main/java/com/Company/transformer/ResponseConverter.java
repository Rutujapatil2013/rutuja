package com.Company.transformer;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;
import com.Company.request.RegistrationRequest;
import com.Company.response.AddressResponse;
import com.Company.response.CompanyResponse;
import com.Company.response.RegistrationResponse;
import com.Company.response.UsersResponse;


@Component
public class ResponseConverter {
	
	//Company
	public CompanyResponse toCompanyResponse(final CompanyEntity companyEntity) {
		CompanyResponse companyResponse = new CompanyResponse();
		companyResponse.setId(companyEntity.getId());
		companyResponse.setCompanyId(companyEntity.getCompanyId());
		companyResponse.setCompanyName(companyEntity.getCompanyName());
		companyResponse.setPhoneNumber(companyEntity.getPhoneNumber());
		companyResponse.setIsDeleted(companyEntity.getIsDeleted());
		companyResponse.setRegistration(companyEntity.getRegistration());
		companyResponse.setAddress(companyEntity.getAddress());
//		companyResponse.setUsers(companyEntity.getUsers());
		return companyResponse;
	}
	
	
	public List<CompanyResponse> convertorDataCompany (List<CompanyEntity> userList){
		return userList.stream().map(user ->toCompanyResponse(user)).collect(Collectors.toList());
		
	}
	
	public List<CompanyResponse> toCompanyResponseList (List<CompanyEntity> userList){
		return userList.stream().map(p -> new CompanyResponse(p.getId(),p.getCompanyId(),p.getCompanyName(),p.getPhoneNumber(),p.getIsDeleted(),p.getRegistration(),p.getAddress(),p.getUsers()))
				.collect(Collectors.toList());
	}
	
	
	//Address
	public AddressResponse toAddressResponse(final AddressEntity addressEntity) {
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setId(addressEntity.getId());
		addressResponse.setCompanyId(addressEntity.getCompanyId());
		addressResponse.setCity(addressEntity.getCity());
		addressResponse.setState(addressEntity.getState());
		addressResponse.setCountry(addressEntity.getCountry());
		addressResponse.setPincode(addressEntity.getPincode());
		return addressResponse;
	}
	
		
	public List<AddressResponse> convertorDataAddress (List<AddressEntity> userList){
		return userList.stream().map(user ->toAddressResponse(user)).collect(Collectors.toList());
	}
	
	public List<AddressResponse> toAddressResponseList (List<AddressEntity> userList){
		return userList.stream().map(p -> new AddressResponse(p.getId(),p.getCompanyId(),p.getCity(),p.getState(),p.getCountry(),p.getPincode()))
				.collect(Collectors.toList());
	}
	
	//Registration
	public RegistrationResponse toRegistrationResponse(final RegistrationEntity registrationEntity) {
		RegistrationResponse registrationResponse = new RegistrationResponse();
		registrationResponse.setId(registrationEntity.getId());
		registrationResponse.setCompanyId(registrationEntity.getCompanyId());
		registrationResponse.setLegalName(registrationEntity.getLegalName());
		registrationResponse.setRegistrationId(registrationEntity.getRegistrationId());
		registrationResponse.setDateOfRegister(registrationEntity.getDateOfRegister());
		return registrationResponse;
	}
	
		
	public List<RegistrationResponse> convertorDataRegistration (List<RegistrationEntity> userList){
		return userList.stream().map(user ->toRegistrationResponse(user)).collect(Collectors.toList());
		
	}
	
	public List<RegistrationResponse> toRegistrationResponseList (List<RegistrationEntity> userList){
		return userList.stream().map(p -> new RegistrationResponse(p.getId(),p.getCompanyId(),p.getLegalName(),p.getRegistrationId(),p.getDateOfRegister()))
				.collect(Collectors.toList());
		
	}
	
	
	//Users
	public UsersResponse toUsersResponse(final UsersEntity usersEntity) {
		UsersResponse usersResponse = new UsersResponse();
		usersResponse.setId(usersEntity.getId());
		usersResponse.setCompanyId(usersEntity.getCompanyId());
		usersResponse.setFirstName(usersEntity.getFirstName());
		usersResponse.setLastName(usersEntity.getLastName());
		usersResponse.setType(usersEntity.getType());
		usersResponse.setEmail(usersEntity.getEmail());
		return usersResponse;
	}
	
		
	public List<UsersResponse> convertorDataUsers (List<UsersEntity> userList){
		return userList.stream().map(user ->toUsersResponse(user)).collect(Collectors.toList());
		
	}
	
	public List<UsersResponse> toUsersResponseList (List<UsersEntity> userList){
		return userList.stream().map(p -> new UsersResponse(p.getId(),p.getCompanyId(),p.getFirstName(),p.getLastName(),p.getType(),p.getEmail()))
				.collect(Collectors.toList());
		
	}
	
	
	
	

}
