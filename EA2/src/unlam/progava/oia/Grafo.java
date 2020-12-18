package unlam.progava.oia;

public class Grafo {

	private int[][] grafo;
	private int verticesNum;

	public Grafo(int[][] Grafo) {
		this.grafo = Grafo;
		this.verticesNum = Grafo.length;
	}

	public int getVerticesNumber() {
		return this.verticesNum;
	}

	public boolean edgeExists(int desde, int hasta) {
		return this.grafo[desde][hasta] > 0 && this.grafo[desde][hasta] != Integer.MAX_VALUE;
	}

	public int getEdgeWeight(int desde, int hasta) {
		return this.grafo[desde][hasta];
	}

	/**************Para resolver la EA**************/

	public int ResolverCosto(boolean[] ciudadesInfra) {
		int costo = 0;

		while (!todosConInfra(ciudadesInfra)) {

			int minCosto = Integer.MAX_VALUE;
			Integer destino = null;

			for (int i = 0; i < ciudadesInfra.length; i++) {
				if (!ciudadesInfra[i])
					continue;

				for (int y = 0; y < this.verticesNum; y++) {
					if (this.grafo[i][y] == 0 || ciudadesInfra[y])
						continue;

					if (grafo[i][y] < minCosto) {
						minCosto = grafo[i][y];
						destino = y;
					}
				}
			}
			
			ciudadesInfra[destino] = true;
			costo += minCosto;
		}

		return costo;
	}

	private boolean todosConInfra(boolean[] ciudadesInfra) {
		for (int i = 0; i < ciudadesInfra.length; i++)
			if (ciudadesInfra[i] == false)
				return false;

		return true;
	}
}
