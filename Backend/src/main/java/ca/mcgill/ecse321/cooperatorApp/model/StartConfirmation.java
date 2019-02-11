package ca.mcgill.ecse321.cooperatorApp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Date;
import javax.persistence.Id;

@Entity
public class StartConfirmation{
private Employer employer;

@ManyToOne(optional=false)
public Employer getEmployer() {
   return this.employer;
}

public void setEmployer(Employer employer) {
   this.employer = employer;
}

private CoopPosition coopPosition;

@OneToOne(mappedBy="startConfimation", optional=false)
public CoopPosition getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(CoopPosition coopPosition) {
   this.coopPosition = coopPosition;
}

private Date evaluationDate;

public void setEvaluationDate(Date value) {
this.evaluationDate = value;
    }
public Date getEvaluationDate() {
return this.evaluationDate;
    }
private int confirmationID;

public void setConfirmationID(int value) {
this.confirmationID = value;
    }
@Id
public int getConfirmationID() {
return this.confirmationID;
       }
   }
