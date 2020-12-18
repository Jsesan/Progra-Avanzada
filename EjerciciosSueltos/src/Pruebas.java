import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class Pruebas {

	
	@Test
	void test2() {
		int x;
		int i=0;
		do {
			i++;
			x = (int) (Math.random()*10);
			System.out.println("cant veces"+i);
		}while(x!=10);
		
		
	}
}
