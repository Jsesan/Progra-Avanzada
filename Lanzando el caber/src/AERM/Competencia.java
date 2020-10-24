package AERM;

public class Competencia {
	private int cantCompetidores;
	private Lanzador[] competidores;
	private int[] podioDistancia;
	private int[] podioConsistencia;

	public Competencia(int cantCompetidores, Lanzador[] competidores) {

		this.cantCompetidores = cantCompetidores;
		this.competidores = competidores;
		this.podioDistancia = obtenerPodioDist();
	}

	private int[] obtenerPodioDist() {
		Lanzamiento[] lanzamientosnulos = { new Lanzamiento(0, 0), new Lanzamiento(0, 0), new Lanzamiento(0, 0) };
		Lanzador Lanzadornulo = new Lanzador(lanzamientosnulos);
		
		int[] podio = {0,0,0};
		Lanzador[] aux= {Lanzadornulo,Lanzadornulo,Lanzadornulo};
		
		int i = 1;
		for (Lanzador lanzador : competidores) {
			if(lanzador.getDistanciaLanzamientos()>aux[0].getDistanciaLanzamientos()) {
				
				aux[2] = aux[1];
				podio[2]= podio [1];
				aux[1] = aux [0];
				podio[1] = podio[0];
				
				aux[0] = lanzador;
				podio[0] = i;
			}
			else {
				if(lanzador.getDistanciaLanzamientos()>aux[1].getDistanciaLanzamientos()) {
					aux[2] = aux[1];
					podio[2]= podio [1];
					
					aux[1] = lanzador;
					podio[1] = i;
				}
				else {
					if(lanzador.getDistanciaLanzamientos()>aux[2].getDistanciaLanzamientos()) {
						aux[2] = lanzador;
						podio[2] = i;
					}
				}
			}
			i++;
		}

		return podio;
	}

	public int[] getPodioDistancia() {
		return podioDistancia;
	}

	public int[] getPodioConsistencia() {
		return podioConsistencia;
	}

	
	
}
