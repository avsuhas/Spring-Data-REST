package com.suhas.springdatarest.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.springdatarest.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	

}
