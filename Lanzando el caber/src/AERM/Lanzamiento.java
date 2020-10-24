package AERM;

public class Lanzamiento {
	private double distancia;
	private double angulo; // se utiliza los angulo dado que no modifica utilizar estos o el formato en
							// hora

	public Lanzamiento(double distancia, double angulo) {

		this.distancia = distancia;
		this.angulo = angulo;
	}

	public boolean esValido() {
		if (this.angulo >= -90 && this.angulo <= 90)
			return true;
		return false;
	}

	public double getDistancia() {
		return distancia;
	}

	public double getAngulo() {
		return angulo;
	}

}
