
import java.io.*;

public class CasoFatiga {

	private String nombre;

	public CasoFatiga() {
		super();
		this.nombre = "Caso_Fatiga.in";
	}

	public void GenerarCasoDeFatiga() {
		FileWriter arch = null;
		PrintWriter pw = null;

		try {
			arch = new FileWriter("CasoFatiga.in");
			pw = new PrintWriter(arch);
			int lanzadores = 1000000;
			pw.println(lanzadores);

			pw.println("1,49	5,00");
			pw.println("1,49	5,00");
			pw.println("1,49	5,00");
			for(int i=0;i<(lanzadores*3)-3;i++) {
				
				pw.println("1,49	95,00");
				}
			System.out.print("termine");
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
