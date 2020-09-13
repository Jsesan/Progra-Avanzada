package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebasVendedora {
	
	/* EL TEST COMENTADO PARA QUE SE ENTIENDAN TODOS LOS PARAMETROS ES: CompeticionTres()
	 * ES EL ULTIMO TEST, ALGUNOS TEST SOLO COMPRUEBAN CIERTAS FUNCIONALIDADES DE ALGUNA 
	 * DE LAS CLASES. */

	@Test
	void testUno() {
		Vendedora v1= new Vendedora(new float[] {15,1,6,4,9,10}) ;
		assertEquals(29,v1.importeNMaximos(4));
	}
	
	@Test
	void testDos() {
		Vendedora v1= new Vendedora(new float[] {15,1,6,4,9,10}) ;
		assertEquals(19,v1.importeNMaximos(2));
	}
	
	@Test
	void testTres() {
		Vendedora v1= new Vendedora(new float[] {15,1,6,4,9,10}) ;
		assertEquals(15,v1.importeNMaximos(1));
	}
	
	@Test
	void testCuatro() {
		Vendedora v1= new Vendedora(new float[] {15,1,6}) ;
		assertEquals(0,v1.importeNMaximos(4));
	}
	
	@Test
	void testImportes() {
		
		Premio price= new Premio(2);
		price.setCantVendedoras(2);
		
		Vendedora v1= new Vendedora(new float[] {15,1,6}) ;
		
		Vendedora v2= new Vendedora(new float[] {15,1,6,10}) ;
		
		Vendedora[] vendedoras = {v1,v2};
		
		float importes[] = {0,0};
		
		float impMax= price.calcularImportes(vendedoras, importes);
		
		assertEquals(16,importes[0]);
		assertEquals(16,importes[1]);
		
		int cantidad= price.cantidadMaximos(importes, impMax);
		
		assertEquals(2, cantidad);
		
	}
	
	@Test
	void testNoHayGanadora() {
		Premio price= new Premio(6);
		price.setCantVendedoras(3);
		
		Vendedora v1= new Vendedora(new float[] {20,44,10}) ;
		
		Vendedora v2= new Vendedora(new float[] {5,7,46,18}) ;
		
		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5});
		
		Vendedora[] vendedoras = {v1,v2,v3};
		
		assertEquals(false, price.puedeHaberGanador(vendedoras));
	}
	
	@Test
	void testHayGanadora() {
		Premio price= new Premio(2);
		price.setCantVendedoras(3);
		
		Vendedora v1= new Vendedora(new float[] {20,44,10}) ;
		
		Vendedora v2= new Vendedora(new float[] {5,7,46,18}) ;
		
		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5}) ;
		
		Vendedora[] vendedoras = {v1,v2,v3};
		
		assertEquals(true, price.puedeHaberGanador(vendedoras));
	}
	
	@Test
	void posiciondeGanador() {
		Premio price= new Premio(2);
		price.setCantVendedoras(3);
		
		float importes[] = {64,64,80};
		float impMax=80;
		
		assertEquals(2,price.buscarPosicionGanador(importes, impMax));
	}
	
	@Test
	void testParticipa() {
		Premio price= new Premio(2);
		price.setCantVendedoras(3);
		
		Vendedora v1= new Vendedora(new float[] {20,44,10}) ;
		
		Vendedora v2= new Vendedora(new float[] {5,7,46,18}) ;
		
		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5}) ;
		
		Vendedora[] vendedoras = {v1,v2,v3};
		float[] importes = {74,71,74};
		float impMax = 74;
		
		price.cambiarParticipacion(impMax, vendedoras, importes);
		
		assertEquals(-1,v2.getParticipa());
	}
	
	@Test
	void CompeticionUno() { //No se puede desempatar 
		Premio price= new Premio(4);
		price.setCantVendedoras(2);
		
		Vendedora v1= new Vendedora(new float[] {10,10,20,44,1}) ;
		
		Vendedora v2= new Vendedora(new float[] {1,10,46,18,10}) ;
		
//		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5}) ;
		
		Vendedora[] vendedoras = {v1,v2};
		float[] importes = {0,0};
		
		assertEquals(-2, price.buscarGanadora(vendedoras, importes));
	}
	
	@Test
	void CompeticionDos() {  //Caso en el que gana la vendedora 3 ( indice == 2 ) 
		Premio price= new Premio(2);
		price.setCantVendedoras(3);
		
		Vendedora v1= new Vendedora(new float[] {20,44,10}) ;
		
		Vendedora v2= new Vendedora(new float[] {5,7,46,18}) ;
		
		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5}) ;
		
		Vendedora[] vendedoras = {v1,v2,v3};
		float[] importes = {0,0,0};
		
		assertEquals(2, price.buscarGanadora(vendedoras, importes));
	}

	
	@Test
	void CompeticionTres() {  //Caso en el que no puede haber ganador
		Premio price= new Premio(6); // N == 6
		price.setCantVendedoras(2); //Cant vendedoras == 2
		
		Vendedora v1= new Vendedora(new float[] {20,44,10}) ; //Resumen de vendedora 1
		
		Vendedora v2= new Vendedora(new float[] {5,10,46,18}) ; //Resumen de vendedora 2
		
		Vendedora[] vendedoras = {v1,v2}; //Vector que contiene a todas las vendedoras
		float[] importes = {0,0};//Vector donde se guardaran el imp maximo de cada vendedora (Posible de modificar mas adelante)
									//Si agregamos un atributo mas a vendedora donde se aloje su importe
		
		assertEquals(-1, price.buscarGanadora(vendedoras, importes)); // Dado que N=6 y el resumen mas grande tiene solo 4 ventas 
																		//Nadie gana.
	}
}
