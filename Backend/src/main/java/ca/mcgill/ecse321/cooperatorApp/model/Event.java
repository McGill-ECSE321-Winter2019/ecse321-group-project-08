package ca.mcgill.ecse321.cooperatorApp.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class Event{
private Set<Employer> invited;

@ManyToMany
public Set<Employer> getInvited() {
   return this.invited;
}

public void setInvited(Set<Employer> inviteds) {
   this.invited = inviteds;
}

private Set<Employer> attending;

@ManyToMany
public Set<Employer> getAttending() {
   return this.attending;
}

public void setAttending(Set<Employer> attendings) {
   this.attending = attendings;
}

private String name;

public void setName(String value) {
this.name = value;
    }
@Id
public String getName() {
return this.name;
       }
   }
