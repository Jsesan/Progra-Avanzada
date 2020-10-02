package figuras;

public abstract class Figura {

	private double posicionX;
	private double posicionY;

	private Color colorBorde;
	private Color colorRelleno;
	
	public Figura() {
		posicionX = 0;
		posicionY = 0;
		colorBorde = Color.NEGRO;
		colorRelleno = Color.BLANCO;
	}

	public abstract double getPerimetro();
	public abstract double getSuperficie();
	

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public Color getColorBorde() {
		return colorBorde;
	}

	public void colorearBorde(Color colorBorde) {
		this.colorBorde = colorBorde;
	}

	public Color getColorRelleno() {
		return colorRelleno;
	}

	public void colorearRelleno(Color colorRelleno) {
		this.colorRelleno = colorRelleno;
	}
	
}
