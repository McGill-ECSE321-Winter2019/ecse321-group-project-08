package ca.mcgill.ecse321.cooperator.dto;

public class EvaluationFormDto {
	
	public int id;
	public CoopPositionDto coopPosition;
	public EmployerDto employer;

//Constructor
	
	public EvaluationFormDto() {
		
	}
	public EvaluationFormDto(int id) {
		this.id=id;
	}
	
//Get Methods
	
	public int getID() {
		return id;
	}
	
	public  CoopPositionDto getCoopPosition() {
		return coopPosition;
	}
		
	public EmployerDto getEmployer() {
		return employer;
	}
	
//Set Methods
	
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition=coopPosition;
	}

	public void setEmployer(EmployerDto employer) {
		this.employer=employer;
	}	
	
}
