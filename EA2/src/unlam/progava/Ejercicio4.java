package unlam.progava;

public class Ejercicio4 {

	public int puntoA() {
		return 5;
	}
	
	public String puntoAjustificacion() {
		return "Dado que todos los vertices tienen grado 4 y hay 5 aristas en total, "
				+ "todas los vertices son adyacentes "
				+ "entre si por lo tanto deben todas tener un color distinto "
				+ "al ser 5 vertices su Numero Cromatico sera 5."
				+ "Esto tambien cumple que el nro cromatico debe ser <= al GradoMAX+1 "
				+ "como todas las aristas tienen el mismo grado se puede poner solamente ="
				+ "en este caso nro cromatico = 4+1 ";
	}
	
	public int puntoB() {
		return 4;
	}
	
	public String puntoBjustificacion() {
		return  "En este caso el grMax asignado a es 5 (en el vertice A) y la cantidad de Vertices es 6 por lo tanto "
				+ "A  es adyacente de todos, los demas nodos tienen grado 4 (estos tendran 1 solo vertice no "
				+ "adyacente), 3(estos 2) y 2 (estos 3) "
				+ "Los vertices de grado 4 deberan tener un color propio, "
				+ "el de grado 3 al estar conectado con ambos de grado 4, tambien debera tener un color propio "
				+ "Los de grado 2 estan conectados a A(el nodo que conecta con todos) y a uno a los de Grado 4 "
				+ "por lo tanto podra tener el color del grado 3 o el grado 4 con el que no es adyacente.";
	}
	
	public int puntoC() {
		return 3;
	}
	
	public String puntoCjustificacion() {
		return "Dado que todos los vertices tienen grado 4 "
				+ "y hay 6 vertices en el grafo "
				+ "cada vertice podra tener el mismo color "
				+ "que un solo vertice dado que 5 vertices (sin contarse a si mismo) - Grado 4 "
				+ " es 1 vertice que no sera adyacente del Vertice X que elijamos "
				+ "por lo tanto 6 vertices totales / 2 par de vertices no adyacentes = 3-> nro cromatico.";
	}
}
