package org.algorithms.recursion;

import org.algorithms.binarySearch.BinarySearchRecursion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sum and countOfElements functions demonstrations;
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println(RecursionFunctions.sum(list));
        System.out.println(RecursionFunctions.countOfElements(list));

        // Binary search recursion
        System.out.println(BinarySearchRecursion.search(list, 8));
    }
}
