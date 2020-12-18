package unlam.progava.oia;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testEjercicioOIA {
	
	
	@Test
	void test00() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/00.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/00.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/00.out"),ejercicio.getCosto());
		
	}
	
	@Test
	void test01() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/01.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/01.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/01.out"),ejercicio.getCosto());
		
	}
	
	@Test
	void test02() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/02.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/02.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/02.out"),ejercicio.getCosto());
		
	}
	
	@Test
	void test03() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/03.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/03.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/03.out"),ejercicio.getCosto());
		
	}
	
	@Test
	void test04() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/04.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/04.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/04.out"),ejercicio.getCosto());
		
	}
	
	@Test
	void test05() {
		
		EjercicioOIA ejercicio = new EjercicioOIA();
		Salida s = new Salida();
		
		ejercicio.leer("src/unlam/progava/oia/in/05.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/05.out");
		
		assertEquals(s.obtenerSalidaEsperada("src/unlam/progava/oia/expected/05.out"),ejercicio.getCosto());
		
	}

}
