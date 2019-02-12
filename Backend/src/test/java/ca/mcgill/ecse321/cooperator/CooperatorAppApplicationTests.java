package ca.mcgill.ecse321.cooperator;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.After;

import ca.mcgill.ecse321.cooperator.dao.CoopPlacementFormRepository;
import ca.mcgill.ecse321.cooperator.dao.CoopPositionRepository;
import ca.mcgill.ecse321.cooperator.dao.EmployerRepository;
import ca.mcgill.ecse321.cooperator.dao.EvaluationFormRepository;
import ca.mcgill.ecse321.cooperator.dao.EventRepository;
import ca.mcgill.ecse321.cooperator.dao.StartConfirmationRepository;
import ca.mcgill.ecse321.cooperator.dao.StudentRepository;
import ca.mcgill.ecse321.cooperator.dao.TaxCreditFormRepository;
import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;
import ca.mcgill.ecse321.cooperator.model.CoopPosition;
import ca.mcgill.ecse321.cooperator.model.Employer;
import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.model.StartConfirmation;
import ca.mcgill.ecse321.cooperator.model.Student;
import ca.mcgill.ecse321.cooperator.model.TaxCreditForm;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CooperatorAppApplicationTests {

	@Autowired
	CooperatorService cooperatorService;

	@Autowired
	CoopPlacementFormRepository  coopPlacementFormRepository;
	
	@Autowired
	CoopPositionRepository coopPositionRepository;
	
	@Autowired
	EmployerRepository employerRepository;
	
	@Autowired
	EvaluationFormRepository evaluationFormRepository;
	
	@Autowired
	EventRepository eventRepository;
	
	@Autowired 
	StartConfirmationRepository startConfirmationRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TaxCreditFormRepository taxCreditFormRepository;



	@After
	public void clearDatabase() {		
		coopPlacementFormRepository.deleteAll();		
		coopPositionRepository.deleteAll();		
		employerRepository.deleteAll();		
		evaluationFormRepository.deleteAll();		
		eventRepository.deleteAll();	
		startConfirmationRepository.deleteAll();	
		studentRepository.deleteAll();	
		taxCreditFormRepository.deleteAll();
	}
	
	
// Tests for CoopPlacementForm	
	
	@Test
	public void testCreateCoopPlacementForm() {
		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());   
		
		Integer id = 22;

		try {
			cooperatorService.createCoopPlacementForm(id);
		} catch (IllegalArgumentException e) {
			
			fail();
		}

		List<CoopPlacementForm> allCoopPlacementForms = cooperatorService.getAllCoopPlacementForms();

		assertEquals(1, allCoopPlacementForms.size());
	}
	
	
	@Test
	public void testCreateCreateCoopPlacementFormZero() {
		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());
		
		Integer ID = 0;
		String error= null;

		try {
			cooperatorService.createCoopPlacementForm(ID);
		} catch (IllegalArgumentException e) {
			error = e.getMessage();
		}

		assertEquals("Coop Placement Form ID can't be 0", error);
		assertEquals(0, cooperatorService.getAllCoopPlacementForms().size());

	}
	
//Tests for CoopPosition 
	
	@Test
	public void testCreateCoopPosition(){                      
		assertEquals(0, cooperatorService.getAllCoopPositions().size());       

		Integer id = 22;
		String PosName= "Intern";
		String compName= "Google";
		Date startDate= new Date(01-02-2019);
		Date endDate= new Date(01-05-2019);
															
		try {
			cooperatorService.createCoopPosition(id, PosName, compName, startDate, endDate);							
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<CoopPosition> allCoopPositions = cooperatorService.getAllCoopPositions();	
		
		assertEquals(1, allCoopPositions.size());	
	
		assertEquals(id, allCoopPositions.get(0).getCompanyName());		
		
	}
	
//	Tests for Employer 	
	
	@Test
	public void testCreateEmployer() {                      
		assertEquals(0, cooperatorService.getAllEmployers().size());       

		Integer id = 22;
		String userName= "Ege";
		String password= "iLoveVarro";
														
		try {
			cooperatorService.createEmployer(userName, password, id);						
															
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<Employer> allEmployers = cooperatorService.getAllEmployers();		
		
		
		assertEquals(1, allEmployers.size());						
		assertEquals(id, allEmployers.get(0).getUserName());		
		
	}
	
//	EvaluationForm
	
	@Test
	public void testCreateEvaluationForm() {                       
		assertEquals(0, cooperatorService.getAllEvaluationForm().size());       

		Integer id = 22;													
															
		try {
			cooperatorService.createEvaluationForm(id);							
			
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<EvaluationForm> allEvaluationForms = cooperatorService.getAllEvaluationForm();
		
		assertEquals(1, allEvaluationForms.size());								
	
		
		
	}
	//Event
	
	@Test
	public void testCreateEvent() {                       
		assertEquals(0, cooperatorService.getAllEvents().size());       

		String name = "Oscar";								
															
															
		try {
			cooperatorService.createEvents(name);							
			
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<Event> allEvents = cooperatorService.getAllEvents();		
		
		assertEquals(1, allEvents.size());						
		assertEquals(name, allEvents.get(0).getName());		
		
		
	}
	
	//StartConfirmation
	@Test
	public void testCreateStartConfirmation() {                       
		assertEquals(0, cooperatorService.getAllStartConfirmations().size());       

		Integer id = 22;		
		Date date= new Date(01-10-2019);
															
		try {
			cooperatorService.createStartConfirmation(date, id);							
			
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<StartConfirmation> allStartConfirmations = cooperatorService.getAllStartConfirmations();		
															
		
		
		
		assertEquals(1, allStartConfirmations.size());						
		assertEquals(id.intValue(), allStartConfirmations.get(0).getConfirmationID());		
		
		
		
	}
	
	//Student
	@Test
	public void testCreateStudent() {                      
		assertEquals(0, cooperatorService.getAllStudents().size());       

		String name = "Oscar";								
		Integer id = 22;													
										 
															
		try {
			cooperatorService.createStudent(id, name);							
			
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<Student> allStudents = cooperatorService.getAllStudents();		
		
		assertEquals(1, allStudents.size());						
		assertEquals(id.intValue(), allStudents.get(0).getStudentID());		
		
		
		
	}
	
	//TaxCreditForm
	@Test
	public void testCreateTaxCreditForm() {                       
		assertEquals(0, cooperatorService.getAllTaxCreditForm().size());       

		Integer id = 22;
															 
															
		try {
			cooperatorService.createTaxCreditForm(id);							
			
		} catch (IllegalArgumentException e) {
			// Check that no error occurred
			fail();
		}

		List<TaxCreditForm> allTaxCreditForms = cooperatorService.getAllTaxCreditForm();		
		
		
		assertEquals(1, allTaxCreditForms.size());						
		assertEquals(id.intValue(), allTaxCreditForms.get(0).getTaxCreditFormID());		
		
		
	}
	


}
	
	
	














