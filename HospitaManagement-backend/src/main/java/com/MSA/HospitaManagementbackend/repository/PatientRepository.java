package com.MSA.HospitaManagementbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MSA.HospitaManagementbackend.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

}
