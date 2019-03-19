package comm.phucng.codesignal.DataStructures;

public class arrays {

	public static int firstDuplicate(int[] a) {
		if (a.length <= 1) return -1;
		for (int i = 0; i < a.length; i++) {
			int pos = Math.abs(a[i]) - 1;
			if (a[pos] < 0) return pos + 1;
			else a[pos] = -a[pos];
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

}
