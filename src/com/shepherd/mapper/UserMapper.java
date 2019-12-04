package com.shepherd.mapper;

import java.util.List;

import com.shepherd.entity.Scores;
import com.shepherd.entity.User;

public interface UserMapper {
	
	public User GetOneUser(User user);

	public int AddOne(User user);
	
	public List<Scores> getScores(int ID);
	
}
