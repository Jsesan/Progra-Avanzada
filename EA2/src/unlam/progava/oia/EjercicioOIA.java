package unlam.progava.oia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import unlam.progava.utils.Complejidad;

public class EjercicioOIA {
	private int totalCiudades;
	private int cantCiudadesConInfra;
	private int numeroRutas;
	private String etiquetas[];
	private int Aristas[][];
	private boolean ciudadesConInfra[];
	private int costoResultado; // conducto necesario
	private Grafo mapaPais;

	public static void main(String[] args) {
		EjercicioOIA ejercicio = new EjercicioOIA();

		ejercicio.leer("src/unlam/progava/oia/in/00.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/00.out");

	}

	/**
	 * Completar en este método la complejidad de la solución provista
	 */
	public Complejidad complejidadDeMiSolucion() {
		return Complejidad.CUBICA;
	}

	/**
	 * Este método se encarga de leer la entrada de la consigna desde el archivo.
	 */
	public void leer(String path) {
		Scanner arch = null;

		try {
			arch = new Scanner(new File(path));

			totalCiudades = arch.nextInt();
			cantCiudadesConInfra = arch.nextInt();
			numeroRutas = arch.nextInt();

			arch.nextLine();

			etiquetas = new String[totalCiudades];

			for (int i = 0; i < totalCiudades; i++)
				etiquetas[i] = arch.nextLine();

			ciudadesConInfra = new boolean[totalCiudades];
			
			String Infra = arch.nextLine();
			String[] indicesInfra = Infra.split(" ");
			for (int i = 0; i < cantCiudadesConInfra; i++) {
				int indiceTrue = Integer.parseInt(indicesInfra[i]);
				ciudadesConInfra[indiceTrue-1] = true;
			}

			Aristas = new int[totalCiudades][totalCiudades];

			for (int i = 0; i < numeroRutas; i++) {
				String Linea = arch.nextLine();
				String[] partes = Linea.split(" ");
				int indice1 = -1, indice2 = -1;

				for (int x = 0; x < etiquetas.length; x++) {
					if (etiquetas[x].compareTo(partes[0]) == 0) {
						indice1 = x;
					}
				}

				for (int x = 0; x < etiquetas.length; x++) {
					if (etiquetas[x].compareTo(partes[1]) == 0) {
						indice2 = x;
					}
				}

				Aristas[indice1][indice2] = Integer.parseInt(partes[2]);
				Aristas[indice2][indice1] = Integer.parseInt(partes[2]);
				
				
			}
			
			mapaPais  = new Grafo(Aristas);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}

	}

	/**
	 * Este método se encarga de escribir la salida de la consigna en el archivo.
	 */
	public void escribir(String path) {
		FileWriter arch = null;
		PrintWriter pw = null;

		try {
			arch = new FileWriter(path);
			pw = new PrintWriter(arch);

			pw.print(this.costoResultado);
			
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

	/**
	 * Este método debe realizar la resolución del ejercicio. NO DEBE SITUARSE LA
	 * LOGICA AQUI, sino que se pueden utilizar clases adicionales, y los objetos
	 * creados en la etapa de lectura. Utilizar este mismo paquete para toda la
	 * resolución.
	 */
	public void resolver() {
		this.costoResultado = this.mapaPais.ResolverCosto(ciudadesConInfra);
	}
	
	public int getCosto() {
		return this.costoResultado;
	}
}
