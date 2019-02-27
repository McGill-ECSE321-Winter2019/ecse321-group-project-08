package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

import ca.mcgill.ecse321.cooperator.model.Event;

public class EmployerDto {

	private int id;
	private String username;
	private String password;
	private List<Event> events;

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
	
//Set methods
	
	public void setEvents(List<Event> events) {
		this.events=events;
	}
	
	
}
