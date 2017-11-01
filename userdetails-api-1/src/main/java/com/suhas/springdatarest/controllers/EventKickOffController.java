package com.suhas.springdatarest.controllers;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suhas.springdatarest.entities.User;
import com.suhas.springdatarest.repos.UserRepository;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	private UserRepository userRepository;

	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
		User user = userRepository.findOne(id);

		if (user == null) {
			throw new ResourceNotFoundException();
		}

		return ResponseEntity.ok(user.getSchoolName() + "" + user.getCompanyName());

	}

}
