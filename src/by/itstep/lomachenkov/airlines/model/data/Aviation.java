package by.itstep.lomachenkov.airlines.model.data;

public class Aviation {
    private String model;
    private double cruiseSpeed;
    private double maxRange;
    private double fuelReserve;


    public Aviation() {
        model = "No name";
        cruiseSpeed = 0d;
        maxRange = 0d;
        fuelReserve = 0d;
    }

    public Aviation(String model, double cruiseSpeed, double maxRange, double fuelReserve) {
        this.model = model;
        this.cruiseSpeed = cruiseSpeed;
        this.maxRange = maxRange;
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
        this.cruiseSpeed = cruiseSpeed;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public double getFuelReserve() {
        return fuelReserve;
    }

    public void setFuelReserve(double fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    @Override
    public String toString() {
        return "Model is " + model + '\'' +
                ", cruiseSpeed = " + cruiseSpeed +
                ", maxRange = " + maxRange +
                ", fuelReserve = " + fuelReserve;
    }
}
