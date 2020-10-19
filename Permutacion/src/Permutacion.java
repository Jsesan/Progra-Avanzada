
public class Permutacion {

	public boolean esPermutacion(int vector[]) {

		int n = vector.length;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			if (vector[i] != i)
				b = 1;
		}
		
		if(b==0)
			return false; // Esta ordenado, no es una permutacion

		for (int i = 0; i < n; i++) {
			if (vector[i] < n && vector[i] >= 0) {
				for (int j = i + 1; j < n; j++) {
					if (vector[i] == vector[j])
						return false; // Elemento repetido
				}
			} else {
				return false; // Valor fuera de rango
			}
		}

		return true;
	}
}
