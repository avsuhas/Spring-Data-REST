package com.suhas.springdatarest.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.springdatarest.entities.School;


public interface SchoolRepository extends CrudRepository<School, Long> {


}
