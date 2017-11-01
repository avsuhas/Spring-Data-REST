package com.suhas.springdatarest.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.springdatarest.entities.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}
