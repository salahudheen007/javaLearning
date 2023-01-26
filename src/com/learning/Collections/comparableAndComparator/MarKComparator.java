package com.learning.Collections.comparableAndComparator;

import java.util.Comparator;

public class MarKComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return new Integer(o1.getMark()).compareTo(new Integer(o2.getMark()));
    }
}
