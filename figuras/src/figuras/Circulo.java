package figuras;

public class Circulo extends Figura {
	
	public double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public double getSuperficie() {
		return Math.PI * radio * radio;
	}

}
