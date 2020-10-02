package figuras;

public class Triangulo extends Figura {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double getPerimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double getSuperficie() {
		// Fórmula de Herón
		double t1 = + lado1 + lado2 + lado3;
		double t2 = - lado1 + lado2 + lado3;
		double t3 = + lado1 - lado2 + lado3;
		double t4 = + lado1 + lado2 - lado3;
		return Math.sqrt((t1*t2*t3*t4)/16);
	}
	
	

}
