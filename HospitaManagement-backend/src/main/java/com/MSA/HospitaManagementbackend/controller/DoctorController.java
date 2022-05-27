package com.MSA.HospitaManagementbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MSA.HospitaManagementbackend.exception.ResourceNotFoundException;
import com.MSA.HospitaManagementbackend.model.Doctor;
import com.MSA.HospitaManagementbackend.repository.DoctorRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class DoctorController {

	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/doctors-info")
	public List<Doctor>getAllEmployees(){
		return doctorRepository.findAll();
		
	}
	
	//get doctor's profile info by name api
	@GetMapping("/doctors-info/{id}")
		public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id){
			Doctor doctor = doctorRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Doctor not exist with ID :" + id));
		 return ResponseEntity.ok(doctor);
	}
	  
	
}
