
public class DirectedWeightedGraph extends WeightedGraph {

	public DirectedWeightedGraph() {
		super();
	}

	@Override
	void addEdge(String from, String to) {

		Vertex v1 = new Vertex(from);
		Vertex v2 = new Vertex(to);

		WeightedEdge we1 = new WeightedEdge(v2);

		adjVertx.get(v1).add(we1);

	}

	@Override
	void addEdge(String from, String to, double weight) {
		Vertex v1 = new Vertex(from);
		Vertex v2 = new Vertex(to);
		WeightedEdge we1 = new WeightedEdge(v2, weight);

		adjVertx.get(v1).add(we1);

	}

}
