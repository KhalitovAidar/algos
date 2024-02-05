package org.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionFunctions {
    public static int sum(List<Integer> list) {
        if (list.isEmpty())
            return 0;
        else {
            if (list.size() == 1) {
                return list.get(0);
            }
        }

        int first = list.get(0);
        List<Integer> otherList = new ArrayList<>(list.subList(1, list.size()));

        return first + sum(otherList);
    }

    public static int countOfElements(List<Integer> list) {
        if (list.isEmpty())
            return 0;
        else {
            List<Integer> otherList = new ArrayList<>(list.subList(1, list.size()));
            return 1 + countOfElements(otherList);
        }
    }
}
