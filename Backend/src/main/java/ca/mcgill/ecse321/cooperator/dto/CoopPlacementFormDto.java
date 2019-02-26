package ca.mcgill.ecse321.cooperator.dto;

import java.util.Collections;

public class CoopPlacementFormDto {

	private static int coopPlacementFormID;
	private CoopPositionDto coopPosition;

//Constructors
	public CoopPlacementFormDto() {
		
	}

	public CoopPlacementFormDto(int ID, CoopPositionDto coopPosition) {
		this.coopPosition=coopPosition;
		CoopPlacementFormDto.coopPlacementFormID=ID;
	}
	
//Get Methods	
	
	public int getID() {
		return coopPlacementFormID;
	}
	
	public CoopPositionDto getCoopPosition() {
		return coopPosition;
	}
	
	
//Set Methods	
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition = coopPosition;
	}
	
}
