package ca.mcgill.ecse321.cooperator.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
import ca.mcgill.ecse321.cooperator.service.InvalidInputException;


@CrossOrigin(origins = "*")
@RestController
public class CooperatorAppApplicationController {

	@Autowired
	CooperatorService service;
	private ArrayList<Integer> list;

	
	/*
	 * CREATE
	 */
	
	
	/**
	 * Receive POST end point for creating a new CoopPlacementForm with provided parameters.
	 * @param id - ID assigned to the CoopPlacement
	 * @return - Newly created CoopPlacementForm DTO
	 */
	
	//localhost:8080/CoopPlacementForm/123
	@PostMapping(value = { "/CoopPlacementForm/{id}", "/CoopPlacementForm/{id}/" })
	public CoopPlacementFormDto createCoopPlacementForm(@PathVariable("id") int id ) {
		CoopPlacementForm f = service.createCoopPlacementForm(id);
		return convertToDto(f);
	}
	
	/**
	 * Receive POST end point for creating a new CoopPosition with provided parameters.
	 * @param id - ID assigned to the Coop Position
	 * @param PosName - Name of the position
	 * @param compName - Name of the company 
	 * @param startDate - Start date assigned to Coop Position
	 * @param endDate - End date assigned to Coop Position
	 * @return - Newly created CoopPosition DTO
	 */
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
	
	/**
	 * Receive POST end point for creating a new Employer with provided parameters.
	 * @param id -ID assigned to Employer
	 * @param username - Unique username assigned to the Employer
	 * @param password - Password created by the employer 
	 * @return - Newly created Employer DTO
	 */
	//localhost:8080/Employer/111?username=person1&password=123
	@PostMapping(value= {"/Employer/{id}","/Employer/{id}/"})
	public EmployerDto createEmployer(@PathVariable("id") int id, @RequestParam(name = "username") String username, @RequestParam(name ="password") String password) {
		Employer e = service.createEmployer(username, password, id);
		return convertToDto(e);
	}

	/**
	 * Receive POST end point for creating a new Evaluation Form with provided parameters.
	 * @param id - ID assigned to Evaluation Form
	 * @return - Newly created Evaluation Form DTO
	 */
	//localhost:8080/EvaluationForm/01010
	@PostMapping(value= {"/EvaluationForm/{id}","/EvaluationForm/{id}/"})
	public EvaluationFormDto createEvaluationForm(@PathVariable("id") int id) {
		EvaluationForm e= service.createEvaluationForm(id);
		return convertToDto(e);
	}	
	
	/**
	 * Receive POST end point for creating a new Evaluation Form with provided parameters.
	 * @param name - Name assigned to the Event
	 * @return - Newly created Event DTO
	 */
	//localhost:8080/Event/birthday
	@PostMapping(value = { "/Event/{name}", "/Event/{name}/" })
		public EventDto createEvent(@PathVariable("name") String name) {
		Event E = service.createEvents(name);
		return convertToDto(E);
		}
	/**
	 * Receive POST end point for creating a new Start Confirmation with provided parameters.
	 * @param id - ID assigned to confirmation
	 * @param evaluationDate - Date assigned to evaluation
	 * @return -Newly created start Confirmation DTO
	 */
	//localhost:8080/StartConfirmation/10001?evaluationDate=2020-12-12
	@PostMapping(value= {"/StartConfirmation/{id}","/StartConfirmation/{id}/"})
	public StartConfirmationDto createStartConfirmation(@PathVariable("id") int id, 
			@RequestParam(name = "evaluationDate") Date evaluationDate){
		StartConfirmation s = service.createStartConfirmation(evaluationDate, id);
		return convertToDto(s);
	}


	//localhost:8080/Student/2607?name=Irmak
	/**
	 * Receive POST endpoint for creating a new Student with provided parameters.
	 * @param id - ID to be assigned to the student
	 * @param name - Student name 
	 * @return - Newly created student DTO
	 * @throws InvalidInputException - InvalidInputException thrown if ID is not unique. 
	 */
	 @PostMapping(value = { "/Student/{id}", "/Student/{id}/" })
	        public StudentDto createStudentDto(@PathVariable("id") int id,
	        		@RequestParam("name") String name) throws InvalidInputException{
		 	if(service.getStudent(id) != null) throw new InvalidInputException("Student with that ID already exists!");
	        Student I = service.createStudent(id, name); 
	        return convertToDto(I);
	        }  
	 
	 
	 /**
	  * Receive POST endpoint for creating a new Tax Credit Form with provided parameters.
	  * @param id - ID to be assigned to the Tax Credit Form
	  * @return - Newly created Tax Credit Form DTO
	  */
	 //localhost:8080/TaxCreditForm/222
	 @PostMapping(value= {"/TaxCreditForm/{id}","/TaxCreditForm/{id}/" })
	 	public TaxCreditFormDto createTaxCreditForm(@PathVariable("id") int id) {
			TaxCreditForm t = service.createTaxCreditForm(id);
			return convertToDto(t);
	 	}
	
	 
	 /*
	  * GET BY PRIMARY KEY
	  */
	  
	 /**
	  *  Receive GET endpoint for getting a  Coop Placement Form with provided parameters.
	  * @param id - ID assigned to the Coop Placement Form
	  * @return -  Coop Placement Form DTO
	  */
	 //localhost:8080/CoopPlacementForm/123
	 @GetMapping(value= {"/CoopPlacementForm/{id}","/CoopPlacementForm/{id}/"})
	 public CoopPlacementFormDto getCoopPlacementFormById(@PathVariable("id") int id){
		 return convertToDto(service.getCoopPlacementForm(id));
	 }
	 /**
	  * Receive GET endpoint for getting a Coop Position with provided parameters.
	  * @param id - ID assigned to the Coop Position
	  * @return - Coop Position DTO
	  */
	//localhost:8080/CoopPosition/133
	 @GetMapping(value= {"/CoopPosition/{id}","/CoopPosition/{id}/"})
	 public CoopPositionDto getCoopPositionById(@PathVariable("id") int id) {
		 return convertToDto(service.getCoopPosition(id));
	 }
	 
	 /**
	  * Receive GET endpoint for getting a Employer with provided parameters.
	  * @param id - ID assigned to the Employer
	  * @return - Employer DTO
	  */
	 //localhost:8080/Employer/111
	 @GetMapping(value= {"/Employer/{id}","/Employer/{id}/"})
	 public EmployerDto getEmployerById(@PathVariable("id") int id) {
		 return convertToDto(service.getEmployer(id));
	 }
	 
	 /**
	  * Receive GET endpoint for getting a Evaluation Form with provided parameters.
	  * @param id - ID assigned to the Evaluation Form
	  * @return - Evaluation Form DTO
	  */
	//localhost:8080/EvaluationForm/01010
	 @GetMapping(value= {"/EvaluationForm/{id}","/EvaluationForm/{id}/"})
	 public EvaluationFormDto getEvaluationFormById(@PathVariable("id") int id) {
		 return convertToDto(service.getEvaluationForm(id));
	 }
	 
	 /**
	  * Receive GET endpoint for getting an Event with provided parameters.
	  * @param name - Name assigned to the Event
	  * @return - Event DTO
	  */
	//localhost:8080/Event/birthday
	 @GetMapping(value= {"/Event/{name}","/Event/{name/}"})
	 public EventDto getEventById(@PathVariable("name") String name) {
		 return convertToDto(service.getEvent(name));
	 }
	 
	 /**
	  * Receive GET endpoint for getting a Confirmation with provided parameters.
	  * @param id - ID assigned to the Confirmation
	  * @return - Start Confirmation DTO
	  */
	//localhost:8080/EvaluationForm/10001
	 @GetMapping(value= {"/StartConfirmation/{id}","/StartConfirmation/{id}/"})
	 public StartConfirmationDto getStartConfirmationById(@PathVariable("id") int id) {
		 return convertToDto(service.getStartConfirmation(id));		 
	 }
	 
	 /**
	  * Receive GET endpoint for getting a Student with provided parameters.
	  * @param id - ID assigned to the Student
	  * @return -Student DTO
	  */
	 //localhost:8080/Student/2607
	 @GetMapping(value= {"/Student/{id}","/Student/{id}/"})
	 public StudentDto getStudentById(@PathVariable("id") int id) {
		 return convertToDto(service.getStudent(id));		 
	 } 
	 
	 /**
	  * Receive GET endpoint for getting a Tax Credit Form with provided parameters.
	  * @param id - ID assigned to the Tax Credit Form
	  * @return - Tax Credit Form DTO
	  */
	 //localhost:8080/TaxCreditForm/222
	 @GetMapping(value= {"/TaxCreditForm/{id}","/TaxCreditForm/{id}/"})
	 public TaxCreditFormDto getTaxCreditFormById(@PathVariable("id") int id) {
		 return convertToDto(service.getTaxCreditForm(id));		 
	 } 
	 
	 
	 /*
	  * GET ALL
	  */
	 
	 /**
	  * Receive GET endpoint for getting all Coop Placement Forms.
	  * @return- All Coop Placement Form DTOs.
	  */
	//localhost:8080/CoopPlacementForm
	 @GetMapping(value = { "/CoopPlacementForm", "/CoopPlacementForm/" })
		public List<CoopPlacementFormDto> getAllCoopPlacementForms() {
		 List<CoopPlacementFormDto> coopPlacementFormDtos = new ArrayList<>();
			for (CoopPlacementForm CoopPlacementForm : service.getAllCoopPlacementForms()) {
				coopPlacementFormDtos.add(convertToDto(CoopPlacementForm));
			}
			return coopPlacementFormDtos;
		}
	 
	 /**
	  * Receive GET endpoint for getting all Coop Positions.
	  * @return - All Coop Position DTOs
	  */
	//localhost:8080/CoopPosition
	@GetMapping(value = { "/CoopPosition", "/CoopPosition/" })
	public List<CoopPositionDto> getAllCoopPositions() {
		List<CoopPositionDto> coopPositionDtos = new ArrayList<>();
		for (CoopPosition CoopPosition : service.getAllCoopPositions()) {
			coopPositionDtos.add(convertToDto(CoopPosition));
		}
		return coopPositionDtos;
	}
	
	/**
	 * Receive GET endpoint for getting all Employers
	 * @return - All Employer DTOs.
	 */
	//localhost:8080/Employer
	@GetMapping(value = { "/Employer", "/Employer/" })
	public List<EmployerDto> getAllEmployers() {
		List<EmployerDto> EmployerDtos = new ArrayList<>();
		for (Employer Employer : service.getAllEmployers()) {
			EmployerDtos.add(convertToDto(Employer));
		}
		return EmployerDtos;
	}
	 
	/**
	 * Receive GET endpoint for getting all Evaluation Forms
	 * @return - All Evaluation Forms DTOs.
	 */
	//localhost:8080/EvaluationForm
	@GetMapping(value = { "/EvaluationForm", "/EvaluationForm/" })
	public List<EvaluationFormDto> getAllEvaluationForms() {
		List<EvaluationFormDto> EvaluationFormDtos = new ArrayList<>();
		for (EvaluationForm EvaluationForm : service.getAllEvaluationForm()) {
			EvaluationFormDtos.add(convertToDto(EvaluationForm));
		}
		return EvaluationFormDtos;
	}
	 
	/**
	 * Receive GET endpoint for getting all Events
	 * @return - All Event DTOs.
	 */
	//localhost:8080/Event
	@GetMapping(value = { "/Event", "/Event/" })
	public List<EventDto> getAllEvents() {
		List<EventDto> eventDtos = new ArrayList<>();
		for (Event event : service.getAllEvents()) {
			eventDtos.add(convertToDto(event));
		}
		return eventDtos;
	}
	
	/**
	 * Receive GET endpoint for getting all Confirmations
	 * @return - All Start Confirmation  DTOs.
	 */
	//localhost:8080/StartConfirmation
	@GetMapping(value = { "/StartConfirmation", "/StartConfirmation/" })
	public List<StartConfirmationDto> getAllStartConfirmations() {
		List<StartConfirmationDto> StartConfirmationDtos = new ArrayList<>();
		for (StartConfirmation StartConfirmation : service.getAllStartConfirmations()) {
			StartConfirmationDtos.add(convertToDto(StartConfirmation));
		}
		return StartConfirmationDtos;
	}
	
	/**
	 * Receive GET endpoint for getting all Students
	 * @return - All Student DTOs
	 */
	//localhost:8080/Student
	@GetMapping(value = { "/Student", "/Student/" })
	public List<StudentDto> getAllStudents() {
		List<StudentDto> StudentDtos = new ArrayList<>();
		for (Student Student : service.getAllStudents()) {
			StudentDtos.add(convertToDto(Student));
		}
		return StudentDtos;
	}

	/**
	 * Receive GET endpoint for getting all Tax Credit Forms
	 * @return - All Tax Credit Form DTOs
	 */
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
	//localhost:8080/CoopPlacementForm/123
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	//localhost:8080/updateCoopPosition?coopPositionId=133&coopPlacementFormId=123
	@PostMapping(value = { "/updateCoopPosition", "/updateCoopPosition/" })
	public CoopPositionDto updateCoopPositionAndCoopPlacementForm(
			@RequestParam(name="coopPositionId") int cID,
			@RequestParam(name="coopPlacementFormId") int fID){
		//find the objects
		CoopPosition coopPosition= service.getCoopPosition(cID);
		CoopPlacementForm coopPlacementForm= service.getCoopPlacementForm(fID);
		//update the objects in database
		service.updateCoopPositionAndCoopPlacementForm(coopPosition, coopPlacementForm);
		//convert them to DTOs
		CoopPositionDto coopPositionDto= convertToDto(coopPosition);
		//Return the Dto
		return coopPositionDto;
	}
	
	
//Update StartConfirmation in CoopPosition
	//localhost:8080/StartConfirmation/10001?evaluationDate=2020-12-12
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	//localhost:8080/updateCP?coopPositionID=133&startConfirmationId=10001
	@PostMapping(value = { "/updateCP", "/updateCP/" })
	public StartConfirmationDto updateCoopPositionAndStartConfirmation(
			@RequestParam(name = "coopPositionID") int cID,
			@RequestParam(name = "startConfirmationId") int sID) {
		// find the objects
		CoopPosition coopPosition = service.getCoopPosition(cID);
		StartConfirmation startConfirmation= service.getStartConfirmation(sID);
		// update the objects in database
		service.updateCoopPositionAndStartConfirmation(coopPosition, startConfirmation);
		// convert them to DTOs
		CoopPositionDto coopPositionDto = convertToDto(coopPosition);
		// Return the Dto
		return convertToDto(startConfirmation);
	}
	
	
//Update TaxCredit in CoopPosition
	//localhost:8080/TaxCreditForm/222
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	//localhost:8080/updateCoop?coopPositionID=133&taxCreditFormID=222
	@PostMapping(value = { "/updateCoop", "/updateCoop/" })
	public TaxCreditFormDto updateCoopPositionAndTaxCreditForm(
			@RequestParam(name = "coopPositionID") int cID,
			@RequestParam(name = "taxCreditFormID") int sID) {
		// find the objects
		CoopPosition coopPosition = service.getCoopPosition(cID);
		TaxCreditForm taxCreditForm= service.getTaxCreditForm(sID);
		// update the objects in database
		service.updateCoopPositionAndTaxCreditForm(coopPosition, taxCreditForm);
		// convert them to DTOs
		CoopPositionDto coopPositionDto = convertToDto(coopPosition);
		// Return the Dto
		return convertToDto(taxCreditForm);
	}
	
	
//Update EvaluationForm in CoopPosition	
	//localhost:8080/EvaluationForm/01010
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	//localhost:8080/updateCoopP?coopPositionID=133&evaluationFormID=01010
	@PostMapping(value = { "/updateCoopP", "/updateCoopP/" })
	public EvaluationFormDto updateCoopPositionAndEvaluationForm(
			@RequestParam(name = "coopPositionID") int cID,
			@RequestParam(name = "evaluationFormID") int sID) {
		// find the objects
		CoopPosition coopPosition = service.getCoopPosition(cID);
		EvaluationForm evaluationForm= service.getEvaluationForm(sID);
		// update the objects in database
		service.updateCoopPositionAndEvaluationForm(coopPosition, evaluationForm);
		// convert them to DTOs
		CoopPositionDto coopPositionDto = convertToDto(coopPosition);
		// Return the Dto
		return convertToDto(evaluationForm);
	}
	
	
//Update Student in CoopPosition
	//localhost:8080/Student/2607?name=Irmak
	//localhost:8080/CoopPosition/133?PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15
	//localhost:8080/updateCoopStudent?coopPositionID=133&studentID=2607
	@PostMapping(value = { "/updateCoopStudent", "/updateCoopStudent/" })
	public StudentDto updateCoopPositionAndStudent(
			@RequestParam(name = "coopPositionID") int cID,
			@RequestParam(name = "studentID") int sID) {
		// find the objects
		CoopPosition coopPosition = service.getCoopPosition(cID);
		Student student= service.getStudent(sID);
		// update the objects in database
		service.updateCoopPositionAndStudent(coopPosition, student);
		// convert them to DTOs
		// Return the Dto
		return convertToDto(student);
	}
	
	
//Update StartConfirmation in Employer
	//localhost:8080/Employer/111?username=person1&password=123
	//localhost:8080/StartConfirmation/10001?evaluationDate=2020-12-12
	//localhost:8080/updateEmployer?employerID=111&startConfirmationID=10001
	@PostMapping(value = { "/updateEmployer", "/updateEmployer/" })
	public EmployerDto updateEmployerAndStartConfirmation(
			@RequestParam(name = "employerID") int cID,
			@RequestParam(name = "startConfirmationID") int sID) {
		// find the objects
		Employer employer = service.getEmployer(cID);
		StartConfirmation startConfirmation= service.getStartConfirmation(sID);
		// update the objects in database
		service.updateEmployerAndStartConfirmation(employer, startConfirmation);
		// convert them to DTOs
		// Return the Dto
		return convertToDto(employer);
	}	
	
	
//Update EvaluationForm in Employer
	//localhost:8080/Employer/111?username=person1&password=123
	//localhost:8080/EvaluationForm/01010
	//localhost:8080/updateEmployerEvaluationForm?employerID=111&evaluationFormID=01010
	@PostMapping(value = { "/updateEmployerEvaluationForm", "/updateEmployerEvaluationForm/" })
	public EmployerDto updateEmployerAndEvaluationForm(
			@RequestParam(name = "employerID") int cID,
			@RequestParam(name = "evaluationFormID") int sID) {
		// find the objects
		Employer employer = service.getEmployer(cID);
		EvaluationForm evaluationForm= service.getEvaluationForm(sID);
		// update the objects in database
		service.updateEmployerAndEvaluationForm(employer, evaluationForm);
		// convert them to DTOs
		// Return the Dto
		return convertToDto(employer);
	}	
	
	
	
//	CoopPlacementForm --->  CoopPlacementFormDto 

	private CoopPlacementFormDto convertToDto(CoopPlacementForm form) {
		if (form == null) {
			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
		}
		CoopPlacementFormDto coopPlacementFormDto = new CoopPlacementFormDto(form.getCoopPlacementFormID());
		if(form.getCoopPosition() != null)
			coopPlacementFormDto.setCoopPositionID(form.getCoopPosition().getPositionID());
		return coopPlacementFormDto;
	}
	

// CoopPosition ----> CoopPositionDto


	private CoopPositionDto convertToDto(CoopPosition position) {
		if (position == null) {
			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
		}
		CoopPositionDto coopPositionDto= new CoopPositionDto(position.getPositionID(),
				position.getPositionName(),position.getCompanyName(),position.getStartDate(),position.getEndDate());
		//Check if there is CoopPlacementForm
		if(position.getCoopPlacementForm() !=  null) 
			coopPositionDto.setCoopPlacementForm(convertToDto(position.getCoopPlacementForm())); 
		//Check if there is StartConfirmation
		if(position.getStartConfirmation() !=  null) 
			coopPositionDto.setStartConfirmation(convertToDto(position.getStartConfirmation())); 
		//Check if there is Student
		if(position.getStudent() !=  null) 
			coopPositionDto.setStudentID(position.getStudent().getStudentID());
		//Check if there is TaxCreditForm
		if(position.getTaxCreditForm() !=  null) 
			coopPositionDto.setTaxCreditForm(convertToDto(position.getTaxCreditForm())); 
		//Check if there is EvaluationForm
		if(position.getEvaluationForm() !=  null) 
			coopPositionDto.setEvaluationForm(convertToDto(position.getEvaluationForm())); 
	
		return coopPositionDto;
		
	}
	
//	Employer ----> EmployerDto
	
	private EmployerDto convertToDto(Employer e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such Employer!");
		}
		EmployerDto eDto= new EmployerDto(e.getEmployeeID(),e.getUserName(),e.getPassword());
		if(e.getStartConfirmation() != null) {
			List<StartConfirmationDto> startConfirmationDtosList = new ArrayList<>();
			for(StartConfirmation startConfirmation : e.getStartConfirmation()) {
				startConfirmationDtosList.add(startConfirmationDtosList.size(),convertToDto(startConfirmation));
			}
			eDto.setStartConfirmations(startConfirmationDtosList);
		}
		if(e.getEvaluationForm() != null) {
			List<EvaluationFormDto> EvaluationFormDtosList = new ArrayList<>();
			for(EvaluationForm EvaluationForm : e.getEvaluationForm()) {
				EvaluationFormDtosList.add(EvaluationFormDtosList.size(),convertToDto(EvaluationForm));
			}
			eDto.setEvaluationForms(EvaluationFormDtosList);
		}
		return eDto;
	}
	
	
//	EvaluationForm  ----> EvaluationFormDto
	
	private EvaluationFormDto convertToDto(EvaluationForm e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such EvaluationForm!");
		}
		EvaluationFormDto eDto= new EvaluationFormDto(e.getEvaluationFormID());
		if(e.getCoopPosition() != null)
			eDto.setCoopPositionID(e.getCoopPosition().getPositionID());
		if(e.getEmployer() != null)
			eDto.setEmployerID(e.getEmployer().getEmployeeID());
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
		if(start.getCoopPosition() != null)
			sDto.setCoopPositionID(start.getCoopPosition().getPositionID());
		if(start.getEmployer()!= null)
			sDto.setEmployerID(start.getEmployer().getEmployeeID());
		return sDto;
	}
	
//	Student ---> StudentDto
	
	private StudentDto convertToDto(Student e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such Student!");
		}
		StudentDto eDto= new StudentDto(e.getStudentID(),e.getStudentName());
		if(e.getCoopPosition() != null) {
			List<CoopPositionDto> CoopPositionDtosList = new ArrayList<>();
			for(CoopPosition CoopPosition : e.getCoopPosition()) {
				CoopPositionDtosList.add(CoopPositionDtosList.size(),convertToDto(CoopPosition));
			}
			eDto.setCoopPosition(CoopPositionDtosList);
		}
		return eDto;
	}


//	TaxCreditForm ---> 	TaxCreditFormDto
	
	private TaxCreditFormDto convertToDto(TaxCreditForm e) {
		if (e == null) {
			throw new IllegalArgumentException("There is no such TaxCreditForm!");
		}
		TaxCreditFormDto tDto= new TaxCreditFormDto(e.getTaxCreditFormID());
		if(e.getCoopPosition() != null)
			tDto.setCoopPositionID(e.getCoopPosition().getPositionID());
		return tDto;
	}

}

