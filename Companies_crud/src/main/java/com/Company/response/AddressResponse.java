package com.Company.response;

public class AddressResponse {

	Long id;
	Long companyId;
	String city;
	String state;
	String country;
	String pincode;
	
	public AddressResponse( Long id, Long companyId, String city, String state, String country, String pincode) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.city=city;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
	}

	public AddressResponse() {
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
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}
