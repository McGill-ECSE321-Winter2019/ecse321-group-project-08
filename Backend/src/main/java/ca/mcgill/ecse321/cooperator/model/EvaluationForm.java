package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class EvaluationForm extends Document{
private Set<CoopPosition> coopPosition;

@ManyToMany
public Set<CoopPosition> getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(Set<CoopPosition> coopPositions) {
   this.coopPosition = coopPositions;
}

private Set<Employer> employer;

@ManyToMany
public Set<Employer> getEmployer() {
   return this.employer;
}

public void setEmployer(Set<Employer> employers) {
   this.employer = employers;
}

private Set<CoopPosition> coopPosition1;

@ManyToMany(mappedBy="evaluationForm1")
public Set<CoopPosition> getCoopPosition1() {
   return this.coopPosition1;
}

public void setCoopPosition1(Set<CoopPosition> coopPosition1s) {
   this.coopPosition1 = coopPosition1s;
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
