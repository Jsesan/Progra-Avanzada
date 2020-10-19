package habitacion;

public class Habitacion {

	public int zapatos(int P, int[] cajas) {

		if (P == 1)
			return 0;

		int cantCajas = 0;

		for (int i = 0; i < P; i++)
			cantCajas += cajas[i]; // Se obtiene la cantidad total de cajas en todas las pilas

		double doubleCc = (double) cantCajas;
		double doubleP = (double) P;

		/*
		 * Esto se debe a que para un caso de prueba la division entre 9/5 (dos enteros)
		 * el resultado devuelto era 1, y no 2 (el entero mas cercano a 1.8), cuando
		 * realice la operacion con doubles el resultado devuelto era el correcto.
		 */

		int media = (int) Math.round(doubleCc / doubleP);

		int sobreMedia = 0, bajoMedia = 0;

		for (int i = 0; i < P; i++) {

			if (cajas[i] > media)
				sobreMedia += (cajas[i] - media); // Cajas "desacomodadas"

			if (cajas[i] < media)
				bajoMedia += (media - cajas[i]); // Espacio libre donde estarian ordenadas
		}

		return bajoMedia <= sobreMedia ? bajoMedia : sobreMedia;
		
		/*
		 * Se devuelve el menor dado que si hay mas cajas a ordenar que espacios
		 * disponibles, quedaran cajas en una fila superior que no pueden ser acomodadas
		 * en ningun sitio mas en que en su actual Y en el caso de que haya mas espacios
		 * vacios, no habra cajas suficientes para no dejar espacios en blanco.
		 */
	}

}
