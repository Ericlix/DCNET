package jp.dcnet.lty.chapter04;

public class TestJava0114 {
	public static void main(String[] args) {
		// –â‘è‚P
		int[] array = new int[4];
		for (int a : array) {
			System.out.println(a);
		}

		// –â‘è2
		int[] array1 = new int[] { 5, 6 };
		for (int b : array1) {
			System.out.println(b);
		}

		// –â‘è3
		int[][] array2 = new int[2][3];
		for (int[] c : array2) {
			for (int d : c) {
				System.out.println(d);
			}
		}

		// –â‘è5
		int[] array3 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int temp = array3[0];
		int temp1 = array3[0];
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] > temp) {
				temp = array3[i];
			}
		}
		System.out.println(temp);
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] < temp1) {
				temp1 = array3[i];
			}
		}
		System.out.println(temp1);

		// –â‘è6
		int sum = 0;
		for (int s : array3) {
			sum = sum + s;
		}
		System.out.println(sum);

		// –â‘è7
		int[][] array4 = new int[][] { { 2, 3, 4 }, { 5, 6, 7 } };
		int[][] array5 = new int[][] { { 8, 9, 10 }, { 11, 12, 13 } };
		int[][] add = new int[array4.length][array4[0].length];
		int[][] mul = new int[array4.length][array4[0].length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add[i].length; j++) {
				add[i][j] = array4[i][j] + array5[i][j];
				mul[i][j] = array4[i][j] * array5[i][j];

			}
		}
		for (int[] out : add) {
			for (int temp3 : out) {
				System.out.print(temp3 + ",");
			}
		}
		System.out.print("\n");
		for (int[] out : mul) {
			for (int temp2 : out) {
				System.out.print(temp2 + ",");
			}
		}

	}
}
