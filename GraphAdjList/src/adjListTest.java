import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class adjListTest {

	// No-directed and no-weighted Graph tests

	@Test
	void test() {
		GraphAdjList graph1 = new GraphAdjList();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires");

		List<Vertex> aux = graph1.getAdjVertices("Salta");

		assertEquals("Buenos Aires", aux.get(0).getLabel());
	}

	@Test
	void test2() {
		GraphAdjList graph1 = new GraphAdjList();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires");

		List<Vertex> aux = graph1.getAdjVertices("Buenos Aires");

		assertEquals("Salta", aux.get(0).getLabel());
	}

	// No-directed and weighted Graph tests

	@Test
	void Weightedtest() {
		WeightedGraph graph1 = new WeightedGraph();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires");

		assertEquals(0, graph1.getAdjVertices("Salta").get(0).getWeight());

	}

	@Test
	void Weightedtest2() {
		WeightedGraph graph1 = new WeightedGraph();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires", 1200);

		assertEquals(1200, graph1.getAdjVertices("Salta").get(0).getWeight());

	}

	// Directed and no-weighted Graph tests

	@Test
	void Directedtest() {
		DirectedGraphAdjList graph1 = new DirectedGraphAdjList();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires");
		graph1.addEdge("Mendoza", "Buenos Aires");

		List<Vertex> aux = graph1.getAdjVertices("Buenos Aires");

		assertEquals(0, aux.size());

	}

	// Directed and no-weighted Graph tests

	@Test
	void DirectedWeightedGraphTest() {
		DirectedWeightedGraph graph1 = new DirectedWeightedGraph();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires", 2000);
		graph1.addEdge("Mendoza", "Buenos Aires", 1200);
		graph1.addEdge("Buenos Aires", "Cordoba", 500);
		
		
		List<WeightedEdge> aux = graph1.getAdjVertices("Buenos Aires");

		assertEquals(1, aux.size());
		assertEquals(500, aux.get(0).getWeight());
		assertEquals("Cordoba", aux.get(0).getAdjVertex().getLabel());

	}
}
