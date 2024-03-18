package by.itstep.lomachenkov.airlines.model.logic;

import by.itstep.lomachenkov.airlines.model.data.Aviation;
import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.FighterPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlaneManager {
    public static int getTotalCapacity(List<PassengerPlane> planes) {
        int totalCapacity = 0;

        for (PassengerPlane plane : planes) {
            totalCapacity += plane.getSeatsAmount();
        }

        return totalCapacity;
    }

    public static double getTotalLiftingCapacity(List<CargoPlane> planes) {
        double totalLiftingCapacity = 0d;

        for (CargoPlane plane : planes) {
            totalLiftingCapacity += plane.getLiftingCapacity();
        }

        return totalLiftingCapacity;
    }

    public static int getTotalMissilesAmount(List<FighterPlane> planes) {
        int totalMissilesAmount = 0;

        for (FighterPlane plane : planes) {
            totalMissilesAmount += plane.getMissilesAmount();
        }

        return totalMissilesAmount;
    }

    public static double getMaxCruiseSpeed(List<Aviation> planes) {
        double maxCruiseSpeed = 0;

        for (Aviation plane : planes) {
            maxCruiseSpeed = plane.getCruiseSpeed() > maxCruiseSpeed ?
                    plane.getCruiseSpeed() : maxCruiseSpeed;
        }

        return maxCruiseSpeed;
    }

    public static double getMaxRange(List<Aviation> planes) {
        double maxRange = 0;

        for (Aviation plane : planes) {
            maxRange = plane.getMaxRange() > maxRange ?
                    plane.getMaxRange() : maxRange;
        }

        return maxRange;
    }

    public static double getMaxFuelReserve(List<Aviation> planes) {
        double maxFuelReserve = 0;

        for (Aviation plane : planes) {
            maxFuelReserve = plane.getFuelReserve() > maxFuelReserve ?
                    plane.getFuelReserve() : maxFuelReserve;
        }

        return maxFuelReserve;
    }

    public static List<Aviation> findByCruiseSpeed(List<Aviation> planes, double minSpeed, double maxSpeed) {
        List<Aviation> planesHolder = new ArrayList<>(planes);
        Iterator<Aviation> iterator = planesHolder.iterator();

        while (iterator.hasNext()) {
            double speed = iterator.next().getCruiseSpeed();
            if (speed > maxSpeed || speed < minSpeed) {
                iterator.remove();
            }
        }

        return planesHolder;
    }

    public static List<Aviation> findByRange(List<Aviation> planes,
                                             double minRange,
                                             double maxRange) {
        List<Aviation> planesHolder = new ArrayList<>(planes);
        Iterator<Aviation> iterator = planesHolder.iterator();

        while (iterator.hasNext()) {
            double range = iterator.next().getMaxRange();
            if (range > maxRange || range < minRange) {
                iterator.remove();
            }
        }

        return planesHolder;
    }

    public static List<Aviation> findByFuelReserve(List<Aviation> planes,
                                                   double minFuelReserve,
                                                   double maxFuelReserve) {
        List<Aviation> planesHolder = new ArrayList<>(planes);
        Iterator<Aviation> iterator = planesHolder.iterator();

        while (iterator.hasNext()) {
            double fuelReserve = iterator.next().getFuelReserve();
            if (fuelReserve > maxFuelReserve || fuelReserve < minFuelReserve) {
                iterator.remove();
            }
        }

        return planesHolder;
    }

}
