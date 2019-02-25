package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;

public class CoopPositionDto {
	private int coopPositionID;
	private String positionName;
	private String companyName;
	private Date startDate;
	private Date endDate;


	
public CoopPositionDto() {
		
	}



public int getID() {
	return coopPositionID;
}


public String getPositionName() {
	return positionName;
}

public String getCompanyName() {
	return companyName;
}

public Date getStartDate() {
	return startDate;
}


public Date getEndDate() {
	return endDate;
}


public CoopPositionDto(int coopPositionID, String positionName, String companyName, Date startDate,Date endDate) {
	this.coopPositionID = coopPositionID;
	this.positionName = positionName;
	this.companyName = companyName;
	this.startDate = startDate;
	this.endDate = endDate;

}
}

