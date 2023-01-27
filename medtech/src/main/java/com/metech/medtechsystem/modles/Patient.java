package com.metech.medtechsystem.modles;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="patient_tbl")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PATIENT_ID", nullable = false)
    private long patientId;

    @Column(name="FIRSTNAME", nullable = false)
    private String firstName;

    
    @Column(name="LASTNAME", nullable = false)
    private String lastName;

    @Column(name="EMAIL", nullable = false)
    private String email;

    @Column(name = "NHI", nullable = false)
    private String nhi;

    @Column(name="GENDER", nullable = false)
    private String gender;

    @Column(name="DRUG_NAME", nullable = false)
    private String drugName;
    
    @Column(name="VISIT_DATE", nullable = false)
    private LocalDate visitDate;
 
 }
