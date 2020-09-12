package Circulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPuntos {

	@Test
	void testDistancia() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(1,1);
		
		assertEquals(Math.sqrt(2),p1.distEntrePuntos(p2),0.0);
	}
	
	@Test
	void testModulo() {
		Punto p2 = new Punto(1,1);
		
		assertEquals(Math.sqrt(2),p2.getModulo(),0.0);
	}

	@Test
	void testrotacion() {
		Punto p1 = new Punto(1,1);
		Punto p2 =(Punto) p1.clone();
		assertEquals(p1.rotacion90(),p2.rotacionPorCualqAnguloRad(Math.PI/2));
	}
}
