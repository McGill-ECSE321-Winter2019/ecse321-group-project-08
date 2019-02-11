package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class CoopPlacementForm extends Document{
private Set<CoopPosition> coopPosition;

@ManyToMany
public Set<CoopPosition> getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(Set<CoopPosition> coopPositions) {
   this.coopPosition = coopPositions;
}

private int coopPlacementFormID;

public void setCoopPlacementFormID(int value) {
this.coopPlacementFormID = value;
    }
@Id
public int getCoopPlacementFormID() {
return this.coopPlacementFormID;
       }
   }
