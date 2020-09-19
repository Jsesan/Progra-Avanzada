package PuntosyFiguras;

public class Punto implements Comparable<Punto> {
	private double x;
	private double y;

	public Punto(double x, double y) {// Con parametros
		this.x = x;
		this.y = y;
	}

	public Punto() {// Default
		this.x = 0;
		this.y = 0;
	}

	public Punto(double x) {// Si se quiere crear un punto con un solo parametro este sera el valor tanto
							// para x como para y
		this.x = x;
		this.y = x;
	}

	public double distEntrePuntos(Punto p2) {
		Punto pResta = p2.seLeResta(this);
		return pResta.getModulo();// Formula de distancia
	}

	public double getModulo() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)); // Modulo de un punto
	}

	public Punto seLeResta(Punto p2) {
		return new Punto(this.x - p2.x, this.y - p2.y); // Resta de un punto con otro
	}

	public Punto seLeSuma(Punto p2) {
		return new Punto(this.x + p2.x, this.y + p2.y); // Suma de dos puntos
	}

	public Punto divididoPorEscalar(int n) {
		return new Punto(this.x / n, this.y / n); // Dividimos por un escalar
	}

	public Punto multiplicadoPorEscalar(int n) {
		return new Punto(this.x * n, this.y * n); // Multiplicamos por un escalar
	}

	public Punto puntoMediocon(Punto p2) {
		Punto medio = this.seLeSuma(p2); // Punto medio entre dos puntos se da con la formula
		return medio.divididoPorEscalar(2);// PM= ((x1+x2)/2;(y1+y2)/2)
	}

	public String perteneceAlCuadrante() { // Devuelve en que cuadrante se encuentra segun los ejes cartesianos
		if (this.x > 0 && this.y > 0)
			return "Primer Cuadrante";
		if (this.x < 0 && this.y > 0)
			return "Segundo Cuadrante";
		if (this.x < 0 && this.y < 0)
			return "Tercer Cuadrante";
		if (this.x > 0 && this.y < 0)
			return "Cuarto Cuadrante";

		return "Centro";
	}

	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public Punto desplazar(double x, double y) {
		this.x+=x;
		this.y+=y;
		return this;
	}

	public Punto simetriaAxialEjeX() {
		return new Punto(this.x,-this.y);
	}
	
	public Punto simetriaAxialEjeY() {
		return new Punto(-this.x,this.y);
	}
	
	public Punto simetriaCentral() {
		return new Punto(-this.x,-this.y);
	}
	
	public Punto rotacion90() {
		return new Punto(-this.y,this.x);
	}

	public Punto rotacionPorCualqAnguloRad(double alpha) {//El round esta mal dado que redondea al int mas cercano, aveiguar como solucionar
		return new Punto((this.x*Math.cos(alpha)-this.y*Math.sin(alpha)),Math.round(this.x*Math.sin(alpha)+this.y*Math.cos(alpha)));
	}
	// COMIENZAN LOS OVERRIDE

	@Override
	public int compareTo(Punto punto2) {
		Double miModulo = getModulo();
		return miModulo.compareTo(punto2.getModulo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public Object clone() {
		return new Punto(this.x, this.y);
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
