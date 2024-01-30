package org.algorithms.binarySearch;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> {
    private List<T> list;
    private T item;

    public BinarySearch(List<T> list, T item) {
        this.list = list;
        this.item = item;
    }

    public Integer search() {
        int lowPosition = 0;
        int highPosition = list.size() - 1;

        while (lowPosition <= highPosition) {
            int midPosition = (lowPosition + highPosition) / 2;
            T guess = list.get(midPosition);

            switch (guess.compareTo(item)) {
                case 1:
                    highPosition = midPosition - 1;
                    break;
                case 0:
                    return midPosition;
                case -1:
                    lowPosition = midPosition + 1;
                    break;
            }
        }
        return null;
    }
}
