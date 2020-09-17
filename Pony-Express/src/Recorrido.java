
public class Recorrido {
	
	public Recorrido() {
		super();

	}

	public int jinetes(int[] estaciones) {
		int cantJinetes = 1 // Esto se debe a que la minima cant de jinetes es 1 si se va a realizar un
							// recorrdio
				, millasRecorridas = 0;

		for (int i = 0; i < estaciones.length; i++) {

			if (millasRecorridas + estaciones[i] >= 100) { // Condicion de cambio de jinete o caballo de esta manera millas a
													// recorer nunca sera mayor a 100
				cantJinetes++;
				millasRecorridas = 0;
			}

			millasRecorridas += estaciones[i]; // Se acumula las millas entre estacion a las millas recorridas
		}

		return cantJinetes;
	}
}
