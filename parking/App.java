package uz.jl.parking;

import uz.jl.parking.entity.Car;
import uz.jl.parking.service.ChorsuParkingService;
import uz.jl.parking.utils.Print;
import uz.jl.parking.utils.StaticVars;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Tue 10:36 AM. 11/2/2021
 */
public class App {
    public static void main(String[] args) {
        ChorsuParkingService service = new ChorsuParkingService();
        menu(service);
    }

    private static int menu(ChorsuParkingService service) {
        int choice = Print.getNumber(Print.ANSI_PURPLE, "Login/In/Out/Places/Exit -> 1/2/3/4/5 : ");
        if (choice == 1) {
            login();
        } else if (choice == 2) {
            in(service);
        } else if (choice == 3) {
            out();
        } else if (choice == 4) {
            service.availablePlaces();
        } else if (choice == 5) {
            return -1;
        } else {
            Print.println(Print.ANSI_RED, "Wrong choice");
        }
        return menu(service);
    }

    private static void out() {

    }

    private static void in(ChorsuParkingService service) {
        Car car = new Car();
        checkCarNumber(car);
        String timeEntering = Print.getString("Entering Time ");
        car.setEnteringTime(timeEntering);
        checkAndSet(service, car);
    }

    private static void checkAndSet(ChorsuParkingService service, Car car) {
        int floorIndex = Print.getNumber("Please Choose Flood ->1/2/3/4 ") - 1;
        int randomRowIndex = (int) Math.round(Math.random() * (StaticVars.ROW_COUNT - 1));
        int randomCeilIndex = (int) Math.round(Math.random() * (StaticVars.CEIL_COUNT - 1));
        Car checkCar = service.getFloors()[floorIndex].getRows()[randomRowIndex].getCeilList()[randomCeilIndex].getCar();
        if (Objects.nonNull(checkCar))
            checkAndSet(service, car);
        else
            service.getFloors()[floorIndex].getRows()[randomRowIndex].getCeilList()[randomCeilIndex].setCar(car);
    }

    private static void checkCarNumber(Car car) {
        String str = Print.getString("Car Number ");
        str = str.toUpperCase();
        String countryCode = str.substring(0, 2);
        if (!checkAlphabeticWithLength(countryCode, 2)) {
            Print.println(Print.ANSI_RED, "Please Type something norm string");
            checkCarNumber(car);
        }
        car.setCarNumber(str);
    }

    private static boolean checkAlphabeticWithLength(String str, int lng) {
        if (str.length() != lng) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) return false;
        }
        return true;
    }

    private static boolean checkAlphabetic(String str) {
        return checkAlphabeticWithLength(str, str.length());
    }

    private static void login() {

    }
}
