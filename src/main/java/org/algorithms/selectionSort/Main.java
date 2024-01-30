package org.algorithms.selectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        int length = random.nextInt(0, 200);
        while (length != 0) {
            list.add(random.nextInt(0, 200));
            length -= 1;
        }

        System.out.println(list);

        SelectionSort<Integer> selectionSort = new SelectionSort<>(list);

        System.out.println(selectionSort.selectionSort());
    }
}
