package PuntosyFiguras;

public class Principal {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(5, 5), 1);
		Circulo c2 = new Circulo(new Punto(0, 0), 1);
		System.out.print(c1.intersectaCon(c2));
	}

}
