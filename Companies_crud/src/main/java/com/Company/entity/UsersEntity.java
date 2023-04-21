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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users_table")
public class UsersEntity {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	
	 @Column(name="companyId")
	 Long companyId;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="type")
	String type;
	
	@Column(name="email")
	String email;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="use_id")
    private CompanyEntity companyUsers;

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

	public CompanyEntity getCompanyUsers() {
		return companyUsers;
	}

	public void setCompanyUsers(CompanyEntity companyUsers) {
		this.companyUsers = companyUsers;
	}

	public UsersEntity(Long id, Long companyId, String firstName, String lastName, String type, String email,
			CompanyEntity companyUsers) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.email = email;
		this.companyUsers = companyUsers;
	}

	public UsersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
}
