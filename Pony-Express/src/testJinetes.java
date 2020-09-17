import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testJinetes {

	@Test
	void jinetesUno() {
		Recorrido pp= new Recorrido(); 
		assertEquals(1, pp.jinetes(new int[] {18, 15}));
	}
	
	@Test
	void jinetesDos() {
		Recorrido pp= new Recorrido();
		assertEquals(2, pp.jinetes(new int[] {43, 23, 40, 13}));
	}
	
	@Test
	void jinetesTres() {
		Recorrido pp= new Recorrido();
		assertEquals(3, pp.jinetes(new int[] {51, 51, 51}));
	}
	
	@Test
	void jinetesCuatro() {
		Recorrido pp= new Recorrido();
		assertEquals(4, pp.jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
	}


}
