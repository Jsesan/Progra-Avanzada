package unlam.progava.utils;

public enum Complejidad {

	/**
	 * O(1)
	 */
	CONSTANTE("O(1)"),
	/**
	 * O(log n)
	 */
	LOGARITMICA("O(log(n))"),
	/**
	 * O(n)
	 */
	LINEAL("O(n)"),
	/**
	 * O(n log n)
	 */
	NLOGN("O(n×log(n))"),
	/**
	 * O(n2)
	 */
	CUADRATICA("O(n²)"),
	/**
	 * O(n3)
	 */
	CUBICA("O(n³)"),
	/**
	 * O(2^n)
	 */
	EXPONENCIAL("O(2ⁿ)"),
	/**
	 * O(n!)
	 */
	FACTORIAL("O(n!)"),
	/**
	 * Otra
	 */
	OTRA("Otra");
	
	private String descripcion;

	Complejidad(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return this.descripcion;
	}
	
}
