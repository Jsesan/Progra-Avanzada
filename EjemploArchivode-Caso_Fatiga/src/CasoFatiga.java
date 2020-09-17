
import java.io.*;

public class CasoFatiga {

	private String nombre;

	public CasoFatiga() {
		super();
		this.nombre = "Caso_Fatiga.in";
	}

	public void GenerarCasoDeFatiga() {
		FileWriter archivo = null;
		PrintWriter pw = null;

		try {
			archivo = new FileWriter(this.nombre);
			pw = new PrintWriter(archivo);

			pw.println(100); // Imprimimos cant de vendedoras

			for (int i = 0; i < 100; i++) {
				pw.println(1000); // Imprimimos cant de vendas x vendedora
				for (int j = 0; j < 1000; j++) {
					pw.println(1); // Importe de las 1000 ventas
				}
				pw.println(1);// El N a considerar
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (archivo != null) {
				try {
					archivo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
