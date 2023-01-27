package org.openapitools.services;

import java.util.List;

import org.openapitools.model.DTModel;

public interface DataTypeService {
    List<DTModel> getAllDataTypes();
    DTModel createDataType(DTModel dataType);
    public DTModel getDataType(Long dataTypeId);
}
