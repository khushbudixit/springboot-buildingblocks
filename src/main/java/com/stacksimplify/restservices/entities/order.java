package com.stacksimplify.restservices.entities;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name="orders")
public class order {

	@Id
	@GeneratedValue
	private Long orderid;
	private String OrderDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getOrderDescription() {
		return OrderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		OrderDescription = orderDescription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
