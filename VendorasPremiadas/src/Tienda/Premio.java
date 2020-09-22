package Tienda;

import java.util.Scanner;
import java.io.*;

public class Premio {
	private int N; // N es el numero de ventas consecutivas necesarias para ganar el premio
	private int cantVendedoras;

	public Premio() {

	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public int getCantVendedoras() {
		return cantVendedoras;
	}

	public void setCantVendedoras(int cantVendedoras) {
		this.cantVendedoras = cantVendedoras;
	}

	public Premio(int ventasNecesarias) {
		super();
		this.N = ventasNecesarias;
	}

	public int buscarGanadora(Vendedora[] vendedoras) {
		float impMax = 0;
		int cantMaximos = 0;
		if (!this.puedeHaberGanador(vendedoras))
			return -1; // No puede haber ganador

		while (cantMaximos == 0) {
			impMax = this.calcularImportes(vendedoras);
			cantMaximos = this.cantidadMaximos(vendedoras, impMax);
			if (cantMaximos == 1) {
				return buscarPosicionGanador(vendedoras, impMax);// Posicion de la ganadora
			} else if (cantMaximos > 1) { // Hubo empate se debe buscar las posiciones que no empataron y "quitarlas" de
											// la competicion
				cambiarParticipacion(impMax, vendedoras);
				if (this.siguenCompitiendo(vendedoras)) {
					cantMaximos = 0;
					this.N++;
				} else {
					return -2; // No se puede desempatar
				}
			}
		}

		return -3; // ERROR
	}

	public boolean puedeHaberGanador(Vendedora[] vendedoras) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getCantVentas() >= N)
				return true;
		}

		return false;
	}

	public float calcularImportes(Vendedora[] vendedoras) {
		float impMax = 0;
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getParticipa() == 0) {
				vendedoras[i].importeNMaximos(this.N);
				if (vendedoras[i].getImporte() > impMax)
					impMax = vendedoras[i].getImporte();
			} else {
				vendedoras[i].setImporte(0);
			}
		}

		return impMax;
	}

	public int cantidadMaximos(Vendedora[] vendedoras, float impMax) {
		int cantidad = 0;

		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getImporte() == impMax) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int buscarPosicionGanador(Vendedora[] vendedoras, float impMax) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getImporte() == impMax)
				return i;
		}
		return -1; // Caso de falla (no deberia)
	}

	public void cambiarParticipacion(float impMax, Vendedora[] vendedoras) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (impMax != vendedoras[i].getImporte()) {
				vendedoras[i].setParticipa(-1);
			}
		}
	}

	public boolean siguenCompitiendo(Vendedora[] vendedoras) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getImporte() != 0)
				return true;
		}
		return false;
	}

	Vendedora[] cargarCasoDePrueba(String name) {

		Scanner arch = null;
		int datoInt;
		float datoFloat;
		Vendedora[] nulls = null;
		try {
			arch = new Scanner(new File("Lote-de-Prueba_VendedorasPremiadas\\Entrada\\" + name + ".in"));

			datoInt = arch.nextInt(); // Leemos cantidad de participantes
			this.setCantVendedoras(datoInt);

			Vendedora[] vendedoras = new Vendedora[datoInt];

			for (int i = 0; i < this.cantVendedoras; i++) {

				vendedoras[i] = new Vendedora();
				datoInt = arch.nextInt(); // cantidad de ventas de la vendedora i
				vendedoras[i].setCantVentas(datoInt);

				float[] auxiliarImportes = new float[datoInt]; // array auxiliar para guardar los importes

				for (int j = 0; j < vendedoras[i].getCantVentas(); j++) {
					datoFloat = arch.nextFloat();
					auxiliarImportes[j] = datoFloat;
				}

				vendedoras[i].setResumenVenta(auxiliarImportes); // setteamos el resumen de ventas de la vendedora i
			}

			datoInt = arch.nextInt();
			this.setN(datoInt); // setteamos la cant N de ventas consecutivas

			return vendedoras;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
		
		return nulls;
	}
	
	void escribirSalida(String name, int g, Vendedora vendedoraGanadora) {
		FileWriter arch = null;
		PrintWriter pw = null;

		try {
			arch = new FileWriter("Lote-de-Prueba_VendedorasPremiadas\\Salida Obtenida\\"+ name + ".out");
			pw = new PrintWriter(arch);
			
			if(g>=0) { // hubo ganadora se debe mostrar 
				pw.println(g+1);
				pw.println(this.getN()+" "+vendedoraGanadora.getImporte());
			}
			else {
				if(g==-1)
					pw.println("No hay ganadoras");
				if(g==-2)
					pw.println("No se puede desempatar");
				if(g==-3)
					pw.println("ERROR desconocido");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (arch != null) {
				try {
					arch.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
