package Circulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCirculos {

	@Test
	void circuloCocentricosDistRadio() {

		// verificamos que si ambas circunferencias son cocentricas (tienen el mismo
		// centro) y
		// distinto radio
		// estas no se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(0, 0), 5);
		assertEquals(false, c1.intersectaCon(c2));
	}

	@Test
	void circuloCocentricosMismoRadio() {

		// verificamos que si ambas circunferencias son cocentricas (tienen el mismo
		// centro) y
		// mismo radio
		// estas se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(0, 0), 1);
		assertEquals(true, c1.intersectaCon(c2));
	}

	@Test
	void interiores() {

		// verificamos que si una circunferencia esta contenido en una con radio mayor
		// estas no
		// se intersecten

		Circulo c1 = new Circulo(new Punto(0, 0), 2);
		Circulo c2 = new Circulo(new Punto(1, 1), 0.5);
		assertEquals(false, c1.intersectaCon(c2));
	}

	@Test
	void exteriores() {

		// verificamos que si dos circunferencias son exteriores estan no se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 2);
		Circulo c2 = new Circulo(new Punto(5, 5), 2);
		assertEquals(false, c1.intersectaCon(c2));
	}

	@Test
	void tangentesInteriores() {
		// verificamos que si dos circunferencias son tangentes interiores
		// estas se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 2);
		Circulo c2 = new Circulo(new Punto(1, 0), 1);
		assertEquals(true, c1.intersectaCon(c2));
	}

	@Test
	void tangentesExteriores() {
		// verificamos que si dos circunferencias son tangentes exteriores
		// estas se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 2);
		Circulo c2 = new Circulo(new Punto(4, 0), 2);
		assertEquals(true, c1.intersectaCon(c2));
	}

	@Test
	void secantes() {
		// verificamos que si dos circunferencias secantes
		// estas se intersectan

		Circulo c1 = new Circulo(new Punto(0, 0), 2);
		Circulo c2 = new Circulo(new Punto(1, 0), 2);
		assertEquals(true, c1.intersectaCon(c2));
	}
}
