package com.metech.medtechsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metech.medtechsystem.modles.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
    
}
