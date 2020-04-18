package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Dijkstra {
    private final Graph graph;
    private Map<Vertex, Integer> costs;
    private Map<Vertex, Boolean> isVisited;

    public Dijkstra(Graph graph) {
        this.isVisited = new HashMap<>();
        this.costs = new HashMap<>();
        this.graph = graph;
    }

    public Map<Vertex, Integer> run(String beginning) {
        Vertex beginner = new Vertex();
        initializeMaps(beginner);

        while (!isAllVerticesVisited())
        {
            iterateVisitedVertices();
        }

        return costs;
    }


    public int findSmallerVertex(Vertex vertex) //find smaller cost vertex for take next
    {
        vertex.getEdgeList().sort(Comparator.comparing(Edge::getWeight)); //sorted list
        return vertex.getEdgeList().get(0).getWeight(); //returned first index
    }

    public void iterateVisitedVertices() {
        Vertex nextVertex = new Vertex();
        int smallestNeighborCost = Integer.MAX_VALUE;
        for (Vertex vertex : graph.getVertexMap().values()) {
            if (isVisited.get(vertex) && smallestNeighborCost > findSmallerVertex(vertex)) {
                smallestNeighborCost = costs.get(vertex) + findSmallerVertex(vertex);
                nextVertex = vertex.getEdgeList().get(0).getDestination();
            }
        }
        isVisited.put(nextVertex,true);
        costs.put(nextVertex,smallestNeighborCost);
    }

    public Boolean isAllVerticesVisited() {
        return !isVisited.containsValue(false);
    }


    public void initializeMaps(Vertex beginnerVertex) {
        graph.getVertexMap().forEach((key, value) -> costs.put(value, Integer.MAX_VALUE));
        costs.put(beginnerVertex, 0);
    }

}