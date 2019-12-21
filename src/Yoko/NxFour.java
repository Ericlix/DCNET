package Yoko;

public class NxFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
