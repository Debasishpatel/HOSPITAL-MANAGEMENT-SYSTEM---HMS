package com.MSA.HospitaManagementbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctors_Info")
public class Doctor {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

@Column(name ="Name")
 private String name;

@Column(name ="Age")
 private long age;

@Column(name ="Gender")
 private String gender;

@Column(name ="Specialist")
 private String specialist;
 
 
 
 public Doctor() {
	 
 }
 
 
 
public Doctor(String name, long age, String gender, String specialist) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.specialist = specialist;
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
public long getAge() {
	return age;
}
public void setAge(long age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSpecialist() {
	return specialist;
}
public void setSpecialist(String specialist) {
	this.specialist = specialist;
}
 
 
 
}

