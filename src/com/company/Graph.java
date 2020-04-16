package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final List<Edge> edgeList;
    private final Map<String, Vertex> vertexMap;

    public Graph() {
        this.edgeList = new ArrayList<>();
        this.vertexMap = new HashMap<>();
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public Map<String, Vertex> getVertexMap() {
        return vertexMap;
    }

    public void addEdge(Edge edge) {
        edgeList.add(edge);
    }

    public void addVertex(Vertex vertex) {
        vertexMap.put(vertex.getKey(), vertex);
    }

}













