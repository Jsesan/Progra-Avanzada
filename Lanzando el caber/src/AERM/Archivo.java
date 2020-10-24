package AERM;

import java.io.File;
import java.util.Scanner;

public class Archivo {
	
	public void leerYCargarDatos(String name) {
		Scanner arch = null;

		try {
			arch = new Scanner(new File("./LotesPrueba/Entrada/" + name + ".in"));
			
			/*
			 * 	1era linea n cantidad de competidores -> int
			 * 	luego n*3 lineas con tublas del tipo (d,a)  -> ambos float.
			 * 
			 * */
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
	}
	
}
