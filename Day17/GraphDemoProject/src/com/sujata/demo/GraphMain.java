package com.sujata.demo;

public class GraphMain {

	public static void main(String[] args) {
		Graph graph=new Graph();
		
		graph.addNewEdge("Delhi","Indore" , true);
		graph.addNewEdge("Delhi","Patna" , true);
		graph.addNewEdge("Delhi","Chennai" , true);
		graph.addNewEdge("Delhi","Mumbai" , true);
		graph.addNewEdge("Mumbai","Indore" , true);
		graph.addNewEdge("Chennai","Indore" , true);
		graph.addNewEdge("Chennai","Patna" , true);
		
		System.out.println(graph);

	}

}
