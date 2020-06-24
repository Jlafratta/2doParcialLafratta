package edu.utn.parcial.service.integration;

import edu.utn.parcial.dto.CallQuantityDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/";

    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }

    public CallQuantityDto getCallsFromXmas(){
        return rest.getForObject(url+"call/xmas", CallQuantityDto.class);
    }

}
