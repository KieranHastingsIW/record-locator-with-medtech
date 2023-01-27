package com.metech.medtechsystem.modles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * RLSPOSTAPISchema
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RecordModel {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "RLS_ID")
    // private Long recordId;

    private Long dataType;

    private Long systemId;
    

    private String patientId;
}