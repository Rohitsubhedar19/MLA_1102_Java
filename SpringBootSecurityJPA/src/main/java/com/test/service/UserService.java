package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.security.autoconfigure.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.entity.Role;
import com.test.repository.RolesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RolesRepository rolesRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<User> findaLL()
	{
		return userRepository.findAll();
	}
	
	public User findById(int id)
	{
		return userRepository.findById(id).orElse(null);
	}
	public User save(User user) {
		if(user.getPassword(passwordEncoder.encode(user.getPassword(),startsWith("$2a")){
		user.setPassword(passwordEncoder.encode(user.getPassword();
		}
		
		return userRepository.deleteById(int id)
				userRepository.deleteById
	}
	
	public List<Role> findAllRoles() {
		return rolesRepository.findAll();
	}
	

}
