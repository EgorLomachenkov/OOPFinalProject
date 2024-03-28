package by.itstep.lomachenkov.airlines.model.data;

public class CargoPlane extends Aviation {
    private double liftingCapacity;

    public CargoPlane() {
        super();
        liftingCapacity = 0d;
    }

    public CargoPlane(double liftingCapacity) {
        super();
        this.liftingCapacity = liftingCapacity;
    }

    public CargoPlane(double liftingCapacity, double cruiseSpeed, double maxRange) {
        super(cruiseSpeed, maxRange);
        this.liftingCapacity = liftingCapacity;
    }

    public CargoPlane(double cruiseSpeed, double maxRange) {
        super(cruiseSpeed, maxRange);
    }

    public CargoPlane(String model, double cruiseSpeed, double maxRange, double fuelReserve, double liftingCapacity) {
        super(model, cruiseSpeed, maxRange, fuelReserve);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        if (liftingCapacity > 0) {
            this.liftingCapacity = liftingCapacity;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Lifting capacity = " + liftingCapacity;
    }
}
