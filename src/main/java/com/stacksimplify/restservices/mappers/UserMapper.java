package com.stacksimplify.restservices.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.stacksimplify.restservices.dtos.UserMsDto;
import com.stacksimplify.restservices.entities.User;

@Mapper(componentModel="Spring")
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	// user to userdto object
	
	UserMsDto userToUserDto(User user);
	
	// list of user to list of userMsdto
	
	List<UserMsDto >usersToUserDtos(List<User> users);
}
