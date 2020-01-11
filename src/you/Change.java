package you;

import java.util.Arrays;

public class Change {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = { { 1, 2 }, { 4, 6 } };

		int[][] b = { { 3, 5 }, { 6, 9 } };

		int[][] c = abc(a, b);
		
		for (int i = 0; i < c.length; i++) {

			System.out.println(Arrays.toString(c[i]));
		}
	}

	public static int[][] abc(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				//System.out.println(c[a][b]);
			}

		}

		return c;
	}

}
