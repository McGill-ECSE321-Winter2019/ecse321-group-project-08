package ca.mcgill.ecse321.cooperator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.mcgill.ecse321.cooperator.dto.CoopPlacementFormDto;
import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;


@CrossOrigin(origins = "*")
@RestController
public class CooperatorAppApplicationController {

	@Autowired
	CooperatorService cooperatorService;
		
//CoopPlacementForm

	//create CoopPlacementForm
//	@PostMapping(value = { "/CoopPlacementForm/{id}", "/CoopPlacementForm/{id}/" })	
//	public CoopPlacementFormDto createCoopPlacementForm(@PathVariable("id") int id) throws IllegalArgumentException {
//		// @formatter:on
//		CoopPlacementForm coopPlacementForm = cooperatorService.createCoopPlacementForm(id);
//		return convertToDto(coopPlacementForm);
//	}
	
	
	
	
//	private CoopPlacementFormDto convertToDto(CoopPlacementForm p) {
//		if (p == null) {
//			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
//		}
//		CoopPlacementFormDto coopPlacementFormDto = new CoopPlacementForm(p.getCoopPlacementFormID());
//		return coopPlacementFormDto;
//	}
//	
	
	
}
