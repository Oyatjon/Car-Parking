package uz.jl.parking.service;

import uz.jl.parking.entity.Parking;

/**
 * @author Elmurodov Javohir, Tue 10:51 AM. 11/2/2021
 */
public class ParkingService {
    protected Parking parking;

    public void availablePlaces() {
        System.out.println("Available places");
    }


    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
