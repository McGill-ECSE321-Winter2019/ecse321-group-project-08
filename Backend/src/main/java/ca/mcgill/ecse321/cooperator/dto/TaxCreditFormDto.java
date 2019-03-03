package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

public class TaxCreditFormDto {
	
	private int taxCreditFormID;
	private int coopPositionID;

//	Constructor	
	
	public TaxCreditFormDto() {
		
	}
	
	public TaxCreditFormDto(int ID) {
		this.taxCreditFormID = ID;
	}
	
//Get Methods
	
	public int getID() {
		return taxCreditFormID;
	}
	
	public int getCoopPositionID(){
		return this.coopPositionID;
	}
//Set Methods	
	
	public void setCoopPositionID(int coopPositionID) {
		this.coopPositionID= coopPositionID;
	}
	
}
