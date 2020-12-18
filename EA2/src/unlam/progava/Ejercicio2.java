package unlam.progava;

import unlam.progava.utils.Color;
import unlam.progava.utils.Complejidad;

public class Ejercicio2 {
	private final int alto = 8;
	private final int largoPatron = 12;

	public Complejidad complejidadDeMiSolucion() {
		return Complejidad.LINEAL;
	}

	public Color[][] pintarEstela(int n) {
		if (n <= alto)
			throw new RuntimeException("N (largo de la estela) debe ser mayor que " + alto);

		Color[][] patron = obtenerPatron();
		Color[][] lienzo = new Color[alto][n];
		int indicePatron = 0;

		for (int indiceLienzo = 0; indiceLienzo < n; indiceLienzo++) {
			lienzo[0][indiceLienzo] = patron[0][indicePatron];
			lienzo[1][indiceLienzo] = patron[1][indicePatron];
			lienzo[2][indiceLienzo] = patron[2][indicePatron];
			lienzo[3][indiceLienzo] = patron[3][indicePatron];
			lienzo[4][indiceLienzo] = patron[4][indicePatron];
			lienzo[5][indiceLienzo] = patron[5][indicePatron];
			lienzo[6][indiceLienzo] = patron[6][indicePatron];
			lienzo[7][indiceLienzo] = patron[7][indicePatron];
			
			indicePatron++;
			if(indicePatron == largoPatron)
				indicePatron=0;
		}
		
		return lienzo;
	}

	private Color[][] obtenerPatron() {
		Color[][] patron = {
				{ Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.ROJO, Color.ROJO,
						Color.ROJO, Color.NEGRO, Color.NEGRO, Color.NEGRO },
				{ Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.ROJO, Color.ROJO, Color.ROJO, Color.NARANJA,
						Color.NARANJA, Color.NARANJA, Color.ROJO, Color.ROJO, Color.ROJO },
				{ Color.ROJO, Color.ROJO, Color.ROJO, Color.NARANJA, Color.NARANJA, Color.NARANJA, Color.AMARILLO,
						Color.AMARILLO, Color.AMARILLO, Color.NARANJA, Color.NARANJA, Color.NARANJA },
				{ Color.NARANJA, Color.NARANJA, Color.NARANJA, Color.AMARILLO, Color.AMARILLO, Color.AMARILLO,
						Color.VERDE, Color.VERDE, Color.VERDE, Color.AMARILLO, Color.AMARILLO, Color.AMARILLO },
				{ Color.AMARILLO, Color.AMARILLO, Color.AMARILLO, Color.VERDE, Color.VERDE, Color.VERDE, Color.AZUL,
						Color.AZUL, Color.AZUL, Color.VERDE, Color.VERDE, Color.VERDE },
				{ Color.VERDE, Color.VERDE, Color.VERDE, Color.AZUL, Color.AZUL, Color.AZUL, Color.VIOLETA,
						Color.VIOLETA, Color.VIOLETA, Color.AZUL, Color.AZUL, Color.AZUL },
				{ Color.AZUL, Color.AZUL, Color.AZUL, Color.VIOLETA, Color.VIOLETA, Color.VIOLETA, Color.NEGRO,
						Color.NEGRO, Color.NEGRO, Color.VIOLETA, Color.VIOLETA, Color.VIOLETA },
				{ Color.VIOLETA, Color.VIOLETA, Color.VIOLETA, Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO,
						Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO, Color.NEGRO }, };

		// Hice ctrl shift f y lo desformateo perdon, (si pongo ctrl z vuelve de a uno)

		return patron;
	}
}
