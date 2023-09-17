package com.medplus.online_shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medplus.online_shopping.dto.CustomerDto;
import com.medplus.online_shopping.exceptions.InvalidPasswordException;
import com.medplus.online_shopping.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	CustomerService customerService;

	@Override
	public UserDto userLogin(int userId, String password) {
		CustomerDto customer=customerService.getCustomerDtoById(userId);
		UserDto user= new UserDto(); 
		if(!customer.getPassword().equals(password))
			throw new InvalidPasswordException();
		else {
			user.setCustomerId(userId);
			user.setPassword(password);
			user.setCustomerName(customer.getCustomerName());
			user.setRole(customer.getRole());
		}
		return user;
	}
	
	


}
