package ca.mcgill.ecse321.cooperatorApp.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Employer{
private Set<Event> invitedTo;

@ManyToMany(mappedBy="invited")
public Set<Event> getInvitedTo() {
   return this.invitedTo;
}

public void setInvitedTo(Set<Event> invitedTos) {
   this.invitedTo = invitedTos;
}

private Set<Event> attendee;

@ManyToMany(mappedBy="attending")
public Set<Event> getAttendee() {
   return this.attendee;
}

public void setAttendee(Set<Event> attendees) {
   this.attendee = attendees;
}

private Set<StartConfirmation> startConfimation;

@OneToMany(mappedBy="employer")
public Set<StartConfirmation> getStartConfimation() {
   return this.startConfimation;
}

public void setStartConfimation(Set<StartConfirmation> startConfimations) {
   this.startConfimation = startConfimations;
}

private Set<EvaluationForm> evaluationForm;

@OneToMany(mappedBy="employer")
public Set<EvaluationForm> getEvaluationForm() {
   return this.evaluationForm;
}

public void setEvaluationForm(Set<EvaluationForm> evaluationForms) {
   this.evaluationForm = evaluationForms;
}

private String username;

public void setUsername(String value) {
this.username = value;
    }
public String getUsername() {
return this.username;
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
