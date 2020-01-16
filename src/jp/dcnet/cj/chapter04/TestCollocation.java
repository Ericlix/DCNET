package jp.dcnet.cj.chapter04;

public class TestCollocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1
		// int[] array = new int[4]; 各要素の値を記載してください。
		int[] array = new int[4];
		System.out.println(array);
		// Answer: 0

		// Question 2
		// int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		int[] a = new int[] { 5, 6 };
		for (int x : a) {
			System.out.println(x);
			// Answer: 5 6

			// Question 3
			// int[][] array = new int[2][3]; 各要素の値を記載してください。
			int[][] b = new int[2][3];
			for (int[] c : b) {
				for (int cc : c) {
					System.out.println(cc);
					// Answer: 0

					// Question 4
					// 以下2重Foreachを理解してください。
					int[][] array2d = new int[4][2];
					for (int[] out : array2d) {
						for (int inner : out) {
							System.out.println(inner);
							// Answer: 0
						}
					}
					// Question 5
					// int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を
					// System.out.println()。
					int[] arr = new int[] { 1, 3, 5, 7, 100, 0, 1 };
					int d, e;
					d = e = arr[0];
					for (int k = 0; d < arr.length; d++) {
						if (arr[k] > d) {
							d = arr[k];
						}
						if (arr[k] < e) {
							e = arr[x];
						}
					}
					System.out.println("最大值是" + d);//Answer : 100
					System.out.println("最小值是" + e);//Answer : 1
				}
				//Question 6
				int []ar = new int[4];
				int sum = 0;
				for(int dd : ar) {
					sum += dd;
				}
				System.out.println(sum);//Answer: 0
			}
			//Question 7
			//行列(2次元配列)の和と積を計算してください。
			int[][] y = new int[][] { { 1, 2, 10 }, { 3, 4, 5 } };
			int sum = 0;
			int xx = 1;
			for (int ab = 0; ab < y.length; ab++) {
				for (int xb = 0; x < y[ab].length; x++) {
					sum = sum + y[ab][xb];
					xx = xx * y[ab][xb];
				}
			}
			System.out.print(sum);//Answer:和の結果：25
			System.out.println("");
			System.out.println(xx);//Answer:積の結果：1200
		}
	}
}
