package org.algorithms.depthSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> graph = new HashMap<>();
        graph.put("you", List.of("alice", "bob", "claire"));
        graph.put("bob", List.of("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", List.of("thom", "jonny"));
        graph.put("anuj", List.of());
        graph.put("peggy", List.of());
        graph.put("thom", List.of());
        graph.put("jonny", List.of());

        System.out.println(DepthSearch.search(graph, "you"));
    }
}
