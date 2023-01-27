package com.metech.medtechsystem.modles;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="system_tbl")
public class SystemModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SYSTEM_ID")
  private long system_id;

  
  @Column(name = "SOURCE_SYS", nullable = false)
  private String sourceSys;

  
  @Column(name = "SYS_TYPE", nullable = false)
  private String sysType;

  
  @Column(name = "LOC_TYPE", nullable = false)
  private String locType;

  
  @Column(name = "THIRD_PARTY_ID", nullable = false)
  private String thirdPartyId;

  
  @Column(name = "LOCATION", nullable = false)
  private String location;
}
