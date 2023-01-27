package org.openapitools.repository;

import org.openapitools.model.SYSModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<SYSModel,Long>{
    
}
