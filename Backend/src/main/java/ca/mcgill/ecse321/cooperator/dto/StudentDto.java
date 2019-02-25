package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;
import java.util.List;

public class StudentDto {
	private int ID;
	private String name;
	private List<CoopPositionDto> coopPosition;
	
//Constructor
	
	public StudentDto() {

	}
	
	public StudentDto(int ID, String name,List<CoopPositionDto> coopPosition) {
		this.ID = ID;
		this.name = name;
		this.coopPosition = coopPosition;
	}
	
//Get Methods
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public List<CoopPositionDto> getCoopPosition() {
		return coopPosition;
	}
	
//Set Methods
	
	public void setCoopPosition(List<CoopPositionDto> coopPosition) {
		this.coopPosition= coopPosition;
	}
	
	
	
}
