package figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrianguloTests {
	
	private static final double TOLERANCIA = 1E-4;

	@Test
	public void perimetroTrianguloEquilateroLado1() {
		Triangulo t = new Triangulo(1,1,1);
		assertEquals(3, t.getPerimetro(), TOLERANCIA);
	}

	@Test
	public void superficieTrianguloEquilateroLado1() {
		Triangulo t = new Triangulo(1,1,1);
		assertEquals(0.433, t.getSuperficie(), TOLERANCIA);
	}

}
