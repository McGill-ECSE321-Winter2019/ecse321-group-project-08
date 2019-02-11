package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import java.sql.Date;
import javax.persistence.Id;

@Entity
public class StartConfirmation{
private Set<CoopPosition> coopPosition;

@ManyToMany
public Set<CoopPosition> getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(Set<CoopPosition> coopPositions) {
   this.coopPosition = coopPositions;
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
