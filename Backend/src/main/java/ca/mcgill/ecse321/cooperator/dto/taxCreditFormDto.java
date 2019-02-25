package ca.mcgill.ecse321.cooperator.dto;

public class taxCreditFormDto {
	private int taxCreditFormID;

	public taxCreditFormDto() {
		
	}
	
	public taxCreditFormDto(int ID) {
		this.taxCreditFormID = ID;
	}
	
	public int getID() {
		return taxCreditFormID;
	}
}
