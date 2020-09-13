package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebasVendedora {

	@Test
	void testUno() {
		Vendedora v1= new Vendedora() ;
		v1.setResumenVenta(new int[] {15,1,6,4,9,10});
		assertEquals(29,v1.importeNMaximos(4));
	}
	
	@Test
	void testDos() {
		Vendedora v1= new Vendedora() ;
		v1.setResumenVenta(new int[] {15,1,6,4,9,10});
		assertEquals(19,v1.importeNMaximos(2));
	}
	
	@Test
	void testTres() {
		Vendedora v1= new Vendedora() ;
		v1.setResumenVenta(new int[] {15,1,6,4,9,10});
		assertEquals(15,v1.importeNMaximos(1));
	}
	
	@Test
	void testCuatro() {
		Vendedora v1= new Vendedora() ;
		v1.setResumenVenta(new int[] {15,1,6});
		assertEquals(0,v1.importeNMaximos(4));
	}

}
