package ca.mcgill.ecse321.cooperator.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.mcgill.ecse321.cooperator.dto.CoopPlacementFormDto;
import ca.mcgill.ecse321.cooperator.dto.CoopPositionDto;
import ca.mcgill.ecse321.cooperator.dto.EmployerDto;
import ca.mcgill.ecse321.cooperator.dto.EvaluationFormDto;
import ca.mcgill.ecse321.cooperator.dto.EventDto;
import ca.mcgill.ecse321.cooperator.dto.StartConfirmationDto;
import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;
import ca.mcgill.ecse321.cooperator.model.CoopPosition;
import ca.mcgill.ecse321.cooperator.model.Employer;
import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.model.StartConfirmation;
import ca.mcgill.ecse321.cooperator.service.CooperatorService;


@CrossOrigin(origins = "*")
@RestController
public class CooperatorAppApplicationController {

	@Autowired
	CooperatorService service;
	
	
	
//CoopPlacementFormDto Creation
	//localhost:8080/CoopPlacementForm/123?coopPosition=133
	@PostMapping(value = { "/CoopPlacementForm/{id}", "/CoopPlacementForm/{id}/" })
	public CoopPlacementFormDto createCoopPlacementForm(@PathVariable("id") int id, 
			@RequestParam(name = "coopPosition") CoopPositionDto cDto ) throws IllegalArgumentException {
		CoopPosition c = service.createCoopPosition(cDto.getID(), cDto.getPositionName(), cDto.getCompanyName(), cDto.getStartDate(), cDto.getEndDate());
		CoopPlacementForm f = service.createCoopPlacementForm(id,c);
		return convertToDto(f);
	}
	
//Success	
	
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
	//localhost:8080/Employer/Irmak/1234/2607
	@PostMapping(value= {"/Employer","/Employer/"})
	public String createEmployer(
			@RequestBody EmployerDto e) {
		return e.getPassword();
	}

//Success	
	
//EvaluationFormDto creation
	//localhost:8080/EvaluationForm/01010
	@PostMapping(value= {"/EvaluationForm/{id}","/EvaluationForm/{id}/"})
	public EvaluationFormDto createEvaluationForm(@PathVariable("id") int id) {
		EvaluationForm e= service.createEvaluationForm(id);
		return covertToDto(e);
	}	
	
	
	
//EventDto Creation
	//localhost:8080/Event/birthday
	@PostMapping(value = { "/Event/{name}", "/Event/{name}/" })
		public EventDto createEvent(@PathVariable("name") String name) {
		System.out.println("hello I am here");
		Event E = service.createEvents(name);
		return convertToDto(E);
		}
	
//StartConfirmation Creation
	//localhost:8080/StartConfirmation/10001?evaluationDate=02.02.2020?coopPosition=0101?employer=8932"
	@PostMapping(value= {"/StartConfirmation/{id}","/StartConfirmation/{id}/"})
	public StartConfirmationDto createStartConfirmation(@PathVariable("id") int id, 
			@RequestParam(name = "evaluationDate") @DateTimeFormat(pattern = "dd.MM.yyyy") Date evaluationDate,
			@RequestParam(name = "coopPosition") CoopPositionDto cDto,
			@RequestParam(name = "employer") EmployerDto eDto){
		Employer e= service.createEmployer(eDto.getUserName(),eDto.getPassword(),eDto.getID());
		CoopPosition c= service.createCoopPosition(cDto.getID(), cDto.getPositionName(), cDto.getCompanyName(), cDto.getStartDate(), cDto.getEndDate());
		StartConfirmation s = service.createStartConfirmation(evaluationDate, id, e, c);
		return convertToDto(s);
	}


	
	
//	CoopPlacementForm --->  CoopPlacementFormDto 

	private CoopPlacementFormDto convertToDto(CoopPlacementForm form) {
		if (form == null) {
			throw new IllegalArgumentException("There is no such CoopPlacementForm!");
		}
		CoopPositionDto coopPositionDto = convertToDto(form.getCoopPosition());
		CoopPlacementFormDto coopPlacementFormDto = new CoopPlacementFormDto(form.getCoopPlacementFormID(),coopPositionDto);
		return coopPlacementFormDto;
	}
	
// CoopPosition ----> CoopPositionForm
	
	private CoopPositionDto convertToDto(CoopPosition position) {
		if (position == null) {
			throw new IllegalArgumentException("There is no such CoopPlacement!");
		}
		CoopPositionDto coopPositionDto = new CoopPositionDto(position.getPositionID(),
				position.getPositionName(),position.getCompanyName(),position.getStartDate(),position.getEndDate());
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
	
	private EvaluationFormDto covertToDto(EvaluationForm e) {
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
		EmployerDto employerDto = convertToDto(start.getEmployer());
		CoopPositionDto coopPositionDto = convertToDto(start.getCoopPosition());
		StartConfirmationDto sDto= new StartConfirmationDto(start.getConfirmationID(),start.getEvaluationDate(),employerDto,coopPositionDto);
		return sDto;
	}
	
	
// getEventByName
@GetMapping(value = { "/events/{name}", "/events/{name}/" })
public EventDto getEventByName(@PathVariable("name") String name) throws IllegalArgumentException {
return convertToDto(service.getEvents(name));
}





//end of main class
}

