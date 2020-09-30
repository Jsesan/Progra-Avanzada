package Condicionales;



public class App {

	public static void main(String[] args) {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		loki.recibieGolpeDe(ragnar.ataca());
		System.out.println("Loki: "+loki);
		
		ragnar.recibieGolpeDe(loki.ataca());
		System.out.println("Ragnar: "+ragnar);
		
		loki.recibieGolpeDe(ragnar.ataca());
		System.out.println("Loki: "+loki);
		
		ragnar.recibieGolpeDe(loki.ataca());
		System.out.println("Ragnar: "+ragnar);
		
		ragnar.meditar();
		System.out.println("Ragnar: "+ragnar);
		
		ragnar.meditar();
		System.out.println("Ragnar: "+ragnar);
		
		ragnar.recibieGolpeDe(loki.ataca());
		System.out.println("Ragnar: "+ragnar);

	}

}
