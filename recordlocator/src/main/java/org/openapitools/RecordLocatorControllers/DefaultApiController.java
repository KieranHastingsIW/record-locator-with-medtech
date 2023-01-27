package org.openapitools.RecordLocatorControllers;


import org.openapitools.model.RLModel;
import org.openapitools.services.RootService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

import org.springframework.web.context.request.NativeWebRequest;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.Valid;

@AllArgsConstructor
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@RestController
@RequestMapping("${openapi.recordLocator.base-path:/rls}")
public class DefaultApiController implements DefaultApi {

    private final NativeWebRequest request;

    private RootService rootService;


    
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @RequestMapping(value="/{patientId}", method=RequestMethod.GET)
    public ResponseEntity<List<RLModel>> getRecordLocator(@PathVariable String patientId) throws Exception{
        List<RLModel> records = rootService.getLocations(patientId);
        return new ResponseEntity<>(records, HttpStatus.OK);
    }
    @RequestMapping(value="/{patientId}/{dataType}", method=RequestMethod.GET)
    public ResponseEntity<List<RLModel>> getRecordLocatorWithDataType(@PathVariable String patientId, @PathVariable Long dataType) throws Exception{
        List<RLModel> records = rootService.getLocations(patientId);
        return new ResponseEntity<>(records, HttpStatus.OK);
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public ResponseEntity<RLModel> rootPost(@Valid @RequestBody RLModel rlSPOSTAPISchema){
        RLModel recordLocation = rootService.createRecord(rlSPOSTAPISchema);
        return new ResponseEntity<>(recordLocation,HttpStatus.CREATED);
    }
}
