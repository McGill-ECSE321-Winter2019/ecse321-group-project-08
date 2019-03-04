package ca.mcgill.ecse321.cooperator;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ca.mcgill.ecse321.cooperator.controller.CooperatorAppApplicationController;
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
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.After;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CooperatorAppApplicationTests{
	
	@Mock
	CooperatorService serviceMock;
	
	@InjectMocks
	CooperatorService service;
	
	@InjectMocks
	CooperatorAppApplicationController controller;

	@Mock
	CoopPlacementFormRepository  coopPlacementFormRepositoryDao;
	
	@Mock
	CoopPositionRepository coopPositionRepositoryDao;
	
	@Mock
	EmployerRepository employerRepositoryDao;
	
	@Mock
	EvaluationFormRepository evaluationFormRepositoryDao;
	
	@Mock
	EventRepository eventRepositoryDao;
	
	@Mock
	StartConfirmationRepository startConfirmationRepositoryDao;
	
	@Mock
	StudentRepository studentRepositoryDao;
	
	@Mock
	TaxCreditFormRepository taxCreditFormRepositoryDao;


	private Event event;
	private static final String EVENT_KEY = "TestEvent";

	private CoopPlacementForm coopplacementform;
	private static final int COOPPLACEMENTFORM_KEY = 2;

	private CoopPosition coopposition;
	private static final int COOPPOSITION_KEY = 1;

	private Employer employer;
	private static final int EMPLOYER_KEY = 2;
	
	private EvaluationForm evaluationform;
	private static final int EVALUATIONFORM_KEY = 1;
	
	private StartConfirmation startconfirmation;
	private static final int STARTCONFIRMATION_KEY = 2;
	
	private Student student;
	private static final int STUDENT_KEY = 5;
	
	private TaxCreditForm taxcreditform;
	private static final int TAXCREDITFORM_KEY = 2;

	@Before
	public void setCoopPlacementFormMockOutput() {
	  when(coopPlacementFormRepositoryDao.findByCoopPlacementFormID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(COOPPLACEMENTFORM_KEY)) {
	      CoopPlacementForm coopplacementform = new CoopPlacementForm();
	      coopplacementform.setCoopPlacementFormID(COOPPLACEMENTFORM_KEY);
	      return coopplacementform;
	    } else {
	      return null;
	    }
	  });
	}
	
	@Before
	public void setEventMockOutput() {
	  when(eventRepositoryDao.findByName(anyString())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(EVENT_KEY)) {
	      Event event = new Event();
	      event.setName(EVENT_KEY);
	      return event;
	    } else {
	      return null;
	    }
	  });
	}

	@Before
	public void setCoopPositionMockOutput() {
	  when(coopPositionRepositoryDao.findByPositionID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(COOPPOSITION_KEY)) {
	      CoopPosition coopposition = new CoopPosition();
	      coopposition.setPositionID(COOPPOSITION_KEY);
	      return coopposition;
	    } else {
	      return null;
	    }
	  });
	}
	
	@Before
	public void setEmployerMockOutput() {
	  when(employerRepositoryDao.findByEmployeeID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(EMPLOYER_KEY)) {
	      Employer employer = new Employer();
	      employer.setEmployeeID(EMPLOYER_KEY);
	      return employer;
	    } else {
	      return null;
	    }
	  });
	}
	

	@Before
	public void setEvaluationFormMockOutput() {
	  when(evaluationFormRepositoryDao.findByEvaluationFormID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(EVALUATIONFORM_KEY)) {
	      EvaluationForm evaluationform = new EvaluationForm();
	      evaluationform.setEvaluationFormID(EVALUATIONFORM_KEY);
	      return evaluationform;
	    } else {
	      return null;
	    }
	  });
	}
	
	@Before
	public void setStartConfirmationMockOutput() {
	  when(startConfirmationRepositoryDao.findByConfirmationID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(STARTCONFIRMATION_KEY)) {
	      StartConfirmation startconfirmation = new StartConfirmation();
	      startconfirmation.setConfirmationID(STARTCONFIRMATION_KEY);
	      return startconfirmation;
	    } else {
	      return null;
	    }
	  });
	}
	
	@Before
	public void setStudentMockOutput() {
	  when(studentRepositoryDao.findByStudentID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(STUDENT_KEY)) {
	      Student student = new Student();
	      student.setStudentID(STUDENT_KEY);
	      return student;
	    } else {
	      return null;
	    }
	  });
	}

	@Before
	public void setTaxCreditFormMockOutput() {
	  when(taxCreditFormRepositoryDao.findByTaxCreditFormID(anyInt())).thenAnswer( (InvocationOnMock invocation) -> {
	    if(invocation.getArgument(0).equals(TAXCREDITFORM_KEY)) {
	      TaxCreditForm taxcreditform = new TaxCreditForm();
	      taxcreditform.setTaxCreditFormID(TAXCREDITFORM_KEY);
	      return taxcreditform;
	    } else {
	      return null;
	    }
	  });
	}
	
	
	@Before
	public void setupMock() {
		event = mock(Event.class);
		coopplacementform = mock(CoopPlacementForm.class);
		coopposition = mock(CoopPosition.class);
		employer = mock(Employer.class);
		evaluationform = mock(EvaluationForm.class);
		startconfirmation = mock(StartConfirmation.class);
		student = mock(Student.class);
		taxcreditform = mock(TaxCreditForm.class);
		
	}

	@Test
	public void testMockEventCreation() {
		assertNotNull(event);
	}
	@Test
	public void testMockCoopPlacementFormCreation() {
		assertNotNull(coopplacementform);
	}
	@Test
	public void testMockCoopPositionCreation() {
		assertNotNull(coopposition);
	}
	@Test
	public void testMockEmployerCreation() {
		assertNotNull(employer);
	}
	@Test
	public void testMockEvaluationFormCreation() {
		assertNotNull(evaluationform);
	}
	@Test
	public void testMockStartConfirmationCreation() {
		assertNotNull(startconfirmation);
	}
	@Test
	public void testMockStudentCreation() {
		assertNotNull(student);
	}
	
	@Test
	public void testMockTaxCreditFormCreation() {
		assertNotNull(taxcreditform);
	}

	@Test
	public void testEventQueryFound() {
	 assertEquals(EVENT_KEY, service.getEvent(EVENT_KEY).getName());
	}
	
	@Test
	public void testCoopPlacementFormQueryFound() {
		 assertEquals(COOPPLACEMENTFORM_KEY, service.getCoopPlacementForm(COOPPLACEMENTFORM_KEY).getCoopPlacementFormID());
	}
	@Test
	public void testCoopPositionQueryFound() {
	 assertEquals(COOPPOSITION_KEY, service.getCoopPosition(COOPPOSITION_KEY).getPositionID());
	}
	@Test
	public void testEmployerQueryFound() {
	 assertEquals(EMPLOYER_KEY, service.getEmployer(EMPLOYER_KEY).getEmployeeID());
	}
	@Test
	public void testEvaluationFormQueryFound() {
	 assertEquals(EVALUATIONFORM_KEY, service.getEvaluationForm(EVALUATIONFORM_KEY).getEvaluationFormID());
	}
	@Test
	public void testStartConfirmationQueryFound() {
	 assertEquals(STARTCONFIRMATION_KEY, service.getStartConfirmation(STARTCONFIRMATION_KEY).getConfirmationID());
	}
	@Test
	public void testStudentQueryFound() {
	 assertEquals(STUDENT_KEY, service.getStudent(STUDENT_KEY).getStudentID());
	}
	@Test
	public void testTaxCreditFormQueryFound() {
	 assertEquals(TAXCREDITFORM_KEY, service.getTaxCreditForm(TAXCREDITFORM_KEY).getTaxCreditFormID());
	}

	
}



