import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class adjListTest {

	@Test
	void test() {
		Graph graph1 = new Graph();

		graph1.addVertex("Buenos Aires");
		graph1.addVertex("Mendoza");
		graph1.addVertex("Cordoba");
		graph1.addVertex("Salta");

		graph1.addEdge("Salta", "Buenos Aires");

		List<Vertex> aux = graph1.getAdjVertices("Salta");

		assertEquals("Buenos Aires", aux.get(0).getLabel());
	}
	
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

}
