package AERM;

public class Lanzador {

	private Lanzamiento lanzamientos[];
	private boolean todosValidos;
	private double distanciaLanzamientos;
	private double varD;
	private double varA;

	public Lanzador(Lanzamiento[] lanzamientos) {
		
		this.lanzamientos = lanzamientos;
		this.todosValidos = validarLanzamientos();
		this.distanciaLanzamientos = distanciaTotal();
		this.varD = obtenerVarianzaD();
		this.varA = obtenerVarianzaA();
	}

	private double obtenerVarianzaD() {
		double promedioD = 0;

		for (Lanzamiento lanzamiento : lanzamientos) {
			promedioD += lanzamiento.getDistancia();
		}

		promedioD /= 3;

		double varianza = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			varianza += Math.pow((lanzamiento.getDistancia() - promedioD), 2);
		}

		return varianza / 3;
	}

	private double obtenerVarianzaA() {
		double promedioA = 0;

		for (Lanzamiento lanzamiento : lanzamientos) {
			promedioA += lanzamiento.getAngulo();
		}

		promedioA /= 3;

		double varianza = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			varianza += Math.pow((lanzamiento.getAngulo() - promedioA), 2);
		}

		return varianza / 3;
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
	
	public double getModuloConsistencia() {
		return Math.sqrt(Math.pow(varA, 2) + Math.pow(varD, 2));
	}

	public boolean isTodosValidos() {
		return todosValidos;
	}

	public double getDistanciaLanzamientos() {
		return distanciaLanzamientos;
	}

	public double getVarD() {
		return varD;
	}

	public double getVarA() {
		return varA;
	}


}
