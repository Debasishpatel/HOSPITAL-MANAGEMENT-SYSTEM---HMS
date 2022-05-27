package com.MSA.HospitaManagementbackend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.MSA.HospitaManagementbackend.model.Doctor;
import com.MSA.HospitaManagementbackend.model.Patient;
import com.MSA.HospitaManagementbackend.repository.DoctorRepository;
import com.MSA.HospitaManagementbackend.repository.PatientRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HospitaManagementBackendApplicationTests {
    
	
	@Autowired
    DoctorRepository dRepo;
	@Autowired
	PatientRepository pRepo;
	@Test
	void contextLoads() {
	}
    
	
	@Test
    public void testReadAll() {
        List<Doctor> list = dRepo.findAll();
       assertThat(list).size().isGreaterThan(0);
    }
	
	@Test
    public void testSingle(){
        Doctor doc = dRepo.findById(1L).get();
        assertEquals(21,doc.getAge());
    }
	
	@Test
    public void addPatientToList() throws ParseException{
        Patient p = new Patient();
        p.setId(10);
        p.setName("Raj");
        p.setVisitedDoctor("Jayashree");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        p.setDateOfVisit(formatter.parse("09-09-2001"));
       
        pRepo.save(p);
        assertNotNull(pRepo.findById(10L).get());

    }
	
	
}
