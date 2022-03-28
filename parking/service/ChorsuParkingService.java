package uz.jl.parking.service;

import uz.jl.parking.entity.*;
import uz.jl.parking.utils.BaseUtil;
import uz.jl.parking.utils.Print;

import java.util.Objects;

import static uz.jl.parking.utils.StaticVars.*;

/**
 * @author Elmurodov Javohir, Tue 10:51 AM. 11/2/2021
 */
public class ChorsuParkingService extends ParkingService {
    private final Floor[] floors;

    public ChorsuParkingService() {
        this.floors = new Floor[FLOOR_COUNT];
        for (int i = 0; i < FLOOR_COUNT; i++) {
            floors[i] = new Floor(buildRows(), i);
        }
    }


    public void availablePlaces() {
        for (int i = 0; i < FLOOR_COUNT; i++) {
            Floor floor = floors[i];
            Print.println(Print.ANSI_PURPLE, floor.getFloorId() + "-floor");
            for (int j = 0; j < ROW_COUNT; j++) {
                Row row = floor.getRows()[j];
                for (int k = 0; k < CEIL_COUNT; k++) {
                    Ceil ceil = row.getCeilList()[k];
                    String color = (Objects.isNull(ceil.getCar())) ? Print.ANSI_GREEN : Print.ANSI_RED;
                    String message = floor.getFloorId() + row.getRowId() + ceil.getCeilId() + "\t";
                    Print.print(color, message);
                }
                Print.println("");
            }
        }
    }


    private Row[] buildRows() {
        Row[] rows = new Row[ROW_COUNT];
        for (int i = 0; i < ROW_COUNT; i++) {
            rows[i] = new Row(buildCeils(), BaseUtil.sequentialLetter(i + 65));
        }
        return rows;
    }

    private Ceil[] buildCeils() {
        Ceil[] ceils = new Ceil[CEIL_COUNT];
        for (int i = 0; i < CEIL_COUNT; i++) {
            Ceil ceil = new Ceil(i);
            ceils[i] = ceil;
        }
        return ceils;
    }

    public Floor[] getFloors() {
        return floors;
    }
}
