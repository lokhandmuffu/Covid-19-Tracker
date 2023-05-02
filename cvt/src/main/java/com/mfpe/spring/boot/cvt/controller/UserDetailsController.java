package com.mfpe.spring.boot.cvt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.spring.boot.cvt.model.UserDetails;
import com.mfpe.spring.boot.cvt.repos.UserDetailsRepository;
@RestController
@CrossOrigin(origins="http://localhost:5100")
public class UserDetailsController {

	@Autowired
	private UserDetailsRepository repository;
	
//	@GetMapping("/users")
//	public String getAllUsers(ModelMap model) {
//		List<UserDetails> users = (List<UserDetails>) repository.findAll();
//		model.addAttribute("users",users);
//		return "users";
//	}
	@PostMapping("/SignUp/{username}")
	public void getUser(@PathVariable String username,@RequestBody UserDetails users) {
		repository.save(users);
	}
	@GetMapping("/Login")
	public List<UserDetails> getAllUsers() {
		List<UserDetails> AllUsers = (List<UserDetails>) repository.findAll();
		return AllUsers;
	}
}
