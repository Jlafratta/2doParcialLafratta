package edu.utn.parcial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallQuantityDto {


    Integer quantity;

    public CallQuantityDto(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
