package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
import ca.mcgill.ecse321.cooperator.model.Event;
import ca.mcgill.ecse321.cooperator.model.StartConfirmation;

public class EmployerDto {

	private int id;
	private String username;
	private String password;
	private List<Event> events;
	private List<EvaluationForm> evaluationForms;
	private List<StartConfirmation> startConfirmations;

//Constructors
	
	public EmployerDto() {	
	}
	
	
	public EmployerDto(int id, String username, String password) {
		this.id=id;
		this.username=username;
		this.password=password;
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
	
	public List<Event> getEvents(){
		return events;
	}
	
	public List<EvaluationForm> getEvaluationForms(){
		return evaluationForms;
	}
	
	public List<StartConfirmation> getStartConfirmations(){
		return startConfirmations;
	}
	
//Set methods
	
	public void setEvents(List<Event> events) {
		this.events=events;
	}
	
	public void setEvaluationForms(List<EvaluationForm> EvaluationForm) {
		this.evaluationForms=EvaluationForm;
	}
	
	public void setStartConfirmations(List<StartConfirmation> StartConfirmation) {
		this.startConfirmations=StartConfirmation;
	}
	
	
}
