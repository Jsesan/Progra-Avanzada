import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
	private Map<Vertex, List<WeightedEdge>> adjVertx;

	public WeightedGraph() {
		adjVertx = new HashMap<>();
	}

	public Map<Vertex, List<WeightedEdge>> getAdjVertx() {
		return adjVertx;
	}
	
	public void setAdjVertx(Map<Vertex, List<WeightedEdge>> adjVertx) {
		this.adjVertx = adjVertx;
	}
	
	void addVertex(String label) {
		adjVertx.putIfAbsent(new Vertex(label), new ArrayList<>());
	}
	
	void removeVertex(String label) {
		Vertex v = new Vertex(label);
		WeightedEdge we = new WeightedEdge(v);
		adjVertx.values().stream().forEach(e -> e.remove(we));
		adjVertx.remove(new Vertex(label));
	}
	
	void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		WeightedEdge we1 = new WeightedEdge(v2);
		WeightedEdge we2 = new WeightedEdge(v1);
		adjVertx.get(v1).add(we1);
		adjVertx.get(v2).add(we2);
	}
	
	void addEdge(String label1, String label2, double weight) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		WeightedEdge we1 = new WeightedEdge(v2,weight);
		WeightedEdge we2 = new WeightedEdge(v1,weight);
		adjVertx.get(v1).add(we1);
		adjVertx.get(v2).add(we2);
	}
		
	void removeEdge(String label1, String label2, double weight) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<WeightedEdge> eV1 = adjVertx.get(v1);
		List<WeightedEdge> eV2 = adjVertx.get(v2);
		WeightedEdge we1 = new WeightedEdge(v2, weight);
		WeightedEdge we2 = new WeightedEdge(v1, weight);
		if(we1.equals(eV1.get(0)))
			System.out.println("sip");
		if (eV1 != null)
			eV1.remove(we1);
		if (eV2 != null)
			eV2.remove(we2);
	}
	
	List<WeightedEdge> getAdjVertices(String label) {
		return adjVertx.get(new Vertex(label));
	}
}
