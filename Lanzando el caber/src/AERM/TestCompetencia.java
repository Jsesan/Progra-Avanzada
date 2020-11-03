package AERM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompetencia {


// 	Pruebas antes de tener clase archivo	
	
	@Test
	void testPodioDist() {
		Lanzamiento[] lanzamientos1 = { new Lanzamiento(1.49, 5.00), new Lanzamiento(1.50, 3.00),
				new Lanzamiento(1.51, -3.00) };
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);

		Lanzamiento[] lanzamientos2 = { new Lanzamiento(2.10, 6.00), new Lanzamiento(2.00, -6.00),
				new Lanzamiento(1.00, 2.00) };
		Lanzador Lanzador2 = new Lanzador(lanzamientos2);

		Lanzamiento[] lanzamientos3 = { new Lanzamiento(2.30, -35.00), new Lanzamiento(1.30, -92.00),
				new Lanzamiento(1.00, 1.00) };
		Lanzador Lanzador3 = new Lanzador(lanzamientos3);

		Lanzador[] competediroes1 = { Lanzador1, Lanzador2, Lanzador3 };

		Competencia competencia1 = new Competencia(competediroes1);

		int[] podio = competencia1.getPodioDistancia();

		assertEquals(2, podio[0]);
		assertEquals(1, podio[1]);
		assertEquals(3, podio[2]);
	}

	@Test
	void testPodioCons() {
		Lanzamiento[] lanzamientos1 = { new Lanzamiento(1.49, 5.00), new Lanzamiento(1.50, 3.00),
				new Lanzamiento(1.51, -3.00) };
		Lanzador Lanzador1 = new Lanzador(lanzamientos1);

		Lanzamiento[] lanzamientos2 = { new Lanzamiento(2.10, 6.00), new Lanzamiento(2.00, -6.00),
				new Lanzamiento(1.00, 2.00) };
		Lanzador Lanzador2 = new Lanzador(lanzamientos2);

		Lanzamiento[] lanzamientos3 = { new Lanzamiento(2.30, -35.00), new Lanzamiento(1.30, -92.00),
				new Lanzamiento(1.00, 1.00) };
		Lanzador Lanzador3 = new Lanzador(lanzamientos3);

		Lanzador[] competediroes1 = { Lanzador1, Lanzador2, Lanzador3 };

		Competencia competencia1 = new Competencia(competediroes1);

		int[] podio = competencia1.getPodioConsistencia();

		assertEquals(1, podio[0]);
		assertEquals(2, podio[1]);
		assertEquals(0, podio[2]);
	}
//*******************************PRUEBAS FINALES**********************************************************//
	@Test
	void testSalidasCaso_Enunciado() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("caso_enunciado");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("caso_enunciado", podioDist, podioConsis);
		
		assertEquals(true, archivo.compararSalidas("caso_enunciado"));
	}
	
	@Test
	void testSalidasCasoFatiga() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("CasoFatiga");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("CasoFatiga", podioDist, podioConsis);
		assertEquals(true, archivo.compararSalidas("CasoFatiga"));
	}
	
	@Test
	void testSalidasUnSoloGanadorConsistenciaVariosDistancia() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("unSoloGanadorConsistenciaVariosDistancia");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("unSoloGanadorConsistenciaVariosDistancia", podioDist, podioConsis);
		assertEquals(true, archivo.compararSalidas("unSoloGanadorConsistenciaVariosDistancia"));
	
	}
	
	@Test
	void testSalidasPodioDistanciaNadieConsistencia() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("podioDistanciaNadieConsistencia");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("podioDistanciaNadieConsistencia", podioDist, podioConsis);
		assertEquals(true, archivo.compararSalidas("podioDistanciaNadieConsistencia"));
	}
	
	@Test
	void testSalidasPodioConsistencia() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("podioConsistencia");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("podioConsistencia", podioDist, podioConsis);
		assertEquals(true, archivo.compararSalidas("podioConsistencia"));
	}
	
	@Test
	void testSalidasUnSoloGanador() {

		Archivo archivo = new Archivo();

		Lanzador[] competidores = archivo.leerYCargarDatosDe("unSoloGanador");

		Competencia competencia = new Competencia(competidores);

		int[] podioConsis = competencia.getPodioConsistencia();
		int[] podioDist = competencia.getPodioDistancia();

		archivo.escribirResultadosEn("unSoloGanador", podioDist, podioConsis);
		assertEquals(true, archivo.compararSalidas("unSoloGanador"));
	}

	
	
	/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	 * ESTAS PRUEBAS ESTAN COMENTADAS DADO QUE LUEGO SE AGREGO *
	 * * * * * *UN METODO PARA COMPARAR LAS SALIDAS* * * * * * *
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  
	 * */

//	@Test
//	void testLecturaArchivo() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("caso_enunciado");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//
//		assertEquals(1, podioConsis[0]);
//		assertEquals(2, podioConsis[1]);
//		assertEquals(0, podioConsis[2]);
//	}

//	@Test
//	void testEscrituraArchivo() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("caso_enunciado");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("caso_enunciado", podioDist, podioConsis);
//	}

//	@Test
//	void podioConsistencia() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("podioConsistencia");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("podioConsistencia", podioDist, podioConsis);
//	}

//	@Test
//	void unSoloGanador() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("unSoloGanador");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("unSoloGanador", podioDist, podioConsis);
//	}

//	@Test
//	void podioDistanciaNadieConsistencia() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("podioDistanciaNadieConsistencia");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("podioDistanciaNadieConsistencia", podioDist, podioConsis);
//	}

//	@Test
//	void unSoloGanadorConsistenciaVariosDistancia() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("unSoloGanadorConsistenciaVariosDistancia");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("unSoloGanadorConsistenciaVariosDistancia", podioDist, podioConsis);
//	}
	
	
//	@Test
//	void CasoFatiga() {
//
//		Archivo archivo = new Archivo();
//
//		Lanzador[] competidores = archivo.leerYCargarDatosDe("CasoFatiga");
//
//		Competencia competencia = new Competencia(competidores);
//
//		int[] podioConsis = competencia.getPodioConsistencia();
//		int[] podioDist = competencia.getPodioDistancia();
//
//		archivo.escribirResultadosEn("CasoFatiga", podioDist, podioConsis);
//	}
	
	//*****************************************************************//
	

}
