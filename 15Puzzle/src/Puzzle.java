
public class Puzzle {
	public boolean solvable2(int m[][]) {
		int l = m.length, n, p, i, z, q, o;
		n = p = i = 0;
		
		for (; i < l * l; i++) {
			if ((o = m[i / l][i % l]) < 1)
				p = i / l;
			
			for (z = i; z < l * l; z++) {
				q = m[z / l][z % l];
				
				if (q > 0 && o > q)
					n++;
			}
		}
		
		boolean h = l % 2 < 1, r = n % 2 < 1;
		
		return !h && r || h && (p % 2 < 1) != r;
	}
	
	public static void main(String[] args) {

		int[][] mat1 = { { 1, 2, 3 }, { 6, 5, 4 }, { 8, 0, 7 }, };

		int[][] mat2 = { { 1, 8, 2 }, { 0, 3, 4 }, { 7, 6, 5 }, };

		int[][] mat3 = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, };

		Puzzle puzzle = new Puzzle();
		

		System.out.println();
		System.out.println(puzzle.solvable2(mat1));
		System.out.println();
		System.out.println(puzzle.solvable2(mat2));
		System.out.println();
		System.out.println(puzzle.solvable2(mat3));

	}
}
