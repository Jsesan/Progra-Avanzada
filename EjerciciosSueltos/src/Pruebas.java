import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {

	@Test
	void test1() {
		Casas casa = new Casas();
		for (int i = 1; i <= 1000; i++) {
			int f = casa.casaI(i);
			if (f != -1)
				System.out.println("i=" + f + " con n=" + i);
		}

	}
	
	@Test
	void test2() {
		ClassA p0 = new ClassA();                                              
		ClassB p1 = new ClassB();                                              
		ClassC p2 = new ClassC();                                              
		ClassA p3 = new ClassB();                                              
		ClassA p4 = new ClassC(); 
		
		 p0 = p1;
		 p1 = p2;
		 p2 = p4;
		 p2 = (ClassC)p1;
		 p1 = (ClassB)p3;
		 p2 = (ClassC)p4;

	}
}
