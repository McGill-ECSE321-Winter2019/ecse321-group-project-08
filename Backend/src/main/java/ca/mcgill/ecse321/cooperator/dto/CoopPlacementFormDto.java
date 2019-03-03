package ca.mcgill.ecse321.cooperator.dto;

import java.util.Collections;

public class CoopPlacementFormDto {

	private static int coopPlacementFormID;
	private int coopPositionID;

//Constructors
	public CoopPlacementFormDto() {
		
	}

	public CoopPlacementFormDto(int ID) {
		CoopPlacementFormDto.coopPlacementFormID=ID;
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
