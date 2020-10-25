package AERM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public Lanzador[] leerYCargarDatosDe(String name) {

		Scanner arch = null;
		Lanzamiento lanzamientos[];
		Lanzador competidores[];
		double dist, angulo;

		try {
			arch = new Scanner(new File("./LotesPrueba/Entrada/" + name + ".in"));
			int n = arch.nextInt();

			lanzamientos = new Lanzamiento[3];
			competidores = new Lanzador[n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					dist = arch.nextDouble();
					angulo = arch.nextDouble();
					lanzamientos[j] = new Lanzamiento(dist, angulo);
				}
				competidores[i] = new Lanzador(lanzamientos);
			}

			return competidores;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}

		return null;
	}

	public void escribirResultadosEn(String name, int[] podioDist, int[] podioCons) {
		FileWriter arch = null;
		PrintWriter pw = null;

		try {
			arch = new FileWriter("./LotesPrueba/Salida Obtenida/" + name + ".out");
			pw = new PrintWriter(arch);

			for (int i = 0; i < podioCons.length; i++) {
				if(podioCons[i] != 0)	
					pw.print(podioCons[i]+" ");
			}
			
			pw.println();
			
			for (int i = 0; i < podioDist.length; i++) {
				pw.print(podioDist[i]+" ");
			}

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

}
