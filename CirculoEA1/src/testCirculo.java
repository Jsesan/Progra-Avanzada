import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCirculo {

	@Test
	void test1() {
		try {
		Circulo c= new Circulo(0);
		}catch(Exception e) {
			assertEquals("Radio no valido", e.getMessage());
		}
	}
	
	@Test
	void test2() {
		Circulo c= null;
		try {
		 c= new Circulo(1);
		}catch(Exception e) {
			assertEquals(1 ,c.getRadio());
		}
	}

}
