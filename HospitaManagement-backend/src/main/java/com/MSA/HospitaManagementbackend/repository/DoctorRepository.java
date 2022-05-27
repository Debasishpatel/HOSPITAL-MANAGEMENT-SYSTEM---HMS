package com.MSA.HospitaManagementbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MSA.HospitaManagementbackend.model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
