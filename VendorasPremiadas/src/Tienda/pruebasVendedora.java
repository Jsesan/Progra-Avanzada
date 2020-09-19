package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;

class pruebasVendedora {

	/*
	 * EL TEST COMENTADO PARA QUE SE ENTIENDAN TODOS LOS PARAMETROS ES:
	 * CompeticionTres() ALGUNOS TEST SOLO COMPRUEBAN CIERTAS FUNCIONALIDADES DE
	 * ALGUNA DE LAS CLASES.
	 */

	@Test
	void testUno() {
		Vendedora v1 = new Vendedora(new float[] { 15, 1, 6, 4, 9, 10 });
		v1.importeNMaximos(4);
		assertEquals(29, v1.getImporte());
	}

	@Test
	void testDos() {
		Vendedora v1 = new Vendedora(new float[] { 15, 1, 6, 4, 9, 10 });
		v1.importeNMaximos(2);
		assertEquals(19, v1.getImporte());
	}

	@Test
	void testTres() {
		Vendedora v1 = new Vendedora(new float[] { 15, 1, 6, 4, 9, 10 });
		v1.importeNMaximos(1);
		assertEquals(15, v1.getImporte());
	}

	@Test
	void testCuatro() {
		Vendedora v1 = new Vendedora(new float[] { 15, 1, 6 });
		v1.importeNMaximos(4);
		assertEquals(0, v1.getImporte());
	}

	@Test
	void testImportes() {

		Premio price = new Premio(2);
		price.setCantVendedoras(2);

		Vendedora v1 = new Vendedora(new float[] { 15, 1, 6 });

		Vendedora v2 = new Vendedora(new float[] { 15, 1, 6, 10 });

		Vendedora[] vendedoras = { v1, v2 };

		float impMax = price.calcularImportes(vendedoras);

		assertEquals(16, v1.getImporte());
		assertEquals(16, v2.getImporte());

		int cantidad = price.cantidadMaximos(vendedoras, impMax);

		assertEquals(2, cantidad);

	}

	@Test
	void testNoHayGanadora() {
		Premio price = new Premio(6);
		price.setCantVendedoras(3);

		Vendedora v1 = new Vendedora(new float[] { 20, 44, 10 });

		Vendedora v2 = new Vendedora(new float[] { 5, 7, 46, 18 });

		Vendedora v3 = new Vendedora(new float[] { 10, 24, 40, 10, 5 });

		Vendedora[] vendedoras = { v1, v2, v3 };

		assertEquals(false, price.puedeHaberGanador(vendedoras));
	}

	@Test
	void testHayGanadora() {
		Premio price = new Premio(2);
		price.setCantVendedoras(3);

		Vendedora v1 = new Vendedora(new float[] { 20, 44, 10 });

		Vendedora v2 = new Vendedora(new float[] { 5, 7, 46, 18 });

		Vendedora v3 = new Vendedora(new float[] { 10, 24, 40, 10, 5 });

		Vendedora[] vendedoras = { v1, v2, v3 };

		assertEquals(true, price.puedeHaberGanador(vendedoras));
	}

	@Test
	void CompeticionUno() { // No se puede desempatar
		Premio price = new Premio(4);
		price.setCantVendedoras(2);

		Vendedora v1 = new Vendedora(new float[] { 10, 10, 20, 44, 1 });

		Vendedora v2 = new Vendedora(new float[] { 1, 10, 46, 18, 10 });

//		Vendedora v3= new Vendedora(new float[] {10,24,40,10,5}) ;

		Vendedora[] vendedoras = { v1, v2 };

		assertEquals(-2, price.buscarGanadora(vendedoras));
	}

	@Test
	void CompeticionDos() { // Caso en el que gana la vendedora 3 ( indice == 2 )
		Premio price = new Premio(2);
		price.setCantVendedoras(3);

		Vendedora v1 = new Vendedora(new float[] { 20, 44, 10 });

		Vendedora v2 = new Vendedora(new float[] { 5, 7, 46, 18 });

		Vendedora v3 = new Vendedora(new float[] { 10, 24, 40, 10, 5 });

		Vendedora[] vendedoras = { v1, v2, v3 };

		assertEquals(2, price.buscarGanadora(vendedoras));
	}

	@Test
	void CompeticionTres() { // Caso en el que no puede haber ganador
		Premio price = new Premio(6); // N == 6
		price.setCantVendedoras(2); // Cant vendedoras == 2
		Vendedora v1 = new Vendedora(new float[] { 20, 44, 10 }); // Resumen de vendedora 1

		Vendedora v2 = new Vendedora(new float[] { 5, 10, 46, 18 }); // Resumen de vendedora 2

		Vendedora[] vendedoras = { v1, v2 }; // Vector que contiene a todas las vendedoras

		assertEquals(-1, price.buscarGanadora(vendedoras)); // Dado que N=6 y el resumen mas grande tiene solo 4 ventas
															// Nadie gana.
	}

	@Test
	void verifica_Consecutivos() {

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea;
		int x; // auxiliar de enteros
		float f; // auxiliar de floats
		Premio concurso = new Premio();

		try {
			archivo = new File(
					"Lote-de-Prueba_VendedorasPremiadas\\Entrada\\Verifica_Consecutivos.in");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			linea = br.readLine();
			x = Integer.parseInt(linea); // Primera leida es cant vendedoras
			concurso.setCantVendedoras(x);

			Vendedora[] vendedoras = new Vendedora[x];

			for (int i = 0; i < concurso.getCantVendedoras(); i++) {

				vendedoras[i] = new Vendedora();

				linea = br.readLine();
				x = Integer.parseInt(linea); // Cant de ventas de la vendedora i
				vendedoras[i].setCantVentas(x);

				float[] auxiliarImportes = new float[x]; // array auxiliar para guardar los importes

				for (int j = 0; j < vendedoras[i].getCantVentas(); j++) {

					linea = br.readLine();
					f = Float.parseFloat(linea);
					auxiliarImportes[j] = f;

				}

				vendedoras[i].setResumenVenta(auxiliarImportes); // setteamos el resumen de ventas de la vendedora i

			}

			linea = br.readLine();
			x = Integer.parseInt(linea);
			concurso.setN(x);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
