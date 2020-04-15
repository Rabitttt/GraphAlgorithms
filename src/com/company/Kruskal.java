package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Kruskal {
    private final Graph graph;
    private Map<String,Boolean> visitedVertexMap; //String take Veretex key , Boolean take is vertex visited or not
    private List<Edge> result;

    public Kruskal(Graph graph) {
        this.graph = graph;
    }

    public List<Edge> run()
    {
        sortEdgeList(); //Edge list sorted
        createVisitedVertexMap(); //visited vertex setted default false


        graph.getEdgeList().forEach(edge -> {
            if(isVerticesOfEdgeNotVisited(edge))
            {
                result.add(edge);
                visitedVertexMap.put(edge.getSource().getKey(),true);
                visitedVertexMap.put(edge.getDestination().getKey(),true);
            }

        });
        return result;
    }

    private boolean isVerticesOfEdgeNotVisited(Edge edge) {
        return !(visitedVertexMap.get(edge.getSource().getKey()) || visitedVertexMap.get(edge.getDestination().getKey()));
    }

    public void sortEdgeList()
    {
        graph.getEdgeList().sort(Comparator.comparing(Edge::getWeight));
    }
    public void createVisitedVertexMap()
    {
        graph.getVertexMap().forEach((key,value)-> {
            visitedVertexMap.put(key,false);
        });
    }
}

