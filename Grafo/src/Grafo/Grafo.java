package Grafo;

public abstract class Grafo {
	
	public abstract int getVertices();
	public abstract int getAristas();
	public abstract void setCosto();
	public abstract double getCosto(int desde, int hasta);
	
}
