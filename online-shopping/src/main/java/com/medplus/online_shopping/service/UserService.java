package com.medplus.online_shopping.service;

import com.medplus.online_shopping.dto.UserDto;



public interface UserService {
	
	public UserDto userLogin(int userId, String password);

}
