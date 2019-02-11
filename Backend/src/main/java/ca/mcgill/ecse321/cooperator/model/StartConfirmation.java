package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Set;
import javax.persistence.ManyToMany;
import java.sql.Date;
import javax.persistence.Id;

@Entity
public class StartConfirmation{
private CoopPosition coopPosition;

@OneToOne(optional=false)
public CoopPosition getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(CoopPosition coopPosition) {
   this.coopPosition = coopPosition;
}

private Set<Employer> employer;

@ManyToMany(mappedBy="startConfirmation")
public Set<Employer> getEmployer() {
   return this.employer;
}

public void setEmployer(Set<Employer> employers) {
   this.employer = employers;
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
