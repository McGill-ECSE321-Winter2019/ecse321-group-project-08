package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.StartConfirmation;

public interface StartConfirmationRepository extends CrudRepository<StartConfirmation, Integer>{

	
	StartConfirmation findStartConfirmationByID(Integer ID);
	
}
