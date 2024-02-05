package org.algorithms.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchRecursion {
    public static Integer search(List<Integer> list, Integer el) {
        Integer current = list.get(list.size() / 2);
        int currentIndex = list.size() / 2;

        if (current.compareTo(el) == 0)
            return currentIndex;
        else {
            switch (current.compareTo(el)) {
                case 1:
                    return search(list.subList(0, currentIndex), el);
                case -1:
                    return search(list.subList(currentIndex, list.size()), el);
            }
        }

        return null;
    }
}
