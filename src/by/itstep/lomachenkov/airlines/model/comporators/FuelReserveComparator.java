package by.itstep.lomachenkov.airlines.model.comporators;

import by.itstep.lomachenkov.airlines.model.data.Aviation;

import java.util.Comparator;

public class FuelReserveComparator implements Comparator<Aviation> {
    private static FuelReserveComparator comparator;

    private FuelReserveComparator() {}

    @Override
    public int compare(Aviation plane1, Aviation plane2) {
        int res = 0;

        if (plane1.getFuelReserve() > plane2.getFuelReserve()) {
            res = 1;
        } else if (plane1.getCruiseSpeed() < plane2.getFuelReserve()) {
            res = -1;
        }

        return res;
    }

    public static FuelReserveComparator getInstance() {
        if (comparator == null) {
            comparator = new FuelReserveComparator();
        }

        return comparator;
    }
}
