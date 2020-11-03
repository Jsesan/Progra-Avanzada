package Grafo;

public class GrafoMatrizNoDirigido extends Grafo {

	boolean grafoNoDirigido[][];
	

	public GrafoMatrizNoDirigido(int aristas) {
		grafoNoDirigido = new boolean[aristas][aristas];
	}

	private int contarVertices() {
		int cant = 0;

		for (int i = 0; i < grafoNoDirigido.length; i++) {
			for (int j = 0; j < grafoNoDirigido.length; j++) {
				if (j >= i && (grafoNoDirigido[i][j] == true))
					cant++;
			}
		}

		return cant;
	}

	public int getVertices() {

		return contarVertices();
	}

	public int getAristas() {

		return grafoNoDirigido.length;
	}

	public void setCosto() {

	}

	public double getCosto(int desde, int hasta) {

		return 0; // --> modificar
	}

}
