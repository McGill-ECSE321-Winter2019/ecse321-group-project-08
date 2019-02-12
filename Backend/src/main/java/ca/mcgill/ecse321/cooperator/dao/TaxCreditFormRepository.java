package ca.mcgill.ecse321.cooperator.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.cooperator.model.TaxCreditForm;

public interface TaxCreditFormRepository extends CrudRepository<TaxCreditForm, Integer>{

	TaxCreditForm findByTaxCreditFormID(Integer ID);
	
}
