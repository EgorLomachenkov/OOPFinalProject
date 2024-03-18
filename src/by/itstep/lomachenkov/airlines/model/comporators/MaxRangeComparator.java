package by.itstep.lomachenkov.airlines.model.comporators;

import by.itstep.lomachenkov.airlines.model.data.Aviation;

import java.util.Comparator;

public class MaxRangeComparator implements Comparator<Aviation> {
    private static MaxRangeComparator comparator;

    private MaxRangeComparator() {}

    @Override
    public int compare(Aviation plane1, Aviation plane2) {
        int res = 0;

        if (plane1.getMaxRange() > plane2.getMaxRange()) {
            res = 1;
        } else if (plane1.getMaxRange() < plane2.getMaxRange()) {
            res = -1;
        }

        return res;
    }

    public static MaxRangeComparator getInstance() {
        if (comparator == null) {
            comparator = new MaxRangeComparator();
        }

        return comparator;
    }
}
