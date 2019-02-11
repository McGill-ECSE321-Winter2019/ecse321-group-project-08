package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.CoopPosition;

public interface CoopPositionRepository extends CrudRepository<CoopPosition, Integer>{

	CoopPosition findCoopPositionByID(Integer ID);
	
}
