package com.Company.response;


public class UsersResponse {

	Long id;
	Long companyId;
	String firstName;
	String lastName;
	String type;
	String email;
	
	public UsersResponse( Long id, Long companyId, String firstName, String lastName, String type,String email) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.type=type;
		this.email=email;
		
	}

	public UsersResponse() {
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
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
