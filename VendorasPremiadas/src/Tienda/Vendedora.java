package Tienda;


public class Vendedora {

	private float[] resumenVentas;
	private float importe;
	private int cantVentas;
	private int participa; // Tomara 0 por defecto en caso de que
							// esta descalificada sera -1

	public Vendedora(float[] resumen) {
		this.resumenVentas = resumen;
		this.cantVentas = resumen.length;
		this.participa = 0;
		this.importe = 0;
	}

	public Vendedora() {
		
	}

	public float getImporte() {
		return importe;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public int getParticipa() {
		return participa;
	}

	public void setParticipa(int participa) {
		this.participa = participa;
	}

	public float[] getResumenVenta() {
		return resumenVentas;
	}

	public void setResumenVenta(float[] resumenVenta) {
		this.resumenVentas = resumenVenta;
		this.cantVentas = resumenVenta.length;
	}

	public void importeNMaximos(int N) {
		float importe = 0, aux = 0;

		if (this.cantVentas < N) {
			this.setParticipa(-1); // Si no participa dado a que no tiene N
			return; // ventas consecutivas su condicion es -1
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

		this.importe = importe;
	}

	
	
	
}
