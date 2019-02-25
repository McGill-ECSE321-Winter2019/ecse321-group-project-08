package ca.mcgill.ecse321.cooperator.dto;
import java.util.Collections;
import java.util.List;

public class EventDto {
	private String name;
	private List<EmployerDto> employers;

	
	
	public EventDto() {
	}
	@SuppressWarnings("unchecked")
	
	
	
	
	
	public EventDto(String name,List<EmployerDto> employers) {
		this.name = name;
		this.employers = employers;

	}
	//Getter
	public String getName() {
		return name;
	}
	
	//Getter
	public List<EmployerDto> getEmployers(){
		return employers;
	}
	
//Set methods
	
	public void setEmployers(List<EmployerDto> employers) {
		this.employers=employers;
	}
}
