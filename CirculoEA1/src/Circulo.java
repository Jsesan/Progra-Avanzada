
public class Circulo {
	private float radio;

	public Circulo(float radio) throws RadioNoValidoException {
		if(radio<=0)
			throw new RadioNoValidoException("Radio no valido");
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}
	
	
}
