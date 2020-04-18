package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kruskal {
    private final Graph graph;
    private final Map<String, Boolean> visitedVertexMap; //String take Veretex key , Boolean take is vertex visited or not
    private final List<Edge> result;

    public Kruskal(Graph graph) {
        this.graph = graph;
        this.visitedVertexMap = new HashMap<>();
        this.result = new ArrayList<>();
    }

    public List<Edge> run() {
        sortEdgeList(); //Edge list sorted
        createVisitedVertexMap(); //visited vertex setted default false


        graph.getEdgeList().forEach(edge -> {
            if (isVerticesOfEdgeNotVisited(edge)) {
                visitedVertexMap.put(edge.getSource().getKey(), true);
                visitedVertexMap.put(edge.getDestination().getKey(), true);
                result.add(edge);
            }

        });
        return result;
    }

    private boolean isVerticesOfEdgeNotVisited(Edge edge) {
        return !(visitedVertexMap.get(edge.getSource().getKey()) || visitedVertexMap.get(edge.getDestination().getKey()));
    }

    public void sortEdgeList() {
        graph.getEdgeList().sort(Comparator.comparing(Edge::getWeight));
    }

    public void createVisitedVertexMap() {
        graph.getVertexMap().forEach((key, value) -> {
            visitedVertexMap.put(key, false);
        });
    }
}

