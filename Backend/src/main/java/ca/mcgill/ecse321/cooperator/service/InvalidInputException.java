package ca.mcgill.ecse321.cooperator.service;

public class InvalidInputException extends Exception {


	private static final long serialVersionUID = -9015818949884691246L;

	public InvalidInputException(String errorMessage) {
		super(errorMessage);
	}
}
