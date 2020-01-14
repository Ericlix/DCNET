package jp.dcnet.lty.chapter05;

public class TestJava0114 {
	public static void main(String[] args) {
		// ê›ñ‚ÇP
		int temp = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				temp = temp + i;
			}
		}
		System.out.println(temp);

		// ê›ñ‚2
		int temp1 = 1;
		for (int i = 1; i <= 5; i++) {
			temp1 = temp1 * i;
		}
		System.out.println(temp1);

		// ê›ñ‚3
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max=" + max);
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				max = array[i];
			}
		}
		System.out.println("min=" + min);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("sum=" + sum);
		int ave = sum / array.length;
		System.out.print("ave=" + ave);
		System.out.println("\n");

		// ê›ñ‚4
		int[] a = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + ",");
				}
			}
		}
		System.out.println("\n");

		// ê›ñ‚5
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 7) {
				System.out.print(i);
			}

		}
		System.out.println("\n");
		// ê›ñ‚6
		int[][] array1 = new int[][] { { 1, 2, 3 }, { 3, 4, 5 } };
		int[][] array2 = new int[][] { { 5, 6, 7 }, { 7, 8, 9 } };
		int[][] mul = new int[array1.length][array1[0].length];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				mul[i][j] = array1[i][j] * array2[i][j];
				System.out.print(mul[i][j] + ",");
			}
		}
		System.out.println("\n");

		// ê›ñ‚7
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int b = 0;
				if (a[i] < a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + ",");
		}
		System.out.println("\n");

		// ê›ñ‚8
		int[][] array3 = new int[10][10];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					array3[i][j] = 1;
				} else {
					array3[i][j] = array3[i - 1][j] + array3[i - 1][j - 1];
				}
				System.out.print(array3[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
