package ca.mcgill.ecse321.cooperatorApp.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Id;

@Entity
public class TaxCreditForm extends Document{
private CoopPosition coopPosition;

@OneToOne(optional=false)
public CoopPosition getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(CoopPosition coopPosition) {
   this.coopPosition = coopPosition;
}

private int taxCreditFormID;

public void setTaxCreditFormID(int value) {
this.taxCreditFormID = value;
    }
@Id
public int getTaxCreditFormID() {
return this.taxCreditFormID;
       }
   }
