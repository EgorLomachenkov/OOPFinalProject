package by.itstep.lomachenkov.airlines.controller;

import by.itstep.lomachenkov.airlines.model.comporators.MaxRangeComparator;
import by.itstep.lomachenkov.airlines.model.data.Aviation;
import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;
import by.itstep.lomachenkov.airlines.model.logic.PlaneManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassengerPlane plane1 = new PassengerPlane(10.1, 4564.8);
        CargoPlane plane2 = new CargoPlane(5.2, 1234.2);
        PassengerPlane plane3 = new PassengerPlane(3.3, 1093);
        CargoPlane plane4 = new CargoPlane(111.4, 9875.9);
        PassengerPlane plane5 = new PassengerPlane(11.5, 1234);


        List<Aviation> aviationList = new ArrayList<>();
        aviationList.add(plane1);
        aviationList.add(plane2);
        aviationList.add(plane3);
        aviationList.add(plane4);
        aviationList.add(plane5);

        Collections.sort(aviationList);

        List<Aviation> byRange
                = PlaneManager.findByRange(aviationList, 1234, 7500);

        for (Aviation plane : byRange) {
            System.out.println(plane);
        }

    }
}
