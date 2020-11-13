import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
	protected Map<Integer, List<WeightedEdge>> adjVertx;

	public WeightedGraph() {
		adjVertx = new HashMap<>();
	}

	public Map<Integer, List<WeightedEdge>> getAdjVertx() {
		return adjVertx;
	}

	public void setAdjVertx(Map<Integer, List<WeightedEdge>> adjVertx) {
		this.adjVertx = adjVertx;
	}

	void addVertex(int id) {
		adjVertx.putIfAbsent(id, new ArrayList<>());
	}

	void removeVertex(int id) {
		Vertex v = new Vertex(id);
		WeightedEdge we = new WeightedEdge(v);
		adjVertx.values().stream().forEach(e -> e.remove(we));
		adjVertx.remove(id);
	}

	void addEdge(int id1, int id2) {
		Vertex v1 = new Vertex(id1);
		Vertex v2 = new Vertex(id2);
		WeightedEdge we1 = new WeightedEdge(v2);
		WeightedEdge we2 = new WeightedEdge(v1);
		adjVertx.get(id1).add(we1);
		adjVertx.get(id2).add(we2);
	}

	void addEdge(int id1, int id2, double weight) {
		Vertex v1 = new Vertex(id1);
		Vertex v2 = new Vertex(id2);
		WeightedEdge we1 = new WeightedEdge(v2, weight);
		WeightedEdge we2 = new WeightedEdge(v1, weight);
		adjVertx.get(id1).add(we1);
		adjVertx.get(id2).add(we2);
	}

	void removeEdge(int id1, int id2, double weight) {
		Vertex v1 = new Vertex(id1);
		Vertex v2 = new Vertex(id2);
		List<WeightedEdge> eV1 = adjVertx.get(id1);
		List<WeightedEdge> eV2 = adjVertx.get(id2);
		WeightedEdge we1 = new WeightedEdge(v2, weight);
		WeightedEdge we2 = new WeightedEdge(v1, weight);
		if (eV1 != null)
			eV1.remove(we1);
		if (eV2 != null)
			eV2.remove(we2);
	}

	List<WeightedEdge> getAdjVertices(int id) {
		return adjVertx.get(id);
	}
	
	int[] DFS(int v) {
		boolean visited[] = new boolean[this.adjVertx.size()];
		int recorrido[] = new int[this.adjVertx.size()];
		int j = 0;
		
		DFSUtil(new WeightedEdge(new Vertex(v)), visited, recorrido, j);

		return recorrido;
	}
	
	void DFSUtil(WeightedEdge v, boolean visited[], int recorrido[], int j) {
		
		visited[v.getAdjVertex().getId()] = true;
		recorrido[j] = v.getAdjVertex().getId();

		
		Iterator<WeightedEdge> i = getAdjVertices(v.getAdjVertex().getId()).listIterator();
		while (i.hasNext()) {
			WeightedEdge prox = i.next();
			if (!visited[prox.getAdjVertex().getId()]) {
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

			Iterator<WeightedEdge> i = getAdjVertices(v).listIterator();
			distancia++;
			while (i.hasNext()) {
				int n = i.next().getAdjVertex().getId();
				if (visited[n] == Integer.MAX_VALUE) {
					visited[n] = distancia;
					queue.add(n);
				}
			}
		}

		return visited;
	}
}
