package ca.mcgill.ecse321.cooperator.dto;

import java.util.Collections;

public class CoopPlacementFormDto {

	private static int coopPlacementFormID;
	private CoopPositionDto coopPosition;

	public CoopPlacementFormDto() {
		
	}
	
//	@SuppressWarnings("unchecked")
//	public CoopPlacementFormDto(int ID) {
//		this(coopPlacementFormID, EMPTY);   <-- 
//	}

	public CoopPlacementFormDto(int ID, CoopPositionDto coopPosition) {
		this.coopPosition=coopPosition;
		this.coopPlacementFormID=ID;
	}
	
	public int getID() {
		return coopPlacementFormID;
	}
	
	public CoopPositionDto getCoopPosition() {
		return coopPosition;
	}
	
	public void setCoopPosition(CoopPositionDto coopPosition) {
		this.coopPosition = coopPosition;
	}
	
}
