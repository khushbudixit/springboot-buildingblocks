package com.stacksimplify.restservices.dtos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.stacksimplify.restservices.entities.order;

public class UserDtoV1 {

	
	private long id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String role;
	private String ssn;
	private List<order>  Order;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public List<order> getOrder() {
		return Order;
	}
	public void setOrder(List<order> order) {
		Order = order;
	}
	public UserDtoV1() {
		
	}
	public UserDtoV1(long id, String username, String firstname, String lastname, String email, String role, String ssn,
			List<order> order) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
		Order = order;
	}

	
}