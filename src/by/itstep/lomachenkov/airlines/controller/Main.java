package by.itstep.lomachenkov.airlines.controller;

import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;
import by.itstep.lomachenkov.airlines.model.logic.PlaneManager;

public class Main {
    public static void main(String[] args) {
        CargoPlane cargoPlane =
                new CargoPlane("1",860,15000,8000,17500);
        PassengerPlane passengerPlane =
                new PassengerPlane("2", 888, 12, 21,12);
        System.out.println(PlaneManager.getMaxCruiseSpeed(cargoPlane, passengerPlane));
    }
}
