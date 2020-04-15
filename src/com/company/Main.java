package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void showAllVertices(Graph graph)
    {
        graph.getVertexMap().forEach((key,value)->{
            System.out.println(key + " ");
        });
    }
    public static void ShowKruskalResults(List<Edge> kruskalResult)
    {
        kruskalResult.forEach(edge -> {
            System.out.println("Vertices  : " + edge.getSource() + " - " + edge.getDestination() + " Edge : " + edge.getWeight());
        });
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Graph graph = new Graph();

        while(true)
        {
            System.out.println("1-Add New Vertex");
            System.out.println("2-Add New Edge");
            System.out.println("3-Kruskal Run");
            System.out.println("4-Exit");


            Choice choice = Choice.fromValue(scan.nextInt());

            switch (choice){
                case ADD_NEW_VERTEX:
                    System.out.println("Vertex key : ");
                    String vertexKey = scan.next();
                    graph.addVertex(vertexKey);
                    break;

                case ADD_NEW_EDGE:
                    System.out.println("Enter weight of edge : ");
                    int weight = scan.nextInt();
                    showAllVertices(graph);
                    System.out.println("Select source Vertex for Edge : ");
                    Vertex sourceVertex = graph.getVertexMap().get(scan.next());
                    System.out.println("Select destination Vertex for Edge : ");
                    Vertex destinationVertex = graph.getVertexMap().get(scan.next());
                    if(sourceVertex.getKey() == destinationVertex.getKey())
                    {
                        System.out.println("Source can not be destination");
                        break;
                    }
                    graph.addEdge(new Edge(weight,sourceVertex,destinationVertex));
                    break;

                case RUN_KRUSKAL:
                    Kruskal kruskal = new Kruskal(graph);
                    ShowKruskalResults(kruskal.run());
                    break;
                case EXIT:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }

    }


}
