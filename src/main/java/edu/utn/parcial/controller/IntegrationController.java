package edu.utn.parcial.controller;

import edu.utn.parcial.dto.CallQuantityDto;
import edu.utn.parcial.service.IntegrationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class IntegrationController {
    @Autowired
    IntegrationService integrationService;

    @GetMapping("/xmasCalls")
    @ApiOperation(value = "Trae la cantidad de llamadas de la navidad del 92")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Llamadas encontradas"),
            @ApiResponse(code = 204, message = "No se encontraron llamadas en esa fecha")
    })
    public ResponseEntity<CallQuantityDto> getCallsFromXmasApi(){
        CallQuantityDto dto = integrationService.getCallsFromXmas();
        return (dto != null) ? ResponseEntity.ok(dto) : ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
