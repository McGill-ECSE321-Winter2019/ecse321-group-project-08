package ca.mcgill.ecse321.cooperator.dto;

public class EvaluationFormDto {
	
	public int id;
	public String name;
	
	//get and set methods needed
	public CoopPositionDto coopPosition;
	public EmployerDto employer;

//Constructor
	
	public EvaluationFormDto() {
		
	}
	public EvaluationFormDto(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
//Get Methods
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public  CoopPositionDto getCoopPosition() {
		return coopPosition;
	}
		
	public EmployerDto getEmployer() {
		return employer;
	}
	
//Set Methods
	
	public CoopPositionDto setCoopPosition() {
		return coopPosition;
	}

	public EmployerDto setEmployer() {
		return employer;
	}	
	
}
