package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class CoopPosition{
private Student student;

@ManyToOne(optional=false)
public Student getStudent() {
   return this.student;
}

public void setStudent(Student student) {
   this.student = student;
}

private CoopPlacementForm coopPlacementForm;

@OneToOne(mappedBy="coopPosition", optional=false)
public CoopPlacementForm getCoopPlacementForm() {
   return this.coopPlacementForm;
}

public void setCoopPlacementForm(CoopPlacementForm coopPlacementForm) {
   this.coopPlacementForm = coopPlacementForm;
}

private TaxCreditForm taxCreditForm;

@OneToOne(mappedBy="coopPosition", optional=false)
public TaxCreditForm getTaxCreditForm() {
   return this.taxCreditForm;
}

public void setTaxCreditForm(TaxCreditForm taxCreditForm) {
   this.taxCreditForm = taxCreditForm;
}

private EvaluationForm evaluationForm;

@OneToOne(mappedBy="coopPosition", optional=false)
public EvaluationForm getEvaluationForm() {
   return this.evaluationForm;
}

public void setEvaluationForm(EvaluationForm evaluationForm) {
   this.evaluationForm = evaluationForm;
}

private StartConfirmation startConfirmation;

@OneToOne(mappedBy="coopPosition", optional=false)
public StartConfirmation getStartConfirmation() {
   return this.startConfirmation;
}

public void setStartConfirmation(StartConfirmation startConfirmation) {
   this.startConfirmation = startConfirmation;
}

private int positionID;

public void setPositionID(int value) {
this.positionID = value;
    }
@Id
public int getPositionID() {
return this.positionID;
    }
private String positionName;

public void setPositionName(String value) {
this.positionName = value;
    }
public String getPositionName() {
return this.positionName;
    }
private String companyName;

public void setCompanyName(String value) {
this.companyName = value;
    }
public String getCompanyName() {
return this.companyName;
    }
private Date startDate;

public void setStartDate(Date value) {
this.startDate = value;
    }
public Date getStartDate() {
return this.startDate;
    }
private Date endDate;

public void setEndDate(Date value) {
this.endDate = value;
    }
public Date getEndDate() {
return this.endDate;
       }
   }
