package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class Event{
private Set<Employer> invited;

@ManyToMany(mappedBy="invitedTo")
public Set<Employer> getInvited() {
   return this.invited;
}

public void setInvited(Set<Employer> inviteds) {
   this.invited = inviteds;
}

private Set<Event> event;

@ManyToMany
public Set<Event> getEvent() {
   return this.event;
}

public void setEvent(Set<Event> events) {
   this.event = events;
}

private Set<Event> event1;

@ManyToMany(mappedBy="event")
public Set<Event> getEvent1() {
   return this.event1;
}

public void setEvent1(Set<Event> event1s) {
   this.event1 = event1s;
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
