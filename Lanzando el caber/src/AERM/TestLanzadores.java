package AERM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLanzadores {

	@Test
	void testLanzamientosValidos() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,3.00),new Lanzamiento(1.51,-3.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(true, Lanzador1.isTodosValidos());
	}
	
	@Test
	void testLanzamientosInvalidos() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,-93.00),new Lanzamiento(1.50,3.00),new Lanzamiento(1.51,-3.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(false, Lanzador1.isTodosValidos());
	}
	
	@Test
	void testDistanciaTotal_1() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,3.00),new Lanzamiento(1.51,-3.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(4.5, Lanzador1.getDistanciaLanzamientos());
	}
	
	@Test
	void testDistanciaTotal_2() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,34.00),new Lanzamiento(1.51,-34.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(3.898, Lanzador1.getDistanciaLanzamientos(),0.0001);
	}
	
	@Test
	void testDistanciaTotal_3() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,94.00),new Lanzamiento(1.51,-92.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(1.49, Lanzador1.getDistanciaLanzamientos());
	}
	
	@Test
	void testVarA() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,3.00),new Lanzamiento(1.51,-3.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(11.55, Lanzador1.getVarA(),0.01);
	}
	
	@Test
	void testVarD() {
		Lanzamiento[] lanzamientos1 = {new Lanzamiento(1.49,5.00),new Lanzamiento(1.50,3.00),new Lanzamiento(1.51,-3.00)};
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		assertEquals(1/15000, Lanzador1.getVarD(),0.01);
	}
}

