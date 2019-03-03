package ca.mcgill.ecse321.cooperator.dto;

import java.util.ArrayList;
import java.util.List;


public class StudentDto {
	private int ID;
	private String name;
	private List<CoopPositionDto> coopPositionDtos;

	
//Constructor
	
	public StudentDto() {
	}
	
	public StudentDto(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
//Get Methods
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public List<CoopPositionDto> getCoopPositionIDs() {
		return coopPositionDtos;
	}
	
//Set Methods
	
	public void setCoopPosition(List<CoopPositionDto> coopPositionIDs) {
		this.coopPositionDtos= coopPositionIDs;
	}
	
//Add to coopPositions
	
	public void addCoopPosition(CoopPositionDto coopPositionDto) {
		this.coopPositionDtos.add(coopPositionDto);
	}
	
	
	
}
