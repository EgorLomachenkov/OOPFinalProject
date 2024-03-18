package by.itstep.lomachenkov.airlines.model.comporators;

import by.itstep.lomachenkov.airlines.model.data.Aviation;

import java.util.Comparator;

public class CruiseSpeedComparator implements Comparator<Aviation> {
    private static CruiseSpeedComparator comparator;

    private CruiseSpeedComparator() {}

    @Override
    public int compare(Aviation plane1, Aviation plane2) {
        int res = 0;

        if (plane1.getCruiseSpeed() > plane2.getCruiseSpeed()) {
            res = 1;
        } else if (plane1.getCruiseSpeed() < plane2.getCruiseSpeed()) {
            res = -1;
        }

        return res;
    }

    public static CruiseSpeedComparator getInstance() {
        if (comparator == null) {
            comparator = new CruiseSpeedComparator();
        }

        return comparator;
    }
}
