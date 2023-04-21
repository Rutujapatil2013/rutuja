package com.Company.entity;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.annotations.ForeignKey;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="company_table")
public class CompanyEntity {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id")
	 private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "reg_id")
    private RegistrationEntity registration;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id")
	private AddressEntity address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "use_id")
	private List<UsersEntity> users=new ArrayList<>();
	
	
	@Column(name="companyId")
	 private Long companyId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="isDeleted")
	private Boolean isDeleted;
	

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

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public RegistrationEntity getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationEntity registration) {
		this.registration  = registration ;
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

	public CompanyEntity( Long id, Long companyId, String companyName, String phoneNumber, Boolean isDeleted,RegistrationEntity registration, AddressEntity address,List<UsersEntity> users) {
		super();
		this.id=id;
		this.companyId=companyId;
		this.companyName=companyName;
		this.phoneNumber=phoneNumber;
		this.isDeleted=isDeleted;
		this.registration=registration;
		this.address=address;
		this.users=users;
		for (UsersEntity user : users) {
            user.setCompanyUsers(this);
        }
	}

	public CompanyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
