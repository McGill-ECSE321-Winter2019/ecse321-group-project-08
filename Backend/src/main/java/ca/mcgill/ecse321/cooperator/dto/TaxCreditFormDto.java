package ca.mcgill.ecse321.cooperator.dto;

public class TaxCreditFormDto {
	
	private int taxCreditFormID;
	private CoopPositionDto coopPosition;

	public TaxCreditFormDto() {
		
	}
	
//	@SuppressWarnings("unchecked")
//	public taxCreditFormDto(int id) {
//		this.taxCreditFormID=id;
//	}
	
	
	public TaxCreditFormDto(int ID) {
		this.taxCreditFormID = ID;
	}
	
	public int getID() {
		return taxCreditFormID;
	}
	
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition= coopPosition;
	}
	
	public CoopPositionDto getCoopPosition(){
		return this.coopPosition;
	}
	
	
}
