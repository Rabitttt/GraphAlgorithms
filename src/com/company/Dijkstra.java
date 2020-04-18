package com.company;

import java.util.HashMap;
import java.util.Map;

public class Dijkstra {
    private final Graph graph;
    private int Smaller;
    private Vertex nextVertex;
    private Vertex beginningVertex;
    private Map<String, Integer> costs; //String : KEY of Vertex  ,  Integer : Cost
    private Map<String, Boolean> visited; //String : KEY of Vertex , Boolean : controls is vertex visited before

    public Dijkstra(Graph graph) {
        this.visited = new HashMap<>();
        this.costs = new HashMap<>();
        this.graph = graph;
        this.beginningVertex = new Vertex();
    }

    public Map<String,Integer> run(String beginning) {
        initializeMaps();
        this.beginningVertex = graph.getVertexMap().get(beginning);
        visited.put(beginningVertex.getKey(),true);
        costs.put(beginningVertex.getKey(),0);

        iterateVisitedVerticesForFindNextVertexToGo();

        return costs;
    }

    public void findMinimumNotVisitedNeighbor(Vertex tryVertex)
    {
        this.Smaller = Integer.MAX_VALUE;
        tryVertex.getEdgeList().forEach(edge -> {
            if(Smaller > costs.get(edge.getDestination().getKey()))
            {
                nextVertex = edge.getDestination();
            }
        });
    }
    public void iterateVisitedVerticesForFindNextVertexToGo()
    {

        graph.getVertexMap().forEach((key,vertex)->
        {
            if(visited.get(key)) //Only Visited Verteices
            {
                findMinimumNotVisitedNeighbor(vertex);
            }
        });
        goForNextVertex();
    }

    public Map<String, Integer> goForNextVertex()
    {
        if(this.Smaller != Integer.MAX_VALUE)
        {
            iterateVisitedVerticesForFindNextVertexToGo();
            visited.put(nextVertex.getKey(),true);
        }
        return costs;
    }

    public void initializeMaps() {
        graph.getVertexMap().forEach((key, value) -> {
            costs.put(key, Integer.MAX_VALUE);
            visited.put(key, false);
        });
    }

}
