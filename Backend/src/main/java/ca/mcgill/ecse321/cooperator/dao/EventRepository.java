package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.Event;


public interface EventRepository extends CrudRepository<Event, String> {

}
