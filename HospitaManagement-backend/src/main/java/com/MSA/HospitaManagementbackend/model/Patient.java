package com.MSA.HospitaManagementbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Patients_Info")
public class Patient {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

@Column(name ="Name")
	private String name;

@Column(name ="VisitedDoctor")
	private String visitedDoctor;

@Column(name ="DateOfVisit")
    private Date dateOfVisit;
    
    
   public Patient() {
	   
   }
    
    
    
	public Patient(String name, String visitedDoctor, Date dateOfVisit) {
		super();
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	
    
    
    
}
