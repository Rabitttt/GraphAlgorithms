package com.company;

public class Edge {

    private int Weight;
    private Vertex source;
    private Vertex destination;

    public Edge(int Weight, Vertex source, Vertex destination) {
        this.Weight = Weight;
        this.source = source;
        this.destination = destination;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
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
