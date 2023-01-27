package org.openapitools.services;

import java.util.List;
import java.util.Optional;

import org.openapitools.model.SYSModel;
import org.openapitools.repository.SystemRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SystemServiceImpl implements SystemService{

    private SystemRepository systemRepository;

    public Optional<SYSModel> getSystem(Long systemId){
        return systemRepository.findById(systemId);
    }

    @Override
    public List<SYSModel> getAllSystems() {
        return systemRepository.findAll();
    }

    @Override
    public SYSModel createSystem(SYSModel system) {
        return systemRepository.save(system);
    }
    
}
