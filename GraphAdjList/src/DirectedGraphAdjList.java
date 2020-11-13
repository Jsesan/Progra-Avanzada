import java.util.List;

public class DirectedGraphAdjList extends GraphAdjList {

	public DirectedGraphAdjList() {
		super();
	}

	@Override
	void addEdge(int from, int to) {
		Vertex v2 = new Vertex(to);
		adjVertx.get(from).add(v2);
	}

	@Override
	void removeEdge(int from, int to) {
		Vertex v2 = new Vertex(to);
		List<Vertex> eV1 = adjVertx.get(from);
		if (eV1 != null)
			eV1.remove(v2);
	}

}
