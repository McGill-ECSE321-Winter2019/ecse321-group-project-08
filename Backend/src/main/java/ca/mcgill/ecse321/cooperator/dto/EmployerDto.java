package ca.mcgill.ecse321.cooperator.dto;

import java.util.Collections;
import java.util.List;

public class EmployerDto {

	private int id;
	private String username;
	private String password;
	private List<EmployerDto> employers;

//Constructors
	
	public EmployerDto() {	
	}
	
	@SuppressWarnings("unchecked")
	public EmployerDto(int id ,String name, String password) {
		this(id, name, password, Collections.EMPTY_LIST);
	}
	
	public EmployerDto(int id, String username, String password, List<EmployerDto> employers) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.employers=employers;
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
	
	public List<EmployerDto> getEmployers(){
		return employers;
	}
	
//Set methods
	
	public void setEmployers(List<EmployerDto> employers) {
		this.employers=employers;
	}
	
	
}
