package edu.utn.parcial.service;

import edu.utn.parcial.dto.CallQuantityDto;
import edu.utn.parcial.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public CallQuantityDto getCallsFromXmas(){
        return integrationComponent.getCallsFromXmas();
    }
}
