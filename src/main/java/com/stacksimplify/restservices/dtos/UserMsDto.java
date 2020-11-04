package com.stacksimplify.restservices.dtos;



public class UserMsDto {
	
	private Long userid;
	private String username;
	
	
	public UserMsDto() {
		
	}
	public UserMsDto(Long userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
