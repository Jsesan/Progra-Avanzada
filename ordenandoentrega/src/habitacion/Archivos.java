package habitacion;

import java.io.*;
import java.util.*;

public class Archivos {
	
	private int P;
	private int[] cajas;
	
	public int getP() {
		return P;
	}


	public int[] getCajas() {
		return cajas;
	}


	public void leerYCargarDatos(String name) {
		Scanner arch = null;

		try {
			arch = new Scanner(new File("./LotesPrueba/Entrada/" + name + ".in"));

			P = arch.nextInt();
			
			cajas = new int[P];
			
			for (int i = 0; i < P; i++)
				cajas[i] = arch.nextInt();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
	}

	public void escribirCantMovs(String name, int cantMovs) {
		FileWriter arch = null;
		PrintWriter pw = null;

		try {
			arch = new FileWriter("./LotesPrueba/Salida Obtenida/"+ name +".out");
			pw = new PrintWriter(arch);

			pw.print(cantMovs);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (arch != null) {
				try {
					arch.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	public int obtenerSalidaEsperada(String name) {
		
		Scanner arch = null;

		try {
			arch = new Scanner(new File("./LotesPrueba/Salida Esperada/" + name + ".out"));
			
			return arch.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
		
		return -1; //Significa error en el archivo leido.
	}
}
