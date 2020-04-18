package com.company;

public class Edge {

    private int weight;
    private Vertex source;
    private Vertex destination;


    public Edge(int weight, Vertex source, Vertex destination) {
        this.weight = weight;
        this.source = source;
        this.destination = destination;
        this.source.getEdgeList().add(this);
        this.destination.getEdgeList().add(this);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

}
