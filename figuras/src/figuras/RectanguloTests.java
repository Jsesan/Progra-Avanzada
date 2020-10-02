package figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectanguloTests {
	
	private static final double TOLERANCIA = 1E-4;

	@Test
	public void perimetroCuadradoLado1() {
		Figura f = new Rectangulo(1,1);
		assertEquals(4, f.getPerimetro(), TOLERANCIA);
	}

	@Test
	public void superficieCuadradoLado1() {
		Figura f = new Rectangulo(1,1);
		assertEquals(1, f.getSuperficie(), TOLERANCIA);
	}

	@Test
	public void perimetroRectangulo3x2() {
		Figura f = new Rectangulo(3,2);
		assertEquals(10, f.getPerimetro(), TOLERANCIA);
	}

	@Test
	public void superficieRectangulo3x2() {
		Figura f = new Rectangulo(3,2);
		assertEquals(6, f.getSuperficie(), TOLERANCIA);
	}

}
