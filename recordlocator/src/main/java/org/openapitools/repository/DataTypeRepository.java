package org.openapitools.repository;

import org.openapitools.model.DTModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataTypeRepository extends JpaRepository<DTModel, Long>{
    
}
