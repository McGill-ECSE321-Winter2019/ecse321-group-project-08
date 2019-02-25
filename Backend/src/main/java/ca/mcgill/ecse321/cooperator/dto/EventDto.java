package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

public class EventDto {
	private String name;
	private List<EmployerDto> employers;

//Constructor

	public EventDto() {
	}

	public EventDto(String name, List<EmployerDto> employers) {
		this.name = name;
		this.employers = employers;
	}

//Get methods

	public String getName() {
		return name;
	}

	public List<EmployerDto> getEmployers() {
		return employers;
	}

//Set methods

	public void setEmployers(List<EmployerDto> employers) {
		this.employers = employers;
	}
}
