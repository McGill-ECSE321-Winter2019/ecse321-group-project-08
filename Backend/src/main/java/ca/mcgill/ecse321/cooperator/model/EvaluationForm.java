package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
public class EvaluationForm{
private CoopPosition coopPosition;

@OneToOne(optional=false)
public CoopPosition getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(CoopPosition coopPosition) {
   this.coopPosition = coopPosition;
}

private Employer employer;

@ManyToOne(optional=false)
public Employer getEmployer() {
   return this.employer;
}

public void setEmployer(Employer employer) {
   this.employer = employer;
}

private int evaluationFormID;

public void setEvaluationFormID(int value) {
this.evaluationFormID = value;
    }
@Id
public int getEvaluationFormID() {
return this.evaluationFormID;
       }
   }
