package com.company;

import java.util.List;

public class Vertex
{
    private List<Edge> EdgeListofVertex;
    private String key;

    public Vertex()
    {

    }
    public Vertex(String value) //add independent vertex
    {
        this.key = value;
    }

    public Vertex(List<Edge> edgeList) //add vertex for ready graph
    {
        this.EdgeListofVertex = edgeList;
    }

    public List<Edge> getEdgeList() {
        return EdgeListofVertex;
    }

    public void setEdgeList(List<Edge> edgeList) {
        EdgeListofVertex = edgeList;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
