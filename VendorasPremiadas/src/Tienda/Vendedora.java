package Tienda;

public class Vendedora {

	private int[] resumenVentas;
	private int cantVentas;
	private int participa = 0; // Tomara 0 por defecto en caso de que clasifique a un desempate sera >0 y si
								// esta descalificada sera -1

	public int getParticipa() {
		return participa;
	}

	public void setParticipa(int participa) {
		this.participa = participa;
	}

	public int[] getResumenVenta() {
		return resumenVentas;
	}

	public int getcantVentas() {
		return cantVentas;
	}

	public void setResumenVenta(int[] resumenVenta) {
		this.resumenVentas = resumenVenta;
		this.cantVentas = resumenVenta.length;
	}

	public float importeNMaximos(int N) {
		float importe = 0, aux = 0;

		if (this.cantVentas < N) {
			this.setParticipa(-1); // Si no participa dado a que no tiene N
			return 0; // ventas consecutivas su condicion es -1
		}

		for (int i = 0; i < this.resumenVentas.length; i++) {
			if (this.resumenVentas.length - i >= N) {
				for (int j = i; j <= i + N - 1; j++) {
					aux += this.resumenVentas[j];
				}
				if (aux > importe) {
					importe = aux;

				}
				aux = 0;
			} else {
				break;
			}
		}

		return importe;
	}

	public int comparar(Vendedora v2, int N) {
		Float importe = importeNMaximos(N);
		return importe.compareTo(v2.importeNMaximos(N));
	}

}
