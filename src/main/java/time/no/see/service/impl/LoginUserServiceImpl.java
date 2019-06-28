package time.no.see.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import time.no.see.mapper.UserMapper;
import time.no.see.model.User;
import time.no.see.service.LoginUserService;

@Service
public class LoginUserServiceImpl implements LoginUserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserByUsername(String username) {
		User user = userMapper.getUserByUsername(username);
		return user;
	}
	
	
}
