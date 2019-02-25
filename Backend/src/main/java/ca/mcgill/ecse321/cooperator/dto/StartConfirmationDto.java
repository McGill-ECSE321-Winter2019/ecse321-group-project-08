package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;

public class StartConfirmationDto {
	private int confirmationID;
	private Date evaluationDate;

	
	
public StartConfirmationDto() {
		
	}
	public StartConfirmationDto(int confirmationID,Date evaluationDate) {
		this.confirmationID = confirmationID;
		this.evaluationDate = evaluationDate;

	}
	
	
	public int getID() {
		return confirmationID;
	}
	

public Date getStartDate() {
	return evaluationDate;
}
	
}
