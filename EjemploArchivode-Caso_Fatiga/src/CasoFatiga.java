
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
			
			pw.println(1000);
			for(int i=0;i<1000;i++)
				pw.print(1+" ");
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
