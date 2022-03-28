package uz.jl.parking.entity;

/**
 * @author Elmurodov Javohir, Tue 10:50 AM. 11/2/2021
 */
public class Parking {
    private Floor[] floors;

    public Parking(Floor[] floors) {
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
