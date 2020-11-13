import java.util.ArrayList;
import java.util.HashMap;
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

	// add/remove methods for Vertices

	void addVertex(int id) {
		adjVertx.putIfAbsent(new Integer(id), new ArrayList<>());
	}

	void removeVertex(int id) {
		Vertex v = new Vertex(id);
		adjVertx.values().stream().forEach(e -> e.remove(v));
		adjVertx.remove(id);
	}

	// add/remove methods for Edges

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

	// get the adjacent vertices of a particular vertex

	List<Vertex> getAdjVertices(int id) {
		return adjVertx.get(id);
	}
}
