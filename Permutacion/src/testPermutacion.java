import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPermutacion {

	@Test
	void test1() {
		
		Permutacion p = new Permutacion();
		int vector[]= {1,3,0,4,2};
		assertEquals(true ,p.esPermutacion(vector));
	}
	
	@Test
	void test2() {
		
		Permutacion p = new Permutacion();
		int vector[]= {1,1,0,4,2};
		assertEquals(false ,p.esPermutacion(vector));
	}
	
	@Test
	void test3() {
		
		Permutacion p = new Permutacion();
		int vector[]= {1,3,0,8,2};
		assertEquals(false ,p.esPermutacion(vector));
	}
	
	@Test
	void test4() {
		
		Permutacion p = new Permutacion();
		int vector[]= {0,1,2,3,4};
		assertEquals(false ,p.esPermutacion(vector));
	}


}
