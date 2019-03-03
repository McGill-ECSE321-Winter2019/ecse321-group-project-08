package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;

public class StartConfirmationDto {
	private int confirmationID;
	private Date evaluationDate;
	private int employerID;
	private int coopPositionID;

//Controller	
	public StartConfirmationDto() {

	}

	public StartConfirmationDto(int confirmationID, Date evaluationDate ) {
		this.confirmationID = confirmationID;
		this.evaluationDate = evaluationDate;
	}

//Get Methods
	
	public int getID() {
		return confirmationID;
	}

	public Date getStartDate() {
		return evaluationDate;
	}
	
	public int getEmployer() {
		return employerID;
	}
	
	public int getCoopPosition() {
		return coopPositionID;
	}
	
//Set Methods
	
	public void setCoopPositionID(int coopPositionID) {
		this.coopPositionID=coopPositionID;
	}
	
	public void setEmployerID(int employer) {
		this.employerID=employer;
	}
	

}
