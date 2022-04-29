package com.sandesh.demo;

public class DijsktrasAlgorithm {
	static final int Vertices = 5;
	int minDistance(int dist[], Boolean sptSet[]){
		int min = Integer.MAX_VALUE, min_index = -1;
		for (int vertex = 0; vertex < Vertices; vertex++)
			if (sptSet[vertex] == false && dist[vertex] <= min) {
				min = dist[vertex];
				min_index = vertex;
			}
		return min_index;
	}
	
	void printSolution(int dist[])
	{
		System.out.println("Vertex \t\t Distance from Source");
		for (int i = 0; i < Vertices; i++)
			System.out.println(i + " \t\t " + dist[i]);
	}

	void dijkstra(int graph[][], int src)
	{
		int dist[] = new int[Vertices];
		Boolean sptSet[] = new Boolean[Vertices];
		for (int i = 0; i < Vertices; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[src] = 0;
		for (int count = 0; count < Vertices - 1; count++) {

			int u = minDistance(dist, sptSet);
			sptSet[u] = true;
			for (int v = 0; v < Vertices; v++)
				if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		printSolution(dist);
	}

	public static void main(String[] args){
		int graph[][] = new int[][] { 	 {0, 2, 0, 6, 0 },
									{ 2, 0, 3, 8, 5 },
									{ 0, 3, 0, 0, 7 },
									{ 6, 8, 0, 0, 9 },
									{ 0, 5, 7, 9, 0 } 	};
		DijsktrasAlgorithm shortestPath = new DijsktrasAlgorithm();
		shortestPath.dijkstra(graph, 0);
	}
}