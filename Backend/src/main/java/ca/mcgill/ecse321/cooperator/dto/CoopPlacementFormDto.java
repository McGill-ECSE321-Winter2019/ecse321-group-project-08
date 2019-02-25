package ca.mcgill.ecse321.cooperator.dto;

public class CoopPlacementFormDto {

	private int coopPlacementFormID;

	public CoopPlacementFormDto() {
		
	}
	
	public CoopPlacementFormDto(int ID) {
		this.coopPlacementFormID = ID;
	}
	
	public int getID() {
		return coopPlacementFormID;
	}
	
}
