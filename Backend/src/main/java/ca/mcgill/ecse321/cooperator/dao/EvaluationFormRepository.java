package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.EvaluationForm;

public interface EvaluationFormRepository extends CrudRepository<EvaluationForm, Integer>{

	EvaluationForm findEvaluationFormByID(Integer ID);
	
}
