package com.shepherd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Scores;
import com.shepherd.entity.User;
import com.shepherd.mapper.UserMapper;
import com.shepherd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	private UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public User GetOneUser(User user) {

		User userCall = userMapper.GetOneUser(user);
		
		return userCall;
	}


	@Override
	public int AddOne(User user) {
		int i = userMapper.AddOne(user);
		return i;
	}


	@Override
	public List<Scores> getScores(int ID) {

		List<Scores> scores = userMapper.getScores(ID);
		return scores;
	}


	
	
}
