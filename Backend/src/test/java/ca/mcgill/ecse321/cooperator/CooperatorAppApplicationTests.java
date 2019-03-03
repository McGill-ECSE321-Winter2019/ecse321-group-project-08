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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
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
import ca.mcgill.ecse321.cooperator.model.Employer;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.After;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CooperatorAppApplicationTests {
	
	@Mock
	CooperatorService serviceMock;
	
	@InjectMocks
	CooperatorService service;


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

	@Test
    public void contextLoads() {
    }
	
	private Event event;
	private static final String EVENT_KEY = "TestEvent";
	private static final String NONEXISTING_KEY = "NotAnEvent";

	@Before
	public void setMockOutput() {
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
	public void setupMock() {
		event = mock(Event.class);
	}

	@Test
	public void testMockPersonCreation() {
		assertNotNull(event);
	}

	@Test
	public void testPersonQueryFound() {
	 assertEquals(EVENT_KEY, service.getEvent(EVENT_KEY).getName());
	}
}



