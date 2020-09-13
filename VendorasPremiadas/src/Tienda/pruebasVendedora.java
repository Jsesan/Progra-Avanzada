package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebasVendedora {

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

}
