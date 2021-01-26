package com.scb.bank.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.bank.dto.UserResponseDto;
import com.scb.bank.entity.User;
import com.scb.bank.service.UserService;
import com.scb.bank.repository.*;

@Service
public class UserServiceImpl implements UserService{
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserResponseDto> getCustomUser(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserById(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
