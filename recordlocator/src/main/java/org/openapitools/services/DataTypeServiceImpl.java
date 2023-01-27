package org.openapitools.services;

import java.util.List;
import java.util.Optional;

import org.openapitools.model.DTModel;
import org.openapitools.repository.DataTypeRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DataTypeServiceImpl implements DataTypeService{

    private DataTypeRepository dataTypeRepository;

    @Override
    public List<DTModel> getAllDataTypes() {
        return dataTypeRepository.findAll();
    }

    @Override
    public DTModel createDataType(DTModel dataType) {
        return dataTypeRepository.save(dataType);
    }

    public DTModel getDataType(Long dataTypeId){
        Optional<DTModel> dataType = dataTypeRepository.findById(dataTypeId);
        if (dataType.isPresent()){
            return dataType.get();
        }
        else{
            return null;
        }
    }


}
