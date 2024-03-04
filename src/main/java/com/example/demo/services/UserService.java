package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User u) {
		return repository.save(u);
	}
	
	public void delete(Long id) {
		//Optional<User> obj = repository.findById(id);
		repository.deleteById(id);
	}
	
	public User update(Long id, User u) {
		User entity = repository.getReferenceById(id);
		entity.setEmail(u.getEmail());
		entity.setName(u.getName());
		entity.setPhone(u.getPhone());
		return repository.save(entity);
		
	}
}
