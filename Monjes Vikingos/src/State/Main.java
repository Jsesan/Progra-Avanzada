package State;

public class Main {
	
	public static void main(String[] args) {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		ragnar.atacar(loki);
		System.err.println(loki.getVida());
		System.err.println(loki.getEstado());
		
		loki.atacar(ragnar);
		System.err.println(ragnar.getVida());
		System.err.println(ragnar.getEstado());
		
		loki.atacar(ragnar);
		System.err.println(ragnar.getVida());
		System.err.println(ragnar.getEstado());
		
		ragnar.atacar(loki);
		System.err.println(loki.getVida());
		System.err.println(loki.getEstado());
	}
}
