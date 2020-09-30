import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {

	@Test
	void test() {
		Casas casa = new Casas();
		for (int i = 1; i <= 1000; i++) {
			int f = casa.casaI(i);
			if (f != -1)
				System.out.println("i=" + f + " con n=" + i);
		}

	}

}
