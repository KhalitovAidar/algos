package org.algorithms.depthSearch;

import java.util.*;

public class DepthSearch {
    public static String search(HashMap<String, List<String>> map, String name) {

        Deque<String> deque = new LinkedList<>(map.get(name));
        List<String> searched = new LinkedList<>();

        while (!deque.isEmpty()) {
            String personName = deque.remove();

            if (!searched.contains(personName)) {
                if (isSeller(personName)) {
                    return personName;
                } else {
                    deque.addAll(map.get(personName));
                    searched.add(personName);
                }
            }
        }

        return null;

    }

    public static boolean isSeller(String name) {

        return name.contains("m");

    }
}
