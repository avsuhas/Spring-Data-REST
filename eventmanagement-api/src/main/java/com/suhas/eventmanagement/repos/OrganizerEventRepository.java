package com.suhas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.eventmanagement.entities.Organizer;

public interface OrganizerEventRepository extends CrudRepository<Organizer, Long> {

}
