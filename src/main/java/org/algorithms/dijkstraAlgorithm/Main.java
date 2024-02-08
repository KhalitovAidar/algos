package org.algorithms.dijkstraAlgorithm;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Graph table
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6);
        graph.get("start").put("b", 2);

        graph.put("a", new HashMap<>());
        graph.get("a").put("end", 1);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3);
        graph.get("b").put("end", 5);

        graph.put("end", new HashMap<>());

        // Costs table
        HashMap<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("end", 9999999);

        // Parents table
        HashMap<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("end", null);

        Dijkstra.start(graph, costs, parents);
    }
}
