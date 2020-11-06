import java.util.List;

public class DirectedGraphAdjList extends GraphAdjList {

	public DirectedGraphAdjList() {
		super();
	}

	@Override
	void addEdge(String from, String to) {
		Vertex v1 = new Vertex(from);
		Vertex v2 = new Vertex(to);
		adjVertx.get(v1).add(v2);
	}

	@Override
	void removeEdge(String from, String to) {
		Vertex v1 = new Vertex(from);
		Vertex v2 = new Vertex(to);
		List<Vertex> eV1 = adjVertx.get(v1);
		if (eV1 != null)
			eV1.remove(v2);
	}

}
