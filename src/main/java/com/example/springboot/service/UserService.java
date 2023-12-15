package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.User;

public interface UserService {

	void saveUser(UserDto userDto);
	
	User findByEmail(String email);
	
	List<UserDto> findAllUsers();
}
