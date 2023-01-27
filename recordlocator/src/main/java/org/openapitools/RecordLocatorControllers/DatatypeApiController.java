package org.openapitools.RecordLocatorControllers;

import org.openapitools.model.DTModel;
import org.openapitools.services.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.springframework.web.bind.annotation.RequestMethod;


@AllArgsConstructor
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@RestController
@RequestMapping("${openapi.recordLocator.base-path:/rls}")
public class DatatypeApiController implements DatatypeApi {

    private final NativeWebRequest request;
    @Autowired
    public DataTypeService dataTypeService;


    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<DTModel>> datatypeGet(){
        return new ResponseEntity<>(dataTypeService.getAllDataTypes(),HttpStatus.OK);
    }

    @RequestMapping(value="/dataType/{dataTypeId}", method=RequestMethod.GET)
    public ResponseEntity<DTModel> dataTypeGetById(@PathVariable Long dataTypeId) throws Exception{
        DTModel dataType = dataTypeService.getDataType(dataTypeId);
        return new ResponseEntity<>(dataType, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DTModel> datatypePost(@Valid @RequestBody DTModel dataType){
        return new ResponseEntity<>(dataTypeService.createDataType(dataType),HttpStatus.CREATED);
    }

}
