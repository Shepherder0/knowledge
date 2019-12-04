package com.shepherd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shepherd.entity.Scores;
import com.shepherd.entity.User;

@Service
public interface UserService {

	User GetOneUser(User user);
	
	int AddOne(User user);
	
	List<Scores> getScores(int ID);
}
