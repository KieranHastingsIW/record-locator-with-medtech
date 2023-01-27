package org.openapitools.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.*;

/**
 * RLSDataTypePOSTAPISchema
 */

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="DATATYPE_TBL")
@JsonTypeName("RLS_DataType_POST_API_Schema")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
public class DTModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "type_id")
  private long type_id;
  
  @JsonProperty("description")
  @Column(name = "type_desc", nullable = false)
  private String description;

  @NonNull
  @Column(name = "rank", nullable = false)
  @JsonProperty("rank")
  private Integer rank;








  // public RLSDataTypePOSTAPISchema description(String description) {
  //   this.description = description;
  //   return this;
  // }

  // /**
  //  * Get description
  //  * @return description
  // */
  // @NotNull @Size(min = 1) 
  // @Schema(name = "description", required = true)
  // public String getDescription() {
  //   return description;
  // }

  // public void setDescription(String description) {
  //   this.description = description;
  // }

  // public RLSDataTypePOSTAPISchema rank(Integer rank) {
  //   this.rank = rank;
  //   return this;
  // }

  // /**
  //  * Get rank
  //  * @return rank
  // */
  // @NotNull 
  // @Schema(name = "rank", required = true)
  // public Integer getRank() {
  //   return rank;
  // }

  // public void setRank(Integer rank) {
  //   this.rank = rank;
  // }

  // @Override
  // public boolean equals(Object o) {
  //   if (this == o) {
  //     return true;
  //   }
  //   if (o == null || getClass() != o.getClass()) {
  //     return false;
  //   }
  //   RLSDataTypePOSTAPISchema rlSDataTypePOSTAPISchema = (RLSDataTypePOSTAPISchema) o;
  //   return Objects.equals(this.description, rlSDataTypePOSTAPISchema.description) &&
  //       Objects.equals(this.rank, rlSDataTypePOSTAPISchema.rank);
  // }

  // @Override
  // public int hashCode() {
  //   return Objects.hash(description, rank);
  // }

  // @Override
  // public String toString() {
  //   StringBuilder sb = new StringBuilder();
  //   sb.append("class RLSDataTypePOSTAPISchema {\n");
  //   sb.append("    description: ").append(toIndentedString(description)).append("\n");
  //   sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

