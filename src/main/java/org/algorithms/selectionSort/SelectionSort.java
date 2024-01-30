package org.algorithms.selectionSort;

import java.util.ArrayList;

public class SelectionSort<T extends Comparable<T>> {
    private ArrayList<T> list;

    public SelectionSort(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> selectionSort() {
        ArrayList<T> endList = new ArrayList<>();
        ArrayList<T> copyList = list;

        for (int i = 0; i < copyList.size(); ++i) {
            int smallestIndex = getSmallest();
            endList.add(copyList.remove(smallestIndex));
        }

        return endList;
    }

    private int getSmallest() {
        T smallest = list.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < list.size(); ++i) {
            T currentElement = list.get(i);
            switch (currentElement.compareTo(smallest)) {
                case -1:
                    smallest = currentElement;
                    smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
