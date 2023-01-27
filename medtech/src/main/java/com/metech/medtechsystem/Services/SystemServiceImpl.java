package com.metech.medtechsystem.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter;
import com.metech.medtechsystem.Repository.PatientRepository;
import com.metech.medtechsystem.modles.Patient;
import com.metech.medtechsystem.modles.RecordModel;
import com.metech.medtechsystem.modles.SystemModel;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SystemServiceImpl implements SystemService{

    private PatientRepository patientRepository;
    
    @Override 
    public void callRecordLocator(String nhi){

        // ## code that calls the Recordlocator API and posts a record to 
        // it with the NHI of the patient created in the system ##
        // ------------------------------------------
        RecordModel record = new RecordModel();
        record.setPatientId(nhi);
        record.setDataType(2L);
        record.setSystemId(1L);
        HttpURLConnection connection;
        
        



        URL url;
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            //Convert record model to json 
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String jsonRecord = ow.writeValueAsString(record);
            byte[] out =  jsonRecord.getBytes(StandardCharsets.UTF_8);
            int length = out.length;
            // SET UP HTTP CONNECTION 
            url = new URL("http://RecordLoactor:9090/rls");
            connection = (HttpURLConnection) url.openConnection();
            connection .setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connection.setRequestProperty("Accept", "application/json");
            // connection.setRequestProperty("Content-Length", String.valueOf(length));
            connection.setDoOutput(true);
            try(OutputStream os = connection.getOutputStream()) {
                os.write(out, 0 , length);
            }



            connection .setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int status = connection.getResponseCode();
            if (status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();

            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    
    }
    @Override
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
    @Override
    public Optional<Patient> getPatient(Long patientId){
        return patientRepository.findById(patientId);
    }
    // @Override Method that gets rl from RLAPI through system at med tech, will need to use this ater in other end of project 
    public void callRecordLocatorGet(String nhi){

      
        HttpURLConnection connection;
        URL url;
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            url = new URL("http://localhost:9090/rls/" + nhi);
            connection = (HttpURLConnection) url.openConnection();
            connection .setRequestMethod("GET");
            connection .setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int status = connection.getResponseCode();
            if (status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();

            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
}
