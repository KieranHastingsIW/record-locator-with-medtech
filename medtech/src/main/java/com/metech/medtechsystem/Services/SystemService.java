package com.metech.medtechsystem.Services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Optional;

import com.metech.medtechsystem.modles.Patient;


public interface SystemService {
    void callRecordLocator(String nhi) throws MalformedURLException, IOException;
    Patient savePatient(Patient patient);
    Optional<Patient> getPatient(Long patientId);
}
