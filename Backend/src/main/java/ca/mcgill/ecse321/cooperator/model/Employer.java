package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Employer{
private Set<Event> invitedTo;

@ManyToMany
public Set<Event> getInvitedTo() {
   return this.invitedTo;
}

public void setInvitedTo(Set<Event> invitedTos) {
   this.invitedTo = invitedTos;
}

private Set<StartConfirmation> startConfirmation;

@OneToMany(mappedBy="employer")
public Set<StartConfirmation> getStartConfirmation() {
   return this.startConfirmation;
}

public void setStartConfirmation(Set<StartConfirmation> startConfirmations) {
   this.startConfirmation = startConfirmations;
}

private Set<EvaluationForm> evaluationForm;

@OneToMany(mappedBy="employer")
public Set<EvaluationForm> getEvaluationForm() {
   return this.evaluationForm;
}

public void setEvaluationForm(Set<EvaluationForm> evaluationForms) {
   this.evaluationForm = evaluationForms;
}

private String userName;

public void setUserName(String value) {
this.userName = value;
    }
public String getUserName() {
return this.userName;
    }
private String password;

public void setPassword(String value) {
this.password = value;
    }
public String getPassword() {
return this.password;
    }
private int employeeID;

public void setEmployeeID(int value) {
this.employeeID = value;
    }
@Id
public int getEmployeeID() {
return this.employeeID;
       }
   }
