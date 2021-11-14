package Lec_47_48;

import java.util.*;

public class Graph {
//	Key = V1 , Value= HashMap of edges with V1 
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int num_V) {
		// TODO Auto-generated constructor stub
		for (int v = 1; v <= num_V; v++) {
			map.put(v, new HashMap<Integer, Integer>());
		}
	}

	public void add(int v1, int v2, int wt) {
		map.get(v1).put(v2, wt);
		map.get(v2).put(v1, wt);
	}

	public boolean containsE(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public int remove(int v1, int v2) {
		int wt = map.get(v1).get(v2);

		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

		return wt;
	}

	public int numE() {
		int ans = 0;
		for (int v1 : map.keySet()) {
			for (int nbr : map.get(v1).keySet()) {
				ans++;
			}
		}
		return ans / 2;
	}

	public void disp() {
//		System.out.println(map);
		for (int v1 : map.keySet()) {
			System.out.print(v1 + "=");
			for (int nbr : map.get(v1).keySet()) {
				System.out.print(nbr + " ");
			}
			System.out.println();
		}

	}

	public boolean hasPath(int v1, int v2) {

		return hasPath(v1, v2, new HashSet<Integer>());
	}

	private boolean hasPath(int v1, int v2, HashSet<Integer> visited) {

		System.out.println(v1 + "  " + v2);
		if (v1 == v2) {
			return true;
		}
		visited.add(v1);
		for (int nbr : map.get(v1).keySet()) {
			if (!visited.contains(nbr)) {
				boolean sp = hasPath(nbr, v2, visited);
				if (sp) {
					return true;
				}
			}
		}
		return false;
	}

	public void AllPath(int v1, int v2) {

		AllPath(v1, v2, new HashSet<Integer>(), "");
	}

	private void AllPath(int v1, int v2, HashSet<Integer> visited, String str) {

//		System.out.println(v1 + "  " + v2);
		str = str + " " + v1;
		if (v1 == v2) {
			System.out.println(str);
			return;
		}
		visited.add(v1);
		for (int nbr : map.get(v1).keySet()) {
			if (!visited.contains(nbr)) {
				AllPath(nbr, v2, visited, str);
			}
		}
		visited.remove(v1);
		return;
	}

	public void BFS() {
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(1);
		while (!Q.isEmpty()) {
			int curr_v = Q.poll();
			System.out.print(curr_v + " ");
			Visited.add(curr_v);
			for (int nbr : map.get(curr_v).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
		System.out.println();
	}

	public void BFT() {
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int each_v : map.keySet()) {
			if (Visited.contains(each_v)) {
				continue;
			}
			Q.add(each_v);

			while (!Q.isEmpty()) {
				int curr_v = Q.poll();
				System.out.print(curr_v + " ");
				Visited.add(curr_v);
				for (int nbr : map.get(curr_v).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			System.out.println();
		}

	}

	public int numComp() {
		int ans = 0;
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int each_v : map.keySet()) {
			if (Visited.contains(each_v)) {
				continue;
			}
			Q.add(each_v);
			ans++;
			while (!Q.isEmpty()) {
				int curr_v = Q.poll();
//				System.out.print(curr_v+" ");
				if (Visited.contains(curr_v)) {
					System.out.println("repeated!! cycle");
				}
				Visited.add(curr_v);
				for (int nbr : map.get(curr_v).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			System.out.println();
		}
		return ans;

	}

	public boolean isCyclic() {
		int ans = 0;
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int each_v : map.keySet()) {
			if (Visited.contains(each_v)) {
				continue;
			}
			Q.add(each_v);
			ans++;
			while (!Q.isEmpty()) {
				int curr_v = Q.poll();
//				System.out.print(curr_v+" ");
				if (Visited.contains(curr_v)) {
					return true;
				}
				Visited.add(curr_v);
				for (int nbr : map.get(curr_v).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			System.out.println();
		}
		return false;

	}

	public boolean isTree() {
		return numComp() == 1 && isCyclic() == false;
	}

	class dijkstraPair implements Comparable<dijkstraPair> {
		int V;
		int cost;

		dijkstraPair(int src, int c) {
			// TODO Auto-generated method stub
			V = src;
			cost = c;
		}

		@Override
		public int compareTo(dijkstraPair o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}

	}

	public void dijkstra(int src) {
		HashSet<Integer> Visited = new HashSet<Integer>();
		PriorityQueue<dijkstraPair> PQ = new PriorityQueue<dijkstraPair>();
		PQ.add(new dijkstraPair(src, 0));
		while (!PQ.isEmpty()) {
			dijkstraPair curr = PQ.poll();
			if (PQ.contains(curr.V)) {
				continue;
			}
			Visited.add(curr.V);
			System.out.println(curr.V + " with cost " + curr.cost);
			for (int nbr : map.get(curr.V).keySet()) {
				if (!PQ.contains(nbr)) {
					PQ.add(new dijkstraPair(nbr, curr.cost + map.get(curr.V).get(nbr)));
				}
			}
			
		}
	}
}
