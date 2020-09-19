package PuntosyFiguras;

public class Punto3D extends Punto {
	private double z;

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	
	
	public double getZ() {
		return z;
	}



	public void setZ(double z) {
		this.z = z;
	}

	public Punto desplazar(double x, double y, double z) {
		super.desplazar(x, y);
		this.z+=z;
		return this;
	}
	
	

	@Override
	public double getModulo() {
		return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2)+Math.pow(this.z,2));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "," + z + ")";
	}

}
