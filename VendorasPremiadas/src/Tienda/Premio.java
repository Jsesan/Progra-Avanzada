package Tienda;

public class Premio {
	private int N; // N es el numero de ventas consecutivas necesarias para ganar el premio
	private int cantVendedoras;

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

	public int buscarGanadora(Vendedora[] vendedoras, float importes[]) {
		float impMax = 0;
		int cantMaximos = 0;
		if (!this.puedeHaberGanador(vendedoras))
			return -1; // No puede haber ganador

		while (cantMaximos == 0) {
			impMax = this.calcularImportes(vendedoras, importes);
			cantMaximos = this.cantidadMaximos(importes, impMax);
			if (cantMaximos == 1) { 
				return buscarPosicionGanador(importes, impMax);//Posicion de la ganadora
			} else if (cantMaximos > 1) { // Hubo empate se debe buscar las posiciones que no empataron y "quitarlas" de
											// la competicion
				cambiarParticipacion(impMax, vendedoras, importes);
				if(this.siguenCompitiendo(importes)) {
					cantMaximos = 0;
					this.N++;
				}
				else {
					return -2; //No se puede desempatar
				}
			}
		}

		return -3; // ERROR
	}

	public boolean puedeHaberGanador(Vendedora[] vendedoras) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getcantVentas() >= N)
				return true;
		}

		return false;
	}

	public float calcularImportes(Vendedora[] vendedoras, float[] importes) {
		float impMax = 0;
		for (int i = 0; i < vendedoras.length; i++) {
			if (vendedoras[i].getParticipa() == 0) {
				importes[i] = vendedoras[i].importeNMaximos(this.N);

				if (importes[i] > impMax)
					impMax = importes[i];
			} else {
				importes[i] = 0;
			}
		}

		return impMax;
	}

	public int cantidadMaximos(float[] importes, float impMax) {
		int cantidad = 0;

		for (int i = 0; i < importes.length; i++) {
			if (importes[i] == impMax) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int buscarPosicionGanador(float[] importes, float impMax) {
		for (int i = 0; i < importes.length; i++) {
			if (importes[i] == impMax)
				return i;
		}
		return -1; // Caso de falla (no deberia)
	}

	public void cambiarParticipacion(float impMax, Vendedora[] vendedoras, float[] importes) {
		for (int i = 0; i < vendedoras.length; i++) {
			if (impMax != importes[i]) {
				vendedoras[i].setParticipa(-1);
			}
		}
	}

	public boolean siguenCompitiendo(float[] importes) {
		for (int i = 0; i < importes.length; i++) {
			if (importes[i] != 0)
				return true;
		}
		return false;
	}

}
