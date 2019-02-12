package ca.mcgill.ecse321.cooperator;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ca.mcgill.ecse321.cooperator.dao.CoopPlacementFormRepository;
import ca.mcgill.ecse321.cooperator.dao.CoopPositionRepository;
import ca.mcgill.ecse321.cooperator.dao.EmployerRepository;
import ca.mcgill.ecse321.cooperator.dao.EvaluationFormRepository;
import ca.mcgill.ecse321.cooperator.dao.EventRepository;
import ca.mcgill.ecse321.cooperator.dao.StartConfirmationRepository;
import ca.mcgill.ecse321.cooperator.dao.StudentRepository;
import ca.mcgill.ecse321.cooperator.dao.TaxCreditFormRepository;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CooperatorAppApplicationTests {

//	@Autowired
//	CooperatorService cooperatorService;
//
//	@Autowired
//	CoopPlacementFormRepository  coopPlacementFormRepository;
//	
//	@Autowired
//	CoopPositionRepository coopPositionRepository;
//	
//	@Autowired
//	EmployerRepository employerRepository;
//	
//	@Autowired
//	EvaluationFormRepository evaluationFormRepository;
//	
//	@Autowired
//	EventRepository eventRepository;
//	
//	@Autowired 
//	StartConfirmationRepository startConfirmationRepository;
//	
//	@Autowired
//	StudentRepository studentRepository;
//	
//	@Autowired
//	TaxCreditFormRepository taxCreditFormRepository;

	@Test
	public void contextLoads() {

	}

//	@After
//	public void clearDatabase() {		
//		coopPlacementFormRepository.deleteAll();		
//		coopPositionRepository.deleteAll();		
//		employerRepository.deleteAll();		
//		evaluationFormRepository.deleteAll();		
//		eventRepository.deleteAll();	
//		startConfirmationRepository.deleteAll();	
//		studentRepository.deleteAll();	
//		taxCreditFormRepository.deleteAll();
//	}
//	

//Tests for CoopPlacementForm	
//	
//	@Test
//	public void testCreateCoopPlacementForm() {
//		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());   
//		
//		Integer id = 22;
//
//		try {
//			cooperatorService.createCoopPlacementForm(id);
//		} catch (IllegalArgumentException e) {
//			// Check that no error occurred
//			fail();
//		}
//
//		List<CoopPlacementForm> allCoopPlacementForms = cooperatorService.getAllCoopPlacementForms();
//
//		assertEquals(1, allCoopPlacementForms.size());
//	}
//	
//	
//	@Test
//	public void testCreateCreateCoopPlacementFormZero() {
//		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());
//		
//		Integer ID = 0;
//		String error= null;
//
//		try {
//			cooperatorService.createCoopPlacementForm(ID);
//		} catch (IllegalArgumentException e) {
//			error = e.getMessage();
//		}
//
//		assertEquals("Coop Placement Form ID can't be 0", error);
//		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());
//
//	}
//	

}
