package com.scb.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.bank.dto.UserResponseDto;
import com.scb.bank.entity.User;

@Service
public interface UserService {
	
	public void saveUser(User user);
	
	public List<User> getAllUsers();
	
	public User getUserById(Long userId);
	
	public List<User> getUsersByFirstName(String firstName);
	
	public List<User> getUsersByName(String firstName, String lastName);
	
	public List<UserResponseDto> getCustomUser(String firstName);
	
	void deleteUserById(Long userId);
	
	void updateUserById(User user);


}
