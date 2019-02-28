package ca.mcgill.ecse321.cooperator.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.mcgill.ecse321.cooperator.dto.CoopPlacementFormDto;
import ca.mcgill.ecse321.cooperator.dto.CoopPositionDto;
import ca.mcgill.ecse321.cooperator.dto.EmployerDto;
import ca.mcgill.ecse321.cooperator.dto.EvaluationFormDto;
import ca.mcgill.ecse321.cooperator.dto.EventDto;
import ca.mcgill.ecse321.cooperator.dto.StartConfirmationDto;
import ca.mcgill.ecse321.cooperator.dto.StudentDto;
import ca.mcgill.ecse321.cooperator.dto.TaxCreditFormDto;
import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;
import ca.mcgill.ecse321.cooperator.model.CoopPosition;
import ca.mcgill.ecse321.cooperator.model.Employer;
import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.model.StartConfirmation;
import ca.mcgill.ecse321.cooperator.model.Student;
import ca.mcgill.ecse321.cooperator.model.TaxCreditForm;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;


@CrossOrigin(origins = "*")
@RestController
public class CooperatorAppApplicationController {

	@Autowired
	CooperatorService service;

	
	/*
	 * CREATE
	 */
	
	
//CoopPlacementFormDto Creation
	//localhost:8080/CoopPlacementForm/123
	@PostMapping(value = { "/CoopPlacementForm/{id}", "/CoopPlacementForm/{id}/" })
	public CoopPlacementFormDto createCoopPlacementForm(@PathVariable("id") int id ) {
		CoopPlacementForm f = service.createCoopPlacementForm(id);
		return convertToDto(f);
	}
	
	
//CoopPositionDto Creation
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	@PostMapping(value = { "/CoopPosition/{id}", "/CoopPosition/{id}/" })
	public CoopPositionDto createCoopPosition(@PathVariable("id") int id,
			@RequestParam(name = "PositionName") String PosName,
			@RequestParam(name ="CompanyName") String compName,
			@RequestParam("startDate") Date startDate,
			@RequestParam("endDate") Date endDate){
		CoopPosition cp = service.createCoopPosition(id, PosName, compName, startDate, endDate);
	   return convertToDto(cp);		
	}
	
	
//EmployerDto creation
	//localhost:8080/Employer/111?username=person1&password=123
	@PostMapping(value= {"/Employer/{id}","/Employer/{id}/"})
	public EmployerDto createEmployer(@PathVariable("id") int id, @RequestParam(name = "username") String username, @RequestParam(name ="password") String password) {
		Employer e = service.createEmployer(username, password, id);
		return convertToDto(e);
	}

	
//EvaluationFormDto creation
	//localhost:8080/EvaluationForm/01010
	@PostMapping(value= {"/EvaluationForm/{id}","/EvaluationForm/{id}/"})
	public EvaluationFormDto createEvaluationForm(@PathVariable("id") int id) {
		EvaluationForm e= service.createEvaluationForm(id);
		return convertToDto(e);
	}	
	
	
//EventDto Creation
	//localhost:8080/Event/birthday
	@PostMapping(value = { "/Event/{name}", "/Event/{name}/" })
		public EventDto createEvent(@PathVariable("name") String name) {
		Event E = service.createEvents(name);
		return convertToDto(E);
		}
	
//StartConfirmation Creation
	//localhost:8080/StartConfirmation/10001?evaluationDate=2020-12-12
	@PostMapping(value= {"/StartConfirmation/{id}","/StartConfirmation/{id}/"})
	public StartConfirmationDto createStartConfirmation(@PathVariable("id") int id, 
			@RequestParam(name = "evaluationDate") Date evaluationDate){
		StartConfirmation s = service.createStartConfirmation(evaluationDate, id);
		return convertToDto(s);
	}


	//Student Creation
	//localhost:8080/Student/2607?name=Irmak
	 @PostMapping(value = { "/Student/{id}", "/Student/{id}/" })
	        public StudentDto createStudentDto(@PathVariable("id") int id,
	        		@RequestParam("name") String name) {
	        Student I = service.createStudent(id, name); 
	        return convertToDto(I);
	        }  
//TaxCreditForm Creation
	 //localhost:8080/TaxCreditForm/222
	 @PostMapping(value= {"/TaxCreditForm/{id}","/TaxCreditForm/{id}/" })
	 	public TaxCreditFormDto createTaxCreditForm(@PathVariable("id") int id) {
			TaxCreditForm t = service.createTaxCreditForm(id);
			return convertToDto(t);
	 	}
	
	 
	 /*
	  * GET BY PRIMARY KEY
	  */
	  
	 
//CoopPlacementForm get by ID
	 //localhost:8080/CoopPlacementForm/123
	 @GetMapping(value= {"/CoopPlacementForm/{id}","/CoopPlacementForm/{id}/"})
	 public CoopPlacementFormDto getCoopPlacementFormById(@PathVariable("id") int id){
		 return convertToDto(service.getCoopPlacementForm(id));
	 }
	 
//CoopPosition get by ID
	//localhost:8080/CoopPosition/133
	 @GetMapping(value= {"/CoopPosition/{id}","/CoopPosition/{id}/"})
	 public CoopPositionDto getCoopPositionById(@PathVariable("id") int id) {
		 return convertToDto(service.getCoopPosition(id));
	 }
	 
//Employer get by ID
	 //localhost:8080/Employer/111
	 @GetMapping(value= {"/Employer/{id}","/Employer/{id}/"})
	 public EmployerDto getEmployerById(@PathVariable("id") int id) {
		 return convertToDto(service.getEmployer(id));
	 }
	 
//EvaluationForm get by ID
	//localhost:8080/EvaluationForm/01010
	 @GetMapping(value= {"/EvaluationForm/{id}","/EvaluationForm/{id}/"})
	 public EvaluationFormDto getEvaluationFormById(@PathVariable("id") int id) {
		 return convertToDto(service.getEvaluationForm(id));
	 }
	 
//Event get by name
	//localhost:8080/Event/birthday
	 @GetMapping(value= {"/Event/{name}","/Event/{name/}"})
	 public EventDto getEventById(@PathVariable("name") String name) {
		 return convertToDto(service.getEvent(name));
	 }
	 
//StartConfirmation get by id
	//localhost:8080/EvaluationForm/10001
	 @GetMapping(value= {"/StartConfirmation/{id}","/StartConfirmation/{id}/"})
	 public StartConfirmationDto getStartConfirmationById(@PathVariable("id") int id) {
		 return convertToDto(service.getStartConfirmation(id));		 
	 }
	 
//Student get by id
	 //localhost:8080/Student/2607
	 @GetMapping(value= {"/Student/{id}","/Student/{id}/"})
	 public StudentDto getStudentById(@PathVariable("id") int id) {
		 return convertToDto(service.getStudent(id));		 
	 } 
	 
//TaxCreditForm get by id
	 @GetMapping(value= {"/TaxCreditForm/{id}","/TaxCreditForm/{id}/"})
	 public TaxCreditFormDto getTaxCreditFormById(@PathVariable("id") int id) {
		 return convertToDto(service.getTaxCreditForm(id));		 
	 } 
	 
	 
	 /*
	  * GET ALL
	  */
	 
	 
//Get All CoopPlacementForms 
	//localhost:8080/CoopPlacementForm
	 @GetMapping(value = { "/CoopPlacementForm", "/CoopPlacementForm/" })
		public List<CoopPlacementFormDto> getAllCoopPlacementForms() {
		 List<CoopPlacementFormDto> coopPlacementFormDtos = new ArrayList<>();
			for (CoopPlacementForm CoopPlacementForm : service.getAllCoopPlacementForms()) {
				coopPlacementFormDtos.add(convertToDto(CoopPlacementForm));
			}
			return coopPlacementFormDtos;
		}
	 
//Get All CoopPositions 
	//localhost:8080/CoopPosition
	@GetMapping(value = { "/CoopPosition", "/CoopPosition/" })
	public List<CoopPositionDto> getAllCoopPositions() {
		List<CoopPositionDto> coopPositionDtos = new ArrayList<>();
		for (CoopPosition CoopPosition : service.getAllCoopPositions()) {
			coopPositionDtos.add(convertToDto(CoopPosition));
		}
		return coopPositionDtos;
	}
	
//Get All Employers
	//localhost:8080/Employer
	@GetMapping(value = { "/Employer", "/Employer/" })
	public List<EmployerDto> getAllEmployers() {
		List<EmployerDto> EmployerDtos = new ArrayList<>();
		for (Employer Employer : service.getAllEmployers()) {
			EmployerDtos.add(convertToDto(Employer));
		}
		return EmployerDtos;
	}
	 
//Get All EvaluationForms
	//localhost:8080/EvaluationForm
	@GetMapping(value = { "/EvaluationForm", "/EvaluationForm/" })
	public List<EvaluationFormDto> getAllEvaluationForms() {
		List<EvaluationFormDto> EvaluationFormDtos = new ArrayList<>();
		for (EvaluationForm EvaluationForm : service.getAllEvaluationForm()) {
			EvaluationFormDtos.add(convertToDto(EvaluationForm));
		}
		return EvaluationFormDtos;
	}
	 
//Get All Events
	//localhost:8080/Event
	@GetMapping(value = { "/Event", "/Event/" })
	public List<EventDto> getAllEvents() {
		List<EventDto> eventDtos = new ArrayList<>();
		for (Event event : service.getAllEvents()) {
			eventDtos.add(convertToDto(event));
		}
		return eventDtos;
	}
	
//Get All StartConfirmations
	//localhost:8080/StartConfirmation
	@GetMapping(value = { "/StartConfirmation", "/StartConfirmation/" })
	public List<StartConfirmationDto> getAllStartConfirmations() {
		List<StartConfirmationDto> StartConfirmationDtos = new ArrayList<>();
		for (StartConfirmation StartConfirmation : service.getAllStartConfirmations()) {
			StartConfirmationDtos.add(convertToDto(StartConfirmation));
		}
		return StartConfirmationDtos;
	}
	
//Get All Students
	//localhost:8080/Student
	@GetMapping(value = { "/Student", "/Student/" })
	public List<StudentDto> getAllStudents() {
		List<StudentDto> StudentDtos = new ArrayList<>();
		for (Student Student : service.getAllStudents()) {
			StudentDtos.add(convertToDto(Student));
		}
		return StudentDtos;
	}

//Get All TaxCreditForms
	//localhost:8080/TaxCreditForm
	@GetMapping(value = { "/TaxCreditForm", "/TaxCreditForm/" })
	public List<TaxCreditFormDto> getAllTaxCreditForms() {
		List<TaxCreditFormDto> TaxCreditFormDtos = new ArrayList<>();
		for (TaxCreditForm TaxCreditForm : service.getAllTaxCreditForm()) {
			TaxCreditFormDtos.add(convertToDto(TaxCreditForm));
		}
		return TaxCreditFormDtos;
	}
	
	
	/*
	 * UPDATE INFORMATION
	 */
	
//Update CoopPlacementForm in CoopPosition
	//localhost:8080/update?coopPosition=133
	@PostMapping(value = { "/update", "/update/" })
	public CoopPositionDto setCoopPlacementFormOfCoopPosition(@ModelAttribute("coopPosition") CoopPositionDto CoopPositionDto) {
		//CoopPositionDto.setCoopPlacementForm(CoopPlacementFormDto);
		return CoopPositionDto;
	}
	
//		
////Update EvaluationForm in CoopPosition
//	//localhost:8080/CoopPosition/133?evaluationFormId=01010
//	@PutMapping(value = { "/CoopPosition/{cid}", "/CoopPosition/{cid}/" })
//	public CoopPositionDto setEvaluationFormOfCoopPosition(@PathVariable("cid") int cID,
//			@RequestParam("coopPlacementFormId") int id) {
//		EvaluationFormDto EvaluationFormDto = convertToDto(service.getEvaluationForm(id));
//		CoopPositionDto CoopPositionDto = convertToDto(service.getCoopPosition(cID));
//		EvaluationFormDto.setCoopPosition(CoopPositionDto);
//		CoopPositionDto.setEvaluationForm(EvaluationFormDto);
//		return CoopPositionDto;
//	}
	
	
	
//Update StartConfirmation in CoopPosition
//Update TaxCredit in CoopPosition
//Update Student in CoopPosition

	
	
	
//	CoopPlacementForm --->  CoopPlacementFormDto 

	private CoopPlacementFormDto convertToDto(CoopPlacementForm form) {
		if (form == null) {
			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
		}
		CoopPlacementFormDto coopPlacementFormDto = new CoopPlacementFormDto(form.getCoopPlacementFormID());
		return coopPlacementFormDto;
	}
	
// CoopPosition ----> CoopPositionForm
	
	private CoopPositionDto convertToDto(CoopPosition position) {
		if (position == null) {
			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
		}
		CoopPositionDto coopPositionDto= new CoopPositionDto(position.getPositionID(),position.getPositionName(),position.getCompanyName(),position.getStartDate(),position.getEndDate());
		return coopPositionDto;
	}
	
//	Employer ----> EmployerDto
	
	private EmployerDto convertToDto(Employer e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such Employer!");
		}
		EmployerDto eDto= new EmployerDto(e.getEmployeeID(),e.getUserName(),e.getPassword());
		return eDto;
	}
	
	
//	EvaluationForm  ----> EvaluationFormDto
	
	private EvaluationFormDto convertToDto(EvaluationForm e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such EvaluationForm!");
		}
		EvaluationFormDto eDto= new EvaluationFormDto(e.getEvaluationFormID());
		return eDto;	
	}
		
//	Event ---> EventDto
	
	private EventDto convertToDto(Event e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such Event!");
		}
		EventDto eDto= new EventDto(e.getName());
		return eDto;
	}
	
//	StartConfirmation ----> StartConfirmationDto
	
	private StartConfirmationDto convertToDto(StartConfirmation start) {
		if (start == null) {
			throw new IllegalArgumentException("There is no such StartConfirmation!");
		}
		StartConfirmationDto sDto = new StartConfirmationDto(start.getConfirmationID(), start.getEvaluationDate());
		return sDto;
	}
	
//	Student ---> StudentDto
	
	private StudentDto convertToDto(Student e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such Student!");
		}
		StudentDto eDto= new StudentDto(e.getStudentID(),e.getStudentName());
		return eDto;
	}
	
//	TaxCreditForm ---> 	TaxCreditFormDto
	
	private TaxCreditFormDto convertToDto(TaxCreditForm e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such TaxCreditForm!");
		}
		TaxCreditFormDto tDto= new TaxCreditFormDto(e.getTaxCreditFormID());
		return tDto;
	}

}

