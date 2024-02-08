package org.algorithms.dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dijkstra {
    public static void start(HashMap<String, HashMap<String, Integer>> graph,
                             HashMap<String, Integer> costs,
                             HashMap<String, String> parents) {
        List<String> processed = new ArrayList<>();

        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            Integer cost = costs.get(node);
            HashMap<String, Integer> neighbors = graph.get(node);
            for (String n: neighbors.keySet()) {
                Integer new_cost = cost + neighbors.get(n);
                if (costs.get(n) > new_cost) {
                    costs.put(n, new_cost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
        }
        node = findLowestCostNode(costs, processed);
    }

    private static String findLowestCostNode(HashMap<String, Integer> costs, List<String> processed) {
        Integer lowest_cost = 9999999;
        String lowest_node = null;

        for (String node: costs.keySet()) {
            Integer cost = costs.get(node);
            if (cost < lowest_cost && !processed.contains(node)) {
                lowest_cost = cost;
                lowest_node = node;
            }
        }
        return lowest_node;
    }
}
