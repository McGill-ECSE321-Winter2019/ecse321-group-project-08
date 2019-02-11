package ca.mcgill.ecse321.cooperatorApp.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Student{
private Set<CoopPosition> coopPosition;

@OneToMany(mappedBy="student")
public Set<CoopPosition> getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(Set<CoopPosition> coopPositions) {
   this.coopPosition = coopPositions;
}

private int studentID;

public void setStudentID(int value) {
this.studentID = value;
    }
@Id
public int getStudentID() {
return this.studentID;
    }
private String studentName;

public void setStudentName(String value) {
this.studentName = value;
    }
public String getStudentName() {
return this.studentName;
       }
   }
