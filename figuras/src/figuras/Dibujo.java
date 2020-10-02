package figuras;

import java.util.ArrayList;
import java.util.List;

public class Dibujo {
	
	private List<Figura> figuras;
	
	public Dibujo() {
		figuras = new ArrayList<Figura>();
	}
	
	public void agregarFigura(Figura figura) {
		figuras.add(figura);
	}
	
	public void colorearContornoDibujo(Color color) {
		// TODO: Implement me!
	}
	
	public void colorearRellenoDibujo(Color color) {
		// TODO: Implement me!
	}
	
	public double calcularPerimetroTotalDelDibujo() {
		// Precondición: No contempla figuras superpuestas
		
		// TODO: Implement me!
		
		return 0;
	}
	
	public double calcularSuperficieTotalDelDibujo() {
		// Precondición: No contempla figuras superpuestas
		
		// TODO: Implement me!
		
		return 0;
	}
	
	public double calcularSuperficiePorColorDelDibujo(Color color) {
		// Precondición: No contempla figuras superpuestas
		
		// TODO: Implement me!
		
		return 0;
	}

}
