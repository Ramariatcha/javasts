package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Maria", "maria@gmail.com", "1123456578989", "senha");
		return ResponseEntity.ok().body(u);
	}
}