package Lec_47_48;

public class demo_graph {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.add(1, 2, 10);
		G.add(1, 4, 20);
		G.add(4, 5, 10);
		
		G.add(2, 3, 100);
		
		G.add(2, 5, 15);
		G.add(3, 6, 5);
		G.add(3, 7, 7);
		G.add(7, 6, 9);
		
//		G.disp();
//		System.out.println(G.hasPath(1, 6));
//		G.AllPath(1, 6);
//		G.BFT();
		G.dijkstra(1);
	}
}
