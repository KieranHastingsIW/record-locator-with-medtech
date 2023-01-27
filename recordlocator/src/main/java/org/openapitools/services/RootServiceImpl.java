package org.openapitools.services;

import java.util.List;
import java.util.Optional;


import org.openapitools.model.RLModel;
import org.openapitools.repository.LocationRepository;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RootServiceImpl implements RootService{

    private LocationRepository locationRepository;

    private DataTypeService dataTypeService;

    private SystemService systemService;

    @Override
    public List<RLModel> getLocations(String patientid) {
            Optional<List<RLModel>> rls = locationRepository.findAllByPatientId(patientid);
            return unwrap(rls);
    }

    @Override
    public List<RLModel> getRecordLocatorWithDataType( String patientId,  Long dataType){
            Optional<List<RLModel>> rls = locationRepository.findAllByPatientIdAndDataType(patientId, dataType);
            return unwrap(rls);
    }

    public List<RLModel> unwrap(Optional<List<RLModel>> optionalList){
        if (optionalList.isPresent()) {
            return optionalList.get();
         } else {
            throw new NotFoundException("No Records found with given Patient ID");
         }
    }

    @Override
    public RLModel createRecord(RLModel recordLocation) {

        Long dataType = recordLocation.getDataType();
        Long systemId = recordLocation.getSystemId();
        if (dataTypeService.getDataType(dataType) != null && systemService.getSystem(systemId).isPresent()){
            return locationRepository.save(recordLocation);
        }
        else {return null;}

    }
    
}


