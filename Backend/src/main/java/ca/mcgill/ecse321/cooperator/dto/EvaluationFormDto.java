package ca.mcgill.ecse321.cooperator.dto;

public class EvaluationFormDto {
	
	public int id;
	public int coopPositionID;
	public int employer;

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
	
	public  int getCoopPosition() {
		return coopPositionID;
	}
		
	public int getEmployer() {
		return employer;
	}
	
//Set Methods
	
	public void setCoopPositionID(int coopPositionID) {
		this.coopPositionID=coopPositionID;
	}

	public void setEmployerID(int employer) {
		this.employer=employer;
	}	
	
}
