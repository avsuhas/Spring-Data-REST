package com.suhas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.suhas.eventmanagement.entities.Participant;

public interface ParticipantEventRepository extends CrudRepository<Participant, Long> {

}
