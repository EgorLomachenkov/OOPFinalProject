package by.itstep.lomachenkov.airlines.model.data;

import by.itstep.lomachenkov.airlines.model.comporators.CruiseSpeedComparator;

import java.util.Comparator;

public class Aviation implements Comparable<Aviation> {
    private String model;
    private double cruiseSpeed;
    private double maxRange;
    private double fuelReserve;
    protected static Comparator<Aviation> comparator;

    static {
        comparator = CruiseSpeedComparator.getInstance();
    }

    public static void setComparator(Comparator<Aviation> comparator) {
        Aviation.comparator = comparator;
    }

    protected Aviation() {
        model = "No name";
        cruiseSpeed = 0d;
        maxRange = 0d;
        fuelReserve = 0d;
    }

    protected Aviation(double cruiseSpeed, double maxRange) {
        this();
        this.cruiseSpeed = cruiseSpeed;
        this.maxRange = maxRange;
    }

    protected Aviation(String model, double cruiseSpeed, double maxRange, double fuelReserve) {
        this(cruiseSpeed, maxRange);
        this.model = model;
        this.fuelReserve = fuelReserve;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        if (cruiseSpeed > 0) {
            this.cruiseSpeed = cruiseSpeed;
        }
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        if (maxRange > 0) {
            this.maxRange = maxRange;
        }
    }

    public double getFuelReserve() {
        return fuelReserve;
    }

    public void setFuelReserve(double fuelReserve) {
        if (fuelReserve > 0) {
            this.fuelReserve = fuelReserve;
        }
    }

    @Override
    public String toString() {
        return "Model is " + model +
                ", cruiseSpeed = " + cruiseSpeed +
                ", maxRange = " + maxRange +
                ", fuelReserve = " + fuelReserve;
    }

    @Override
    public int compareTo(Aviation plane) {
        return comparator.compare(this, plane);
    }
}
