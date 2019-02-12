package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;

public interface CoopPlacementFormRepository extends CrudRepository<CoopPlacementForm, Integer>{

	CoopPlacementForm findByCoopPlacementFormID(Integer ID);
	
}
