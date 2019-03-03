package ca.mcgill.ecse321.cooperator.model;

import javax.persistence.Entity;

import java.util.List;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Student{
private List<CoopPosition> coopPosition;

@OneToMany(mappedBy="student")
public List<CoopPosition> getCoopPosition() {
   return this.coopPosition;
}

public void setCoopPosition(List<CoopPosition> coopPositions) {
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
