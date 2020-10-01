import java.io.IOException;

public class app {

	public static void main(String[] args) throws IOException {
		ClaseCreadora p1 = new ClaseCreadora("archivoEntrada");
		p1.crear();
		p1.procesar();
		p1.guardarResultados();
	}

}
