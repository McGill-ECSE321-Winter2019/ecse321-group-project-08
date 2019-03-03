package ca.mcgill.ecse321.cooperator.dto;

public class CoopPlacementFormDto {

	private int coopPlacementFormID;
	private int coopPositionID;

//Constructors
	public CoopPlacementFormDto() {
		
	}

	public CoopPlacementFormDto(int ID) {
		this.coopPlacementFormID=ID;
	}
	
//Get Methods	
	
	public int getID() {
		return coopPlacementFormID;
	}
	
	public int getCoopPositionID() {
		return coopPositionID;
	}
	
	
//Set Methods	
	public void setCoopPositionID(int coopPositionID) {
		this.coopPositionID = coopPositionID;
	}
	
}
