package com.igao.parking.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ParkingSpotDTO {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    @NotNull
    private CarDTO car;
}