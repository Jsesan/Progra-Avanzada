package AERM;

public class Competencia {

	private Lanzador[] competidores;
	private int[] podioDistancia;
	private int[] podioConsistencia;

	public Competencia(Lanzador[] competidores) {
		this.competidores = competidores;
		this.podioDistancia = obtenerPodioDist();
		this.podioConsistencia = obtenerPodioCons();
	}

	private int[] obtenerPodioCons() {

		Lanzador[] aux = { null, null, null };
		int[] podio = { 0, 0, 0 };
		int i = 1;
		for (Lanzador lanzador : competidores) {
			if (lanzador.isTodosValidos() == true) {
				if(aux[0]==null || lanzador.getModuloConsistencia()<aux[0].getModuloConsistencia()) {
					aux[2] = aux[1];
					podio[2] = podio[1];
					aux[1] = aux[0];			// ya se que es una crotada perdon profe <3
					podio[1] = podio[0];
					
					aux[0] = lanzador;
					podio[0] = i;
				}
				else {
					if( aux[1]==null || lanzador.getModuloConsistencia()<aux[1].getModuloConsistencia() ) {
						aux[2] = aux[1];
						podio[2] = podio[1];
						
						aux[1] = lanzador;
						podio[1] = i;
					}
					else {
						if( aux[2]==null || lanzador.getModuloConsistencia()<aux[2].getModuloConsistencia() ) {
							aux[2] = lanzador;
							podio[2] = i;
						}
					}
				}
			}
			i++;
		}
		
		return podio;
	}

	private int[] obtenerPodioDist() {
		Lanzamiento[] lanzamientosnulos = { new Lanzamiento(0, 0), new Lanzamiento(0, 0), new Lanzamiento(0, 0) };
		Lanzador Lanzadornulo = new Lanzador(lanzamientosnulos);

		int[] podio = { 0, 0, 0 };
		Lanzador[] aux = { Lanzadornulo, Lanzadornulo, Lanzadornulo };

		int i = 1;
		for (Lanzador lanzador : competidores) {
			if (lanzador.getDistanciaLanzamientos() > aux[0].getDistanciaLanzamientos()) {

				aux[2] = aux[1];
				podio[2] = podio[1];
				aux[1] = aux[0];			// ya se que es una crotada 2.0 perdon profe <3
				podio[1] = podio[0];

				aux[0] = lanzador;
				podio[0] = i;
			} else {
				if (lanzador.getDistanciaLanzamientos() > aux[1].getDistanciaLanzamientos()) {
					aux[2] = aux[1];
					podio[2] = podio[1];

					aux[1] = lanzador;
					podio[1] = i;
				} else {
					if (lanzador.getDistanciaLanzamientos() > aux[2].getDistanciaLanzamientos()) {
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
