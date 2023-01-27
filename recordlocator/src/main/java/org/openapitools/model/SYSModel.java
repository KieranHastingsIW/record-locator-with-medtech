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
 * RLSSYSTEMPOSTAPISchema
 */
@NoArgsConstructor
@Setter
@Getter
@Entity
@JsonTypeName("RLS_SYSTEM_POST_API_Schema")
@Table(name="system_tbl")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
public class SYSModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SYSTEM_ID")
  private long system_id;

  @JsonProperty("source_sys")
  @Column(name = "SOURCE_SYS", nullable = false)
  private String sourceSys;

  @JsonProperty("sys_type")
  @Column(name = "SYS_TYPE", nullable = false)
  private String sysType;

  @JsonProperty("loc_type")
  @Column(name = "LOC_TYPE", nullable = false)
  private String locType;

  @JsonProperty("third_party_id")
  @Column(name = "THIRD_PARTY_ID", nullable = false)
  private String thirdPartyId;


  @Column(name = "LOCATION", nullable = false)
  @JsonProperty("location")
  private String location;

  // @JsonIgnore
  // @OneToMany(mappedBy = "SYSTEM_TBL", cascade = CascadeType.ALL)
  // private List<RLModel> recordLocatorId;

  // public RLSSYSTEMPOSTAPISchema sourceSys(String sourceSys) {
  //   this.sourceSys = sourceSys;
  //   return this;
  // }

  // /**
  //  * Get sourceSys
  //  * @return sourceSys
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "source_sys", required = true)
  // public String getSourceSys() {
  //   return sourceSys;
  // }

  // public void setSourceSys(String sourceSys) {
  //   this.sourceSys = sourceSys;
  // }

  // public RLSSYSTEMPOSTAPISchema sysType(String sysType) {
  //   this.sysType = sysType;
  //   return this;
  // }

  // /**
  //  * Get sysType
  //  * @return sysType
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "sys_type", required = true)
  // public String getSysType() {
  //   return sysType;
  // }

  // public void setSysType(String sysType) {
  //   this.sysType = sysType;
  // }

  // public RLSSYSTEMPOSTAPISchema locType(String locType) {
  //   this.locType = locType;
  //   return this;
  // }

  // /**
  //  * Get locType
  //  * @return locType
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "loc_type", required = true)
  // public String getLocType() {
  //   return locType;
  // }

  // public void setLocType(String locType) {
  //   this.locType = locType;
  // }

  // public RLSSYSTEMPOSTAPISchema thirdPartyId(String thirdPartyId) {
  //   this.thirdPartyId = thirdPartyId;
  //   return this;
  // }

  // /**
  //  * Get thirdPartyId
  //  * @return thirdPartyId
  // */
  // @Size(min = 1) 
  // @Schema(name = "third_party_id", required = false)
  // public String getThirdPartyId() {
  //   return thirdPartyId;
  // }

  // public void setThirdPartyId(String thirdPartyId) {
  //   this.thirdPartyId = thirdPartyId;
  // }

  // public RLSSYSTEMPOSTAPISchema location(String location) {
  //   this.location = location;
  //   return this;
  // }

  // /**
  //  * Get location
  //  * @return location
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "location", required = true)
  // public String getLocation() {
  //   return location;
  // }

  // public void setLocation(String location) {
  //   this.location = location;
  // }

  // @Override
  // public boolean equals(Object o) {
  //   if (this == o) {
  //     return true;
  //   }
  //   if (o == null || getClass() != o.getClass()) {
  //     return false;
  //   }
  //   RLSSYSTEMPOSTAPISchema rlSSYSTEMPOSTAPISchema = (RLSSYSTEMPOSTAPISchema) o;
  //   return Objects.equals(this.sourceSys, rlSSYSTEMPOSTAPISchema.sourceSys) &&
  //       Objects.equals(this.sysType, rlSSYSTEMPOSTAPISchema.sysType) &&
  //       Objects.equals(this.locType, rlSSYSTEMPOSTAPISchema.locType) &&
  //       Objects.equals(this.thirdPartyId, rlSSYSTEMPOSTAPISchema.thirdPartyId) &&
  //       Objects.equals(this.location, rlSSYSTEMPOSTAPISchema.location);
  // }

  // @Override
  // public int hashCode() {
  //   return Objects.hash(sourceSys, sysType, locType, thirdPartyId, location);
  // }

  // @Override
  // public String toString() {
  //   StringBuilder sb = new StringBuilder();
  //   sb.append("class RLSSYSTEMPOSTAPISchema {\n");
  //   sb.append("    sourceSys: ").append(toIndentedString(sourceSys)).append("\n");
  //   sb.append("    sysType: ").append(toIndentedString(sysType)).append("\n");
  //   sb.append("    locType: ").append(toIndentedString(locType)).append("\n");
  //   sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
  //   sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

