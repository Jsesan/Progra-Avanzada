package habitacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHabitacion {

	@Test
	void caso_Enunciado_1() {
		String name= "Caso_Enunciado_1";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Enunciado_2() {
		String name= "Caso_Enunciado_2";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Escalera() {
		String name= "Caso_Escalera";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Piramide() {
		String name= "Caso_Piramide";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Todo_a_Una_Pila() {
		String name= "Caso_Todo_a_Una_Pila";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}

	@Test
	void caso_Fatiga() {
		String name= "CasoFatiga";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Todas_Pilas_Misma_Cant() {
		String name= "Todas_Pilas_Misma_Cant";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Todas_Pilas_Vacias() {
		String name= "Todas_Pilas_Vacias";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
	
	@Test
	void caso_Una_Pila() {
		String name= "Una_Pila";
		Archivos ar = new Archivos();
		ar.leerYCargarDatos(name);
		int P = ar.getP();
		int cajas[] = ar.getCajas();
		Habitacion habitacion = new Habitacion();
		ar.escribirCantMovs(name, habitacion.zapatos(P, cajas));
		assertEquals(ar.obtenerSalidaEsperada(name),habitacion.zapatos(P, cajas));
	}
}
