package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.model.StartConfirmation;

public class EmployerDto {

	private int id;
	private String username;
	private String password;
	private String company;
	private List<EventDto> events;
	private List<EvaluationFormDto> evaluationForms;
	private List<StartConfirmationDto> startConfirmations;

//Constructors
	
	public EmployerDto() {	
	}
	
	
	public EmployerDto(int id, String username, String password, String company) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.company= company;
	}
	
//Get methods
	
	public int getID() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUserName() {
		return username;
	}
	
	public String getCompany() {
		return company;
	}
	
	public List<EventDto> getEvents(){
		return events;
	}
	
	public List<EvaluationFormDto> getEvaluationForms(){
		return evaluationForms;
	}
	
	public List<StartConfirmationDto> getStartConfirmations(){
		return startConfirmations;
	}
	
//Set methods
	
	public void setEvents(List<EventDto> events) {
		this.events=events;
	}
	
	public void setEvaluationForms(List<EvaluationFormDto> EvaluationForm) {
		this.evaluationForms=EvaluationForm;
	}
	
	public void setStartConfirmations(List<StartConfirmationDto> StartConfirmation) {
		this.startConfirmations=StartConfirmation;
	}
	
	
}
