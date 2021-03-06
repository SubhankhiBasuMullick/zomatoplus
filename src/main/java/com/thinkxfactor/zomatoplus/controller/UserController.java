package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repositories.UserRepositories;


@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	private UserRepositories userRepositories; // declaring the interface
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepositories.save(user);
		return persistedUser;
	}
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> users=userRepositories.findAll();
		return users;
	}
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		User persistedUser=userRepositories.findByUsernameAndPassword(user.getUsername(),user.getPassword());
		return persistedUser;
	}
}


	

