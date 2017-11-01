package com.suhas.eventmanagement.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Organizer extends AbstractEntity {
	
	private String name;
	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Organizer) obj).id);
	}
	
	public int hashCode() {
		return Objects.hash(id);

	}
	

}
