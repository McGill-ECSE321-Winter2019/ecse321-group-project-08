package ca.mcgill.ecse321.cooperator.dto;

import java.sql.Date;

public class CoopPositionDto {
	
	private int coopPositionID;
	private String positionName;
	private String companyName;
	private Date startDate;
	private Date endDate;
	private EvaluationFormDto evaluationForm;
	private StartConfirmationDto startConfirmation;
	private TaxCreditFormDto taxCreditForm;
	private CoopPlacementFormDto coopPlacementForm;
	private StudentDto student;

	
// Constructors	
	
	public CoopPositionDto() {

	}

	public CoopPositionDto(int coopPositionID) {
		this.coopPositionID = coopPositionID;
		this.positionName = "Position";
		this.companyName = "Company";
		this.startDate = new Date(00-00-0000);
		this.endDate = new Date(99-99-9999);
	}
	

	public CoopPositionDto(int coopPositionID, String positionName, String companyName, Date startDate, Date endDate) {
		this.coopPositionID = coopPositionID;
		this.positionName = positionName;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
//Get Methods
	
	public int getID() {
		return coopPositionID;
	}

	public String getPositionName() {
		return positionName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
	public EvaluationFormDto getEvaluationForm(){
		return evaluationForm;
	}
	
	public StartConfirmationDto getStartConfirmation() {
		return startConfirmation;
	}
	public TaxCreditFormDto getTaxCreditForm() {
		return taxCreditForm;
	}
	public CoopPlacementFormDto getCoopPlacementForm() {
		return coopPlacementForm;
	}
	public StudentDto getStudent() {
		return student;
	}

//Set Methods
	
	public void setEvaluationForm(EvaluationFormDto evaluationForm) {
		this.evaluationForm=evaluationForm;
	}
	
	public void setStartConfirmation(StartConfirmationDto startConfirmation) {
		this.startConfirmation=startConfirmation;
	}
	
	public void setTaxCreditForm(TaxCreditFormDto taxCreditForm) {
		this.taxCreditForm=taxCreditForm;
	}
	
	public void setCoopPlacementForm(CoopPlacementFormDto coopPlacementForm) {
		this.coopPlacementForm=coopPlacementForm;
	}
	
	public void setStudent(StudentDto student) {
		this.student=student;
	}
	

}
