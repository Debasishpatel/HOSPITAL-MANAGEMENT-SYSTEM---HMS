package com.MSA.HospitaManagementbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MSA.HospitaManagementbackend.exception.ResourceNotFoundException;
import com.MSA.HospitaManagementbackend.model.Patient;
import com.MSA.HospitaManagementbackend.repository.PatientRepository;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PatientController {

	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("/patients-info")
	public List<Patient>getAllEmployees(){
		return patientRepository.findAll();
		
	}
	
	
	//create patient rest api
	@PostMapping("/patients-info")
	public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);		
	}
	
	
	@GetMapping("/patients-info/{id}")
	public ResponseEntity<Patient> getDoctorById(@PathVariable Long id){
		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not exist with ID :" + id));
	 return ResponseEntity.ok(patient);
}
	
}
