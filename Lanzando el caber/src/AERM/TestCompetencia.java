package AERM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompetencia {

	@Test
	void testPodioDist() {
		Lanzamiento[] lanzamientos1 = { new Lanzamiento(1.49, 5.00), new Lanzamiento(1.50, 3.00), new Lanzamiento(1.51, -3.00) };
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		
		Lanzamiento[] lanzamientos2 = { new Lanzamiento(2.10, 6.00), new Lanzamiento(2.00, -6.00), new Lanzamiento(1.00, 2.00) };
		Lanzador Lanzador2 = new Lanzador(lanzamientos2);
		
		Lanzamiento[] lanzamientos3 = { new Lanzamiento(2.30,-35.00), new Lanzamiento(1.30,-92.00), new Lanzamiento(1.00, 1.00) };
		Lanzador Lanzador3 = new Lanzador(lanzamientos3);
		
		Lanzador[] competediroes1= {Lanzador1,Lanzador2,Lanzador3};
		
		Competencia competencia1 = new Competencia(competediroes1);
		
		int[] podio =  competencia1.getPodioDistancia();
		
		assertEquals(2,podio[0]);
		assertEquals(1,podio[1]);
		assertEquals(3,podio[2]);
	}
	
	@Test
	void testPodioCons() {
		Lanzamiento[] lanzamientos1 = { new Lanzamiento(1.49, 5.00), new Lanzamiento(1.50, 3.00), new Lanzamiento(1.51, -3.00) };
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);
		
		Lanzamiento[] lanzamientos2 = { new Lanzamiento(2.10, 6.00), new Lanzamiento(2.00, -6.00), new Lanzamiento(1.00, 2.00) };
		Lanzador Lanzador2 = new Lanzador(lanzamientos2);
		
		Lanzamiento[] lanzamientos3 = { new Lanzamiento(2.30,-35.00), new Lanzamiento(1.30,-92.00), new Lanzamiento(1.00, 1.00) };
		Lanzador Lanzador3 = new Lanzador(lanzamientos3);
		
		Lanzador[] competediroes1= {Lanzador1,Lanzador2,Lanzador3};
		
		Competencia competencia1 = new Competencia(competediroes1);
		
		
		int[] podio =  competencia1.getPodioConsistencia();
		
		assertEquals(1,podio[0]);
		assertEquals(2,podio[1]);
		assertEquals(0,podio[2]);
	}
	
	
	/*
	 * Las de arriba fueron pruebas pre tener la clase archivo
	 * */
	
	@Test
	void testLecturaArchivo() {
		
		Archivo archivo = new Archivo();
		
		Lanzador[] competidores  = archivo.leerYCargarDatosDe("caso_enunciado");
		
		Competencia competencia = new Competencia(competidores);
		
		int[] podioConsis =  competencia.getPodioConsistencia();
		
		assertEquals(1,podioConsis[0]);
		assertEquals(2,podioConsis[1]);
		assertEquals(0,podioConsis[2]);
	}
	
	@Test
	void testEscrituraArchivo() {
		
		Archivo archivo = new Archivo();
		
		Lanzador[] competidores  = archivo.leerYCargarDatosDe("caso_enunciado");
		
		Competencia competencia = new Competencia(competidores);
		
		int[] podioConsis =  competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();
		
		archivo.escribirResultadosEn("caso_enunciado", podioDist, podioConsis);
	}
	

}
