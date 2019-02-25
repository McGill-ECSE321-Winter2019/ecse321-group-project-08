package ca.mcgill.ecse321.cooperator.dto;
import java.util.Collections;

public class EventDto {
	private String name;
	
	
	public EventDto() {
	}
	@SuppressWarnings("unchecked")
	
	public EventDto(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
