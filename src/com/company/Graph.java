package com.company;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Graph {
    private List<Edge> edgeList;
    private Map<String, Vertex> vertexMap;

    public Graph() {
    }

    public Graph(List<Edge> edgeList, Map<String, Vertex> vertexList) {
        this.edgeList = edgeList;
        this.vertexMap = vertexList;
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

    public void addVertex(String key) {
        vertexMap.put(key, new Vertex(key));
    }

    public void addVertex(String key, Vertex vertex) {
        vertexMap.put(key, vertex);
    }

}













