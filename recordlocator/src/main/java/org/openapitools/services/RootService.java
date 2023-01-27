package org.openapitools.services;

import java.util.List;


import org.openapitools.model.RLModel;

public interface RootService {
    List<RLModel> getLocations(String patientid);
    List<RLModel> getRecordLocatorWithDataType( String patientId,  Long dataType);
    RLModel createRecord(RLModel recorLocation);
}
