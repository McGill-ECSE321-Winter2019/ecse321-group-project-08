package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class CoopPosition{
private Set<Student> student;

@ManyToMany
public Set<Student> getStudent() {
   return this.student;
}

public void setStudent(Set<Student> students) {
   this.student = students;
}

private Set<CoopPlacementForm> coopPlacementForm;

@ManyToMany(mappedBy="coopPosition")
public Set<CoopPlacementForm> getCoopPlacementForm() {
   return this.coopPlacementForm;
}

public void setCoopPlacementForm(Set<CoopPlacementForm> coopPlacementForms) {
   this.coopPlacementForm = coopPlacementForms;
}

private Set<TaxCreditForm> taxCreditForm;

@ManyToMany(mappedBy="coopPosition")
public Set<TaxCreditForm> getTaxCreditForm() {
   return this.taxCreditForm;
}

public void setTaxCreditForm(Set<TaxCreditForm> taxCreditForms) {
   this.taxCreditForm = taxCreditForms;
}

private Set<EvaluationForm> evaluationForm;

@ManyToMany(mappedBy="coopPosition")
public Set<EvaluationForm> getEvaluationForm() {
   return this.evaluationForm;
}

public void setEvaluationForm(Set<EvaluationForm> evaluationForms) {
   this.evaluationForm = evaluationForms;
}

private Set<StartConfirmation> startConfirmation;

@ManyToMany(mappedBy="coopPosition")
public Set<StartConfirmation> getStartConfirmation() {
   return this.startConfirmation;
}

public void setStartConfirmation(Set<StartConfirmation> startConfirmations) {
   this.startConfirmation = startConfirmations;
}

private Set<EvaluationForm> evaluationForm1;

@ManyToMany
public Set<EvaluationForm> getEvaluationForm1() {
   return this.evaluationForm1;
}

public void setEvaluationForm1(Set<EvaluationForm> evaluationForm1s) {
   this.evaluationForm1 = evaluationForm1s;
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
