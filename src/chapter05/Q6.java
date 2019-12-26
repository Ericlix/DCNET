package chapter05;

public class Q6 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, }, { 4, 5, } };
		int[][] b = { { 7, 8, }, { 10, 11, } };

		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.println(c[i][j] + "\t");
			}
		}
	}
}
