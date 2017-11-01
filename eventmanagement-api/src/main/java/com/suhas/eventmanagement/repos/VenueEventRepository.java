package com.suhas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.eventmanagement.entities.Venue;

public interface VenueEventRepository extends CrudRepository<Venue, Long> {

}
