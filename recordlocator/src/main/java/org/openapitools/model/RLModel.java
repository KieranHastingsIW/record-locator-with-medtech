package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RLSPOSTAPISchema
 */



@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="locator_tbl")
@JsonTypeName("RLS_POST_API_Schema")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
public class RLModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "RLS_ID")
  private Long recordLocatorId;


  @Column(name = "data_type", nullable = false)
  private Long dataType;



  @Column(name = "system_id", nullable = false)
  private Long systemId;
  


  @Column(name = "patient_id", nullable = false)
  private String patientId;

  // public RLSPOSTAPISchema systemid(Integer systemid) {
  //   this.systemid = systemid;
  //   return this;
  // }

  // /**
  //  * Get systemid
  //  * @return systemid
  // */
  // @NotNull 
  // @Schema(name = "systemid", required = true)
  // public Integer getSystemid() {
  //   return systemid;
  // }

  // public void setSystemid(Integer systemid) {
  //   this.systemid = systemid;
  // }

  // public RLSPOSTAPISchema datatype(Integer datatype) {
  //   this.datatype = datatype;
  //   return this;
  // }

  // /**
  //  * Get datatype
  //  * @return datatype
  // */
  // @NotNull 
  // @Schema(name = "datatype", required = true)
  // public Integer getDatatype() {
  //   return datatype;
  // }

  // public void setDatatype(Integer datatype) {
  //   this.datatype = datatype;
  // }

  // public RLSPOSTAPISchema patientid(String patientid) {
  //   this.patientid = patientid;
  //   return this;
  // }

  // /**
  //  * Get patientid
  //  * @return patientid
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "patientid", required = true)
  // public String getPatientid() {
  //   return patientid;
  // }

  // public void setPatientid(String patientid) {
  //   this.patientid = patientid;
  // }

  // @Override
  // public boolean equals(Object o) {
  //   if (this == o) {
  //     return true;
  //   }
  //   if (o == null || getClass() != o.getClass()) {
  //     return false;
  //   }
  //   RLSPOSTAPISchema rlSPOSTAPISchema = (RLSPOSTAPISchema) o;
  //   return Objects.equals(this.systemid, rlSPOSTAPISchema.systemid) &&
  //       Objects.equals(this.datatype, rlSPOSTAPISchema.datatype) &&
  //       Objects.equals(this.patientid, rlSPOSTAPISchema.patientid);
  // }

  // @Override
  // public int hashCode() {
  //   return Objects.hash(systemid, datatype, patientid);
  // }

  // @Override
  // public String toString() {
  //   StringBuilder sb = new StringBuilder();
  //   sb.append("class RLSPOSTAPISchema {\n");
  //   sb.append("    systemid: ").append(toIndentedString(systemid)).append("\n");
  //   sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
  //   sb.append("    patientid: ").append(toIndentedString(patientid)).append("\n");
  //   sb.append("}");
  //   return sb.toString();
  // }

  // /**
  //  * Convert the given object to string with each line indented by 4 spaces
  //  * (except the first line).
  //  */
  // private String toIndentedString(Object o) {
  //   if (o == null) {
  //     return "null";
  //   }
  //   return o.toString().replace("\n", "\n    ");
  // }
}

