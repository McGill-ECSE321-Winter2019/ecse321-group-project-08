package ca.mcgill.ecse321.cooperator.dto;

import java.util.Collections;
import java.util.List;

public class EmployerDto {

	
	private String name;
	private List<EmployerDto> employers;

//Constructors
	
	public EmployerDto() {	
	}
	
	@SuppressWarnings("unchecked")
	public EmployerDto(String name) {
		this(name, Collections.EMPTY_LIST);
	}
	
	public EmployerDto(String name, List<EmployerDto> employers) {
		this.name=name;
		this.employers=employers;
	}
	
//Get methods
	
	public String getName() {
		return name;
	}
	
	public List<EmployerDto> getEmployers(){
		return employers;
	}
	
//Set methods
	
	public void setEmployers(List<EmployerDto> employers) {
		this.employers=employers;
	}
	
	
}
