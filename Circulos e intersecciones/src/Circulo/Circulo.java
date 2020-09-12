package Circulo;

public class Circulo extends Punto {
	private double radio;
	private Punto centro;

	public Circulo(Punto centro, double radio) { // Construimos un circulo completamente
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo(Punto centro) {// En caso de que solo se ingrese el centro del circulo a crear el radio default
									// es 1
		this.centro = centro;
		this.radio = 1;
	}

	public Circulo() {// El circulo default esta en el origen con radio 1
		this.centro = new Punto();
		this.radio = 1;
	}

	public Circulo(double radio) {// Si se especifica solo el radio por default el origen sera el centro
		this.centro = new Punto();
		this.radio = radio;
	}

	public boolean intersectaCon(Circulo c2) {
		double rmenor = c2.radio >= this.radio ? this.radio : c2.radio; // Radio del circulo menor
		double rmayor = c2.radio < this.radio ? this.radio : c2.radio; // Radio del circulo mayor
		double dist = c2.centro.distEntrePuntos(this.centro); // distancia entre centros
		System.out.println(dist);
		if (dist + rmenor < rmayor)
			return false;// Si la distancia entre los centros mas el radio menor es menor que el radio
							// mayor significa que el circulo pequeño esta contendio en el grande
		if (dist > rmenor + rmayor)
			return false;// Si la distancia es mayor a la suma de los radios significa que los circulos
							// estan separados y no se tocan

		return true;// Los demas casos los circulos se intersectan
	}

	@Override
	public String toString() {// Este metodo se utilizo a fin de verificar la correcta resolucion de las
								// clases no es parte del ejercicio
		return "Circulo: " + centro + " radio =" + radio;
	}

}
