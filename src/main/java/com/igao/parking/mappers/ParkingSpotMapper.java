package com.igao.parking.mappers;

import com.igao.parking.dtos.ParkingSpotDTO;
import com.igao.parking.models.CarModel;
import com.igao.parking.models.ParkingSpotModel;

public class ParkingSpotMapper {

    public static ParkingSpotModel mapByParkinSpotDTO(ParkingSpotDTO parkingSpotDTO){
        var parkingSpot = new ParkingSpotModel();
        parkingSpot.setParkingSpotNumber(parkingSpotDTO.getParkingSpotNumber());
        parkingSpot.setResponsibleName(parkingSpotDTO.getResponsibleName());
        parkingSpot.setApartment(parkingSpotDTO.getApartment());
        parkingSpot.setBlock(parkingSpotDTO.getBlock());

        var car = new CarModel();
        car.setLicensePlateCar(parkingSpotDTO.getCar().getLicensePlateCar());
        car.setBrandCar(parkingSpotDTO.getCar().getBrandCar());
        car.setModelCar(parkingSpotDTO.getCar().getModelCar());
        car.setColorCar(parkingSpotDTO.getCar().getColorCar());

        parkingSpot.setCar(car);

        return parkingSpot;
    }

}
