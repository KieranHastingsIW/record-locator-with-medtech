package com.metech.medtechsystem.Repository;


    
    import org.springframework.data.jpa.repository.JpaRepository;

import com.metech.medtechsystem.modles.SystemModel;

    
public interface SystemRepository extends JpaRepository<SystemModel, Long>{
        
    }
    