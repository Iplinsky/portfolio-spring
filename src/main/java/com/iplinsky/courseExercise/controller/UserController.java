package com.iplinsky.courseExercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iplinsky.courseExercise.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Maria", "maria@gmail.com", "5534999999999", "123456789");
		return ResponseEntity.ok().body(user);
	}

}
