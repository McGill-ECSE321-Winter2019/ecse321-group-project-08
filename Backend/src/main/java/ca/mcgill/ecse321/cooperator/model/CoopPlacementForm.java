package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Id;

@Entity
public class CoopPlacementForm extends Document{
private CoopPosition coopPosition;

@OneToOne(optional=false)
public CoopPosition getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(CoopPosition coopPosition) {
   this.coopPosition = coopPosition;
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
