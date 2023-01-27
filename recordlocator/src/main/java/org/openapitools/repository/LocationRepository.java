package org.openapitools.repository;



import java.util.List;
import java.util.Optional;

import org.openapitools.model.RLModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LocationRepository extends JpaRepository<RLModel, Long>{
    Optional<List<RLModel>> findAllByPatientId(String patientId);
    Optional<List<RLModel>> findAllByPatientIdAndDataType(String patientId, Long long1);
    // RLModel save(RLModel recordLocation);
}
