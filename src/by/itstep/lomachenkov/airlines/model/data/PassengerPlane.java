package by.itstep.lomachenkov.airlines.model.data;

public class PassengerPlane extends Aviation {
    private int seatsAmount;

    public PassengerPlane() {
        super();
        seatsAmount = 0;
    }

    public PassengerPlane(double cruiseSpeed, double maxRange) {
        super(cruiseSpeed, maxRange);
    }

    public PassengerPlane(int seatsAmount) {
        super();
        this.seatsAmount = seatsAmount;
    }

    public PassengerPlane(int seatsAmount, double cruiseSpeed, double maxRange) {
        super(cruiseSpeed, maxRange);
        this.seatsAmount = seatsAmount;
    }

    public PassengerPlane(String model, double cruiseSpeed, double maxRange, double fuelReserve, int seatsAmount) {
        super(model, cruiseSpeed, maxRange, fuelReserve);
        this.seatsAmount = seatsAmount;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        if (seatsAmount > 0) {
            this.seatsAmount = seatsAmount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Amount of seats = " + seatsAmount;
    }
}
