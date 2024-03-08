package by.itstep.lomachenkov.airlines.model.data;

public class CargoPlane extends Aviation {
    private double liftingCapacity;

    public CargoPlane() {
        liftingCapacity = 0d;
    }

    public CargoPlane(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public CargoPlane(String model, double cruiseSpeed, double maxRange, double fuelReserve, double liftingCapacity) {
        super(model, cruiseSpeed, maxRange, fuelReserve);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lifting capacity = " + liftingCapacity;
    }
}
