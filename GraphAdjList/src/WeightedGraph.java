import java.util.ArrayList;
import java.util.HashMap;
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
}
