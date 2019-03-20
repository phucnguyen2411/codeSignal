package comm.phucng.codesignal;

import comm.phucng.codesignal.DataStructures.arrays;

public class Main {

	public static void main(String[] args) {
		// write your code here

		//firstDuplicate
		int[] a = {1, 1, 2, 2, 1};
		//first array
		System.out.println(arrays.firstDuplicate(a));
		//not repeating
		String s = "abacabaabacaba";
		System.out.println(arrays.firstNotRepeatingCharacter(s));
		// sudoku
		char[][] grid = {{8, '.', '.', '.', '.', '.', '.', '.', '.'},
				{'.', '.', 3, 6, '.', '.', '.', '.', '.'},
				{'.', 7, '.', '.', 9, '.', 2, '.', '.'},
				{'.', 5, '.', '.', '.', 7, '.', '.', '.'},
				{'.', '.', '.', '.', 4, 5, 7, '.', '.'},
				{'.', '.', '.', 1, '.', '.', '.', 3, '.'},
				{'.', '.', 1, '.', '.', '.', '.', 6, 8},
				{'.', '.', 8, 5, '.', '.', '.', 1, '.'},
				{'.', 9, '.', '.', '.', '.', 4, '.', '.'}};
		System.out.println(arrays.sudoku2(grid));
	}
}
