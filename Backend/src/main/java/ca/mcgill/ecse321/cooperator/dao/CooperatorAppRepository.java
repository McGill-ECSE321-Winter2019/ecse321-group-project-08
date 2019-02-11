//package ca.mcgill.ecse321.cooperator.dao;
//
//import java.sql.Date;
//import java.sql.Time;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import ca.mcgill.ecse321.cooperator.model.CoopPlacementForm;
//import ca.mcgill.ecse321.cooperator.model.CoopPosition;
//import ca.mcgill.ecse321.cooperator.model.Document;
//import ca.mcgill.ecse321.cooperator.model.Employer;
//import ca.mcgill.ecse321.cooperator.model.EvaluationForm;
//import ca.mcgill.ecse321.cooperator.model.Event;
//import ca.mcgill.ecse321.cooperator.model.StartConfirmation;
//import ca.mcgill.ecse321.cooperator.model.Student;
//import ca.mcgill.ecse321.cooperator.model.TaxCreditForm;
//
//
//@Repository
//public class CooperatorAppRepository {
//
//	@Autowired
//	EntityManager entityManager;
//	
//	
////	CoopPlacementForm
//	
//	@Transactional
//	public CoopPlacementForm createCoopPlacementForm(int ID) {
//		CoopPlacementForm p = new CoopPlacementForm();
//		p.setCoopPlacementFormID(ID);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public CoopPlacementForm getCoopPlacementForm(int ID) {
//		CoopPlacementForm p = entityManager.find(CoopPlacementForm.class, ID);
//		return p;
//	}
//	
//	
//// CoopPosition
//	
//	@Transactional
//	public CoopPosition createCoopPosition(int ID,String PosName, String compName, Date startDate, Date endDate ) {
//		CoopPosition p = new CoopPosition();
//		p.setPositionID(ID);
//		p.setPositionName(PosName);
//		p.setCompanyName(compName);
//		p.setStartDate(startDate);
//		p.setEndDate(endDate);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public CoopPosition getCoopPositiontForm(int ID,String PosName, String compName, Date startDate, Date endDate) {
//		CoopPosition p = entityManager.find(CoopPosition.class, ID);
//		return p;
//	}
//	
//	
//	
////	Employer
//	@Transactional
//	public Employer createEmployer(String userName, String password,int ID ) {
//		Employer p = new Employer();
//		p.setUserName(userName);
//		p.setPassword(password);
//		p.setEmployeeID(ID);
//
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public Employer getEmployer(String userName, String password,int ID) {
//		Employer p = entityManager.find(Employer.class, ID);
//		return p;
//	}
//	
////	Events
//	@Transactional
//	public Event createEvents(String eventName ) {
//		Event p = new Event();
//		p.setName(eventName);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public Event getEvents(String eventName ) {
//		Event p = entityManager.find(Event.class, eventName);
//		return p;
//	}
//	
//	
//	
//	
////	EvaluationForm
//	@Transactional
//	public EvaluationForm createEvaluationForm(int ID ) {
//		EvaluationForm p = new EvaluationForm();
//		p.setEvaluationFormID(ID);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public EvaluationForm getEvaluationForm(int ID ) {
//		EvaluationForm p = entityManager.find(EvaluationForm.class, ID);
//		return p;
//	}
//	
//	
//	
////	TaxCreditForm
//	@Transactional
//	public TaxCreditForm createTaxCreditForm(int ID ) {
//		TaxCreditForm p = new TaxCreditForm();
//		p.setTaxCreditFormID(ID);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public TaxCreditForm getTaxCreditForm(int ID ) {
//		TaxCreditForm p = entityManager.find(TaxCreditForm.class, ID);
//		return p;
//	}
//	
//	
//	
//	
////	StartConfirmation
//	
//	@Transactional
//	public StartConfirmation createStartConfirmation(Date date ,int ID ) {
//		StartConfirmation p = new StartConfirmation();
//		p.setConfirmationID(ID);
//		p.setEvaluationDate(date);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public StartConfirmation getStartConfirmation(int ID) {
//		StartConfirmation p = entityManager.find(StartConfirmation.class, ID);
//		return p;
//	}
//	
//	
////	Student
//	@Transactional
//	public Student createStudent(int ID, String name ) {
//		Student p = new Student();
//		p.setStudentID(ID);
//		p.setStudentName(name);
//		entityManager.persist(p);
//		return p;
//	}
//
//	@Transactional
//	public Student getStudent(int ID) {
//		Student p = entityManager.find(Student.class, ID);
//		return p;
//	}
//		
//	
//	
//}
