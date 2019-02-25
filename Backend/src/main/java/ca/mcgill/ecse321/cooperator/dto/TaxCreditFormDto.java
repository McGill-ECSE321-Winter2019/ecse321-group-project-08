package ca.mcgill.ecse321.cooperator.dto;

import java.util.List;

public class TaxCreditFormDto {
	
	private int taxCreditFormID;
	private CoopPositionDto coopPosition;

	public TaxCreditFormDto() {
		
	}
	
//	@SuppressWarnings("unchecked")
//	public taxCreditFormDto(int id) {
//		this.taxCreditFormID=id;
//	}
	public TaxCreditFormDto(int taxCreditFormID, CoopPositionDto coopPosition) {
		this.taxCreditFormID = taxCreditFormID;
		this.coopPosition = coopPosition;

	}
	
	
	public TaxCreditFormDto(int ID) {
		this.taxCreditFormID = ID;
	}
	
	//getter
	public int getID() {
		return taxCreditFormID;
	}
	//setter
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition= coopPosition;
	}
	//getter
	public CoopPositionDto getCoopPosition(){
		return this.coopPosition;
	}
	
	
}
