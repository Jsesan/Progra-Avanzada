import java.io.IOException;

import unlam.progava.utils.Entrega;

public class App {
	public static void main(String[] args) throws IOException {
		if(new Entrega().generar()) {
			System.out.println("Se ha generado el archivo correctamente. Lo encontrarás en la raiz del proyecto luego de refrescarlo en Eclipse.");
			System.out.println("Si cambiás algo en la evaluación, deberás regenerar el examen.");
			System.out.println("El próximo paso es generar el PDF, y comprimir el proyecto");
			System.out.println("Luego ya podrás subir ambos archivos a MIeL como se especifica en la consigna.");
		} else {
			System.out.println("Ha ocurrido un error. Revisá no haber cambiado la base de los ejercicios.");
		}
		
	}
}
