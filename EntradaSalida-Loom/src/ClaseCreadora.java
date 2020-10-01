import java.io.*;
import java.util.*;

public class ClaseCreadora {
	private String name;
	private int max;
	private int min;
	private float prom;

	public ClaseCreadora(String name) {
		this.name = name;
		this.max = 0;
		this.min = 0;
		this.prom = 0;
	}

	public void crear() throws IOException {

		FileWriter arch = null;
		PrintWriter pw = null;
		int datoInt;
		try {
			arch = new FileWriter(name + ".in");
			pw = new PrintWriter(arch);

			int limInf = 10000, limSup = 20000;

			int cantNum = (int) (Math.random() * (limSup - limInf + 1) + limInf);

			limSup = 12000;

			for (int i = 0; i <= cantNum; i++) {

				datoInt = (int) (Math.random() * limSup);
				pw.println(datoInt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}

	}

	public void procesar() {

		int datoInt, cantNum = 0;
		Scanner arch = null;

		try {
			arch = new Scanner(new File(name + ".in"));

			while (arch.hasNextInt()) {
				datoInt = arch.nextInt();

				if (cantNum == 0) {

					min = datoInt;
					max = datoInt;
					prom += datoInt;

				} else {

					if (datoInt > max)
						max = datoInt;
					if (datoInt < min)
						min = datoInt;
					prom += datoInt;
				}
				cantNum++;
			}

			prom /= cantNum;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
	}

	public void guardarResultados() throws IOException {
		FileWriter arch = null;
		PrintWriter pw = null;
		try {
			arch = new FileWriter("Resultado.out");
			pw = new PrintWriter(arch);

			pw.println("+----------+-------+");
			pw.println("| Máximo   | " + String.format("%5d", max) + " |");
			pw.println("+----------+-------+");
			pw.println("| Mínimo   | " + String.format("%5d", min) + " |");
			pw.println("+----------+-------+");
			pw.println("| Promedio | " + String.format("%5d", Math.round(prom)) + " |");
			pw.println("+----------+-------+");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
	}

}
