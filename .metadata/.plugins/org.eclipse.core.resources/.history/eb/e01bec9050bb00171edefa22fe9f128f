package com.suhas.eventmanagement.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.suhas.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
	
	List<Event>findByName(@Param("name ")String name);

}
