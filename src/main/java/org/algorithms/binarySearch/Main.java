package org.algorithms.binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        int length = random.nextInt(0, 200);
        while (length != 0) {
            list.add(random.nextInt(0, 200));
            length -= 1;
        }

        list = list.stream().sorted().toList();
        System.out.println(list);

        BinarySearch<Integer> binarySearch = new BinarySearch<>(list, 100);
        System.out.println(binarySearch.search());
    }
}
