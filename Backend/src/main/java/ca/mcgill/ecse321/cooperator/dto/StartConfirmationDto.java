package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;

public class StartConfirmationDto {
	private int confirmationID;
	private Date evaluationDate;
	private EmployerDto employer;
	private CoopPositionDto coopPosition;

//Controller	
	public StartConfirmationDto() {

	}

	public StartConfirmationDto(int confirmationID, Date evaluationDate,EmployerDto employer,CoopPositionDto coopPosition ) {
		this.confirmationID = confirmationID;
		this.evaluationDate = evaluationDate;
		this.employer=employer;
		this.coopPosition=coopPosition;
	}

//Get Methods
	public int getID() {
		return confirmationID;
	}

	public Date getStartDate() {
		return evaluationDate;
	}
	
	public EmployerDto getEmployer() {
		return employer;
	}
	
	public CoopPositionDto getCoopPosition() {
		return coopPosition;
	}
	
//Set Methods
	
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition=coopPosition;
	}
	
	public void setEmployer(EmployerDto employer) {
		this.employer=employer;
	}
	

}
