package by.itstep.lomachenkov.airlines.model.logic;

import by.itstep.lomachenkov.airlines.model.data.Aviation;
import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.FighterPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;

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

    public static Aviation findMaxCruiseSpeedPlane(List<Aviation> planes) {
        double maxCruiseSpeed = 0;
        int index = 0;

        for (Aviation plane : planes) {
            double planeSpeed = plane.getCruiseSpeed();
            if (planeSpeed > maxCruiseSpeed) {
                maxCruiseSpeed = planeSpeed;
                index = planes.indexOf(plane);
            }
        }

        return planes.get(index);
    }

    public static Aviation findMaxRangePlane(List<Aviation> planes) {
        double maxRange = 0;
        int index = 0;

        for (Aviation plane : planes) {
            double planeRange = plane.getMaxRange();
            if (planeRange > maxRange) {
                maxRange = planeRange;
                index = planes.indexOf(plane);
            }
        }

        return planes.get(index);
    }

    public static Aviation findMaxFuelReservePlane(List<Aviation> planes) {
        double maxFuelReserve = 0;
        int index = 0;

        for (Aviation plane : planes) {
            double planeFuelReserve = plane.getFuelReserve();
            if (planeFuelReserve > maxFuelReserve) {
                maxFuelReserve = planeFuelReserve;
                index = planes.indexOf(plane);
            }
        }

        return planes.get(index);
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
