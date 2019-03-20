package comm.phucng.codesignal.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class arrays {

	public static int firstDuplicate(int[] a) {
		Set set = new HashSet();
		for (int i = 0; i < a.length; i++) {
			if (!set.add(a[i])) {
				return a[i];
			}
		}
		return -1;
	}

	public static char firstNotRepeatingCharacter(String s) {
		if (s.length() == 0) return '_';
		char[] schar = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.toCharArray()[i] == s.toCharArray()[j]) {
					schar[i] = ' ';
					schar[j] = ' ';
				}
			}
		}
		char[] resultChar = new String(schar).replaceAll("\\s+", "").toCharArray();
		if (resultChar.length <= 0) {
			return '_';
		} else {

			return resultChar[0];
		}
	}

	public static int[][] rotateImage(int[][] a) {
		int temp;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < a[0].length; j++) {
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				temp = a[i][j];
				a[i][j] = a[i][n - 1 - j];
				a[i][n - 1 - j] = temp;
			}
		}

		return a;
	}

	public static boolean sudoku2(char[][] grid) {
		if (!checkCells(grid)) return false;
		for (int i = 0; i < grid.length; i++) {
			if (!checkRow(grid[i])) {
				System.out.println("false row");
				return false;
			}
			if (!checkCol(grid, i)) {
				System.out.println("false col");
				return false;
			}
		}
		return true;
	}

	private static boolean checkCells(char[][] grid) {
		int max = grid.length;
		for (int x = 0; x < max; x += 3) {
			for (int y = 0; y < max; y += 3) {
				Set<Character> cell = new HashSet<>();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						char c = grid[x + i][y + j];
						if (c != '.') {
							if (!cell.add(c)) {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	static boolean checkCol(char[][] grid, int col) {
		Set<Character> cell = new HashSet<>();
		for (int rowN = 0; rowN < grid[0].length; rowN++) {
			if (grid[rowN][col] == '.') continue;
			if (!cell.add(grid[rowN][col])) {
				return false;
			}
		}
		return true;
	}

	static boolean checkRow(char[] row) {
		String rowS = String.valueOf(row);
		for (char c : rowS.toCharArray()) {
			if (rowS.indexOf(c) != rowS.lastIndexOf(c) && c != '.') {
				return false;
			}
		}
		return true;
	}

}
