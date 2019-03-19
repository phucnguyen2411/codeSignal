package comm.phucng.codesignal;

import comm.phucng.codesignal.DataStructures.arrays;

public class Main {

	public static void main(String[] args) {
		// write your code here

		//firstDuplicate
		int[] a = {2, 1, 3, 5, 3, 2};
		String s = "abacabaabacaba";
		System.out.println(arrays.firstDuplicate(a));
		System.out.println(arrays.firstNotRepeatingCharacter(s));
	}
}
