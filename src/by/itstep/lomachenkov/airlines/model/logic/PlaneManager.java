package by.itstep.lomachenkov.airlines.model.logic;

import by.itstep.lomachenkov.airlines.model.data.Aviation;
import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;

public class PlaneManager {
    public static int getTotalCapacity(PassengerPlane... planes) {
        int totalCapacity = 0;

        for (PassengerPlane plane : planes) {
            totalCapacity += plane.getSeatsAmount();
        }

        return totalCapacity;
    }

    public static double getTotalLiftingCapacity(CargoPlane... planes) {
        double totalLiftingCapacity = 0d;

        for (CargoPlane plane : planes) {
            totalLiftingCapacity += plane.getLiftingCapacity();
        }

        return totalLiftingCapacity;
    }

    public static double getMaxCruiseSpeed(Aviation... planes) {
        double maxCruiseSpeed = 0;

        for (Aviation plane : planes) {
            maxCruiseSpeed = plane.getCruiseSpeed() > maxCruiseSpeed ?
                    plane.getCruiseSpeed() : maxCruiseSpeed;
        }

        return maxCruiseSpeed;
    }

    public static double getMaxRange(Aviation... planes) {
        double maxRange = 0;

        for (Aviation plane : planes) {
            maxRange = plane.getCruiseSpeed() > maxRange ?
                    plane.getCruiseSpeed() : maxRange;
        }

        return maxRange;
    }

    public static double getMaxFuelReserve(Aviation... planes) {
        double maxFuelReserve = 0;

        for (Aviation plane : planes) {
            maxFuelReserve = plane.getCruiseSpeed() > maxFuelReserve ?
                    plane.getCruiseSpeed() : maxFuelReserve;
        }

        return maxFuelReserve;
    }
}
