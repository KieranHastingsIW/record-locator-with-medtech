package org.openapitools.RecordLocatorControllers;


import org.apache.catalina.connector.Response;
import org.openapitools.model.SYSModel;
import org.openapitools.services.SystemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@RestController
@AllArgsConstructor 
@RequestMapping("${openapi.recordLocator.base-path:/rls}")
public class SystemApiController implements SystemApi {

    private final NativeWebRequest request;

    private SystemService systemService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<SYSModel>> systemGet(){
        return new ResponseEntity<>(systemService.getAllSystems(), HttpStatus.OK);
    }


}
