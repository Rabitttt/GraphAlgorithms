package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final List<Edge> edgeListOfVertex;
    private String key;

    public Vertex(String key) //add independent vertex
    {
        this.key = key;
        this.edgeListOfVertex = new ArrayList<>();
    }

    public List<Edge> getEdgeList() {
        return edgeListOfVertex;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }
}
