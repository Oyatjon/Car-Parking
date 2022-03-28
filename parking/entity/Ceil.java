package uz.jl.parking.entity;

import java.util.UUID;

/**
 * @author Elmurodov Javohir, Tue 10:37 AM. 11/2/2021
 */
public class Ceil {
    private UUID id;
    private int ceilId;
    private Car car;

    public Ceil() {
        this.id = UUID.randomUUID();
    }

    public Ceil(int ceilId) {
        this.id = UUID.randomUUID();
        this.ceilId = ceilId;
    }

    public Ceil(Car car, int ceilId) {
        this.id = UUID.randomUUID();
        this.car = car;
        this.ceilId = ceilId;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCeilId() {
        return ceilId + 1;
    }

    public void setCeilId(int ceilId) {
        this.ceilId = ceilId;
    }
}
