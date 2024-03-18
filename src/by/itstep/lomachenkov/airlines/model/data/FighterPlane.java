package by.itstep.lomachenkov.airlines.model.data;

public class FighterPlane extends Aviation {
    private int missilesAmount;

    public FighterPlane() {
        super();
        this.missilesAmount = 0;
    }


    public FighterPlane(int missilesAmount) {
        super();
        this.missilesAmount = missilesAmount;
    }

    public FighterPlane(String model, double cruiseSpeed, double maxRange, double fuelReserve, int missilesAmount) {
        super(model, cruiseSpeed, maxRange, fuelReserve);
        this.missilesAmount = missilesAmount;
    }

    public int getMissilesAmount() {
        return missilesAmount;
    }

    public void setMissilesAmount(int missilesAmount) {
        if (missilesAmount > -1) {
            this.missilesAmount = missilesAmount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Missiles amount = " + missilesAmount;
    }
}
