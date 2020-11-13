
public class DirectedWeightedGraph extends WeightedGraph {

	public DirectedWeightedGraph() {
		super();
	}

	@Override
	void addEdge(int from, int to) {

		Vertex v2 = new Vertex(to);

		WeightedEdge we1 = new WeightedEdge(v2);

		adjVertx.get(from).add(we1);

	}

	@Override
	void addEdge(int from, int to, double weight) {
		Vertex v2 = new Vertex(to);
		WeightedEdge we1 = new WeightedEdge(v2, weight);

		adjVertx.get(from).add(we1);

	}

}
