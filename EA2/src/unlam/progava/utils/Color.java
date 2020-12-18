package unlam.progava.utils;

public enum Color {

	BLANCO(' '),
	NEGRO('N'),
	VIOLETA('V'),
	AZUL('Z'),
	VERDE('G'),
	AMARILLO('A'),
	NARANJA('J'),
	ROJO('R');
	
	char representacion;
	
	private Color(char representacion) {
		this.representacion = representacion;
	}
	
	@Override
	public String toString() {
		return Character.toString(this.representacion);
	}
}
