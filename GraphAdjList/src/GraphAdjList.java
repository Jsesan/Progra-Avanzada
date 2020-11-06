import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjList {

	protected Map<Vertex, List<Vertex>> adjVertx;

	public GraphAdjList() {
		adjVertx = new HashMap<>();
	}

	public Map<Vertex, List<Vertex>> getAdjVertx() {
		return adjVertx;
	}

	public void setAdjVertx(Map<Vertex, List<Vertex>> adjVertx) {
		this.adjVertx = adjVertx;
	}

	// add/remove methods for Vertices

	void addVertex(String label) {
		adjVertx.putIfAbsent(new Vertex(label), new ArrayList<>());
	}

	void removeVertex(String label) {
		Vertex v = new Vertex(label);
		adjVertx.values().stream().forEach(e -> e.remove(v));
		adjVertx.remove(new Vertex(label));
	}

	// add/remove methods for Edges

	void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertx.get(v1).add(v2);
		adjVertx.get(v2).add(v1);
	}

	void removeEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<Vertex> eV1 = adjVertx.get(v1);
		List<Vertex> eV2 = adjVertx.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	// get the adjacent vertices of a particular vertex

	List<Vertex> getAdjVertices(String label) {
		return adjVertx.get(new Vertex(label));
	}
}
