package by.itstep.lomachenkov.airlines.model.logic;

import by.itstep.lomachenkov.airlines.model.data.Aviation;
import by.itstep.lomachenkov.airlines.model.data.CargoPlane;
import by.itstep.lomachenkov.airlines.model.data.PassengerPlane;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlaneManagerTest {
    private static List<Aviation> planes = new ArrayList<>();
    private static List<PassengerPlane> passengerPlanes = new ArrayList<>();
    private static List<CargoPlane> cargoPlanes = new ArrayList<>();

    @BeforeClass
    public static void init() {
        PassengerPlane plane1 = new PassengerPlane(256, 10.1, 4564.8);
        CargoPlane plane2 = new CargoPlane(11_000.2, 5.2, 1234.2);
        PassengerPlane plane3 = new PassengerPlane(289, 3.3, 1093);
        CargoPlane plane4 = new CargoPlane(10_000.8, 111.4, 9875.9);
        PassengerPlane plane5 = new PassengerPlane(234, 11.5, 1234);

        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);
        planes.add(plane4);
        planes.add(plane5);

        passengerPlanes.add(plane1);
        passengerPlanes.add(plane3);
        passengerPlanes.add(plane5);

        cargoPlanes.add(plane2);
        cargoPlanes.add(plane4);
    }

    @AfterClass
    public static void destroy() {
        planes = null;
        passengerPlanes = null;
        cargoPlanes = null;
    }

    @Test
    public void findMaxCruiseSpeedPlaneTest() {
        assertEquals(111.4,
                PlaneManager.findMaxCruiseSpeedPlane(planes).getCruiseSpeed(),
                0.001);
    }

    @Test
    public void findMaxRangePlaneTest() {
        assertEquals(9875.9,
                PlaneManager.findMaxRangePlane(planes).getMaxRange(),
                0.001);
    }

    @Test
    public void findMaxFuelReservePlaneTest() {
        assertEquals(0,
                PlaneManager.findMaxFuelReservePlane(planes).getFuelReserve(),
                0.001);
    }

    @Test
    public void getTotalCapacityTest() {
        assertEquals(779, PlaneManager.getTotalCapacity(passengerPlanes));
    }

    @Test
    public void getTotalLiftingCapacityTest() {
        assertEquals(21_001.0, PlaneManager.getTotalLiftingCapacity(cargoPlanes), 0.001);
    }
}
