package com.metech.medtechsystem.Controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.metech.medtechsystem.Services.SystemService;
import com.metech.medtechsystem.modles.Patient;


import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MTController {

    private SystemService systemService;

    @GetMapping("/medtech")
    public String getMedTech1(Model model){
        model.addAttribute("patient", new Patient());
        return "SystemHomePage";
    }

    @PostMapping("/medtech")
    public String postMedTech1(@ModelAttribute Patient patient, Model model) throws MalformedURLException, IOException{
        
        systemService.savePatient(patient);
        systemService.callRecordLocator(patient.getNhi());
        model.addAttribute("patient", patient);
        return "SystemReturn";
    }

    // @GetMapping("/getPatient")
    // public String getPatient(Model model){

    //     return "GetPatient";
    // }

    // @PostMapping("/getPatient")
    // public String postPatient(Model model) throws MalformedURLException, IOException{
        
    //     systemService.getPatient((Long) model.getAttribute("patientId"));
    //     return "GetPatient";
    // }
}
