package AERM;

public class Lanzador {
	private Lanzamiento lanzamientos[];
	private boolean todosValidos;
	private double distanciaLanzamientos;

	public Lanzador(Lanzamiento[] lanzamientos) {

		this.lanzamientos = lanzamientos;
		this.todosValidos = validarLanzamientos();
		this.distanciaLanzamientos = distanciaTotal();
	}

	private boolean validarLanzamientos() {

		for (Lanzamiento lanzamiento : lanzamientos) {
			if (lanzamiento.esValido() == false)
				return false;
		}

		return true;
	}

	public double distanciaTotal() {
		double distancia = 0;

		for (Lanzamiento lanzamiento : lanzamientos) {
			if (lanzamiento.esValido() == false)
				distancia += 0;
			else {
				if (lanzamiento.getAngulo() > 30 || lanzamiento.getAngulo() < -30)
					distancia += lanzamiento.getDistancia() * 0.8;
				else
					distancia += lanzamiento.getDistancia();
			}
		}

		return distancia;
	}

	public boolean isTodosValidos() {
		return todosValidos;
	}

	public double getDistanciaLanzamientos() {
		return distanciaLanzamientos;
	}
	
	

}
