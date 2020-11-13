import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class adjListTest {

	// No-directed and no-weighted Graph tests

	@Test
	void test() {
		GraphAdjList graph1 = new GraphAdjList();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(0, 1);

		List<Vertex> adjDe1 = graph1.getAdjVertices(1);

		assertEquals(0, adjDe1.get(0).getId());

	}

	@Test
	void test2() {
		GraphAdjList graph1 = new GraphAdjList();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(0, 1);

		List<Vertex> adjDe0 = graph1.getAdjVertices(0);

		assertEquals(1, adjDe0.get(0).getId());
	}

	// No-directed and weighted Graph tests

	@Test
	void Weightedtest() {
		WeightedGraph graph1 = new WeightedGraph();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(0, 1);

		assertEquals(0, graph1.getAdjVertices(0).get(0).getWeight());

	}

	@Test
	void Weightedtest2() {
		WeightedGraph graph1 = new WeightedGraph();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(0, 1, 1200);

		assertEquals(1200, graph1.getAdjVertices(1).get(0).getWeight());

	}

	// Directed and no-weighted Graph tests

	@Test
	void Directedtest() {
		DirectedGraphAdjList graph1 = new DirectedGraphAdjList();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);
		
		graph1.addEdge(1, 0);
		graph1.addEdge(2, 0);

		List<Vertex> aux = graph1.getAdjVertices(0);

		assertEquals(0, aux.size());

	}

	// Directed and no-weighted Graph tests

	@Test
	void DirectedWeightedGraphTest() {
		DirectedWeightedGraph graph1 = new DirectedWeightedGraph();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(1, 0, 2000);
		graph1.addEdge(2, 0, 1200);
		graph1.addEdge(0, 3, 500);

		List<WeightedEdge> adjDe0 = graph1.getAdjVertices(0);

		assertEquals(1, adjDe0.size());
		assertEquals(500, adjDe0.get(0).getWeight());
		assertEquals(3, adjDe0.get(0).getAdjVertex().getId());

	}
	
	@Test
	void DirectedWeightedGraphTest2() {
		DirectedWeightedGraph graph1 = new DirectedWeightedGraph();

		graph1.addVertex(0);
		graph1.addVertex(1);
		graph1.addVertex(2);
		graph1.addVertex(3);

		graph1.addEdge(1, 0, 2000);
		graph1.addEdge(1, 2, 1200);
		graph1.addEdge(0, 3, 500);

		List<WeightedEdge> adjDe1 = graph1.getAdjVertices(1);

		assertEquals(2, adjDe1.size());
		assertEquals(1200, adjDe1.get(1).getWeight());
		assertEquals(2, adjDe1.get(1).getAdjVertex().getId());

	}
}
