package figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CirculoTests {
	
	private static final double TOLERANCIA = 1E-4;
	
	@Test
	public void diametroCirculoRadio1() {
		Circulo c = new Circulo(1);
		assertEquals(2, c.getDiametro(), TOLERANCIA);
	}

	@Test
	public void perimetroCirculoRadio1() {
		Circulo c = new Circulo(1);
		assertEquals(2*Math.PI, c.getPerimetro(), TOLERANCIA);
	}

	@Test
	public void superficieCirculoRadio1() {
		Circulo c = new Circulo(1);
		assertEquals(Math.PI, c.getSuperficie(), TOLERANCIA);
	}

}
