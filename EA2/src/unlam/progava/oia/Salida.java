package unlam.progava.oia;

import java.io.File;
import java.util.Scanner;

public class Salida {
	
	public int obtenerSalidaEsperada(String path) {
		
		Scanner arch = null;

		try {
			arch = new Scanner(new File(path));
			
			return arch.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
		
		return -1; //Significa error en el archivo leido.
	}
}
