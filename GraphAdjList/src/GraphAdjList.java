import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphAdjList {

	protected Map<Integer, List<Vertex>> adjVertx;

	public GraphAdjList() {
		adjVertx = new HashMap<>();
	}

	public Map<Integer, List<Vertex>> getAdjVertx() {
		return adjVertx;
	}

	public void setAdjVertx(Map<Integer, List<Vertex>> adjVertx) {
		this.adjVertx = adjVertx;
	}


	void addVertex(int id) {
		adjVertx.putIfAbsent(new Integer(id), new ArrayList<>());
	}

	void removeVertex(int id) {
		Vertex v = new Vertex(id);
		adjVertx.values().stream().forEach(e -> e.remove(v));
		adjVertx.remove(id);
	}


	void addEdge(int id1, int id2) {
		Vertex v1 = new Vertex(id1);
		Vertex v2 = new Vertex(id2);
		adjVertx.get(id1).add(v2);
		adjVertx.get(id2).add(v1);
	}

	void removeEdge(int id1, int id2) {
		Vertex v1 = new Vertex(id1);
		Vertex v2 = new Vertex(id2);
		List<Vertex> eV1 = adjVertx.get(id1);
		List<Vertex> eV2 = adjVertx.get(id2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}


	List<Vertex> getAdjVertices(int id) {
		return adjVertx.get(id);
	}
	
	
	int[] DFS(int v) {
		boolean visited[] = new boolean[this.adjVertx.size()];
		int recorrido[] = new int[this.adjVertx.size()];
		int j = 0;
		
		DFSUtil(new Vertex(v), visited, recorrido, j);

		return recorrido;
	}
	
	void DFSUtil(Vertex v, boolean visited[], int recorrido[], int j) {
		
		visited[v.getId()] = true;
		recorrido[j] = v.getId();

		
		Iterator<Vertex> i = getAdjVertices(v.getId()).listIterator();
		while (i.hasNext()) {
			Vertex prox = i.next();
			if (!visited[prox.getId()]) {
				j++;
				DFSUtil(prox, visited, recorrido, j);
			}
		}
	}

	
	int[] BFS(int v) {
		
		int visited[] = new int[this.adjVertx.size()];

		for (int i = 0; i < this.adjVertx.size(); i++)
			visited[i] = Integer.MAX_VALUE;

		
		LinkedList<Integer> queue = new LinkedList<Integer>();

		
		int distancia = 0;
		visited[v] = 0;
		queue.add(v);

		while (queue.size() != 0) {
			
			v = queue.poll();

			Iterator<Vertex> i = getAdjVertices(v).listIterator();
			distancia++;
			while (i.hasNext()) {
				int n = i.next().getId();
				if (visited[n] == Integer.MAX_VALUE) {
					visited[n] = distancia;
					queue.add(n);
				}
			}
		}

		return visited;
	}
}
