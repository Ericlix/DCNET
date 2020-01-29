package jp.dcnet.wqf.chapter05;

/**
 * 任意⾏列（２次元配列）の積を求める
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou06 {

	public static void main(String[] args) {

		int array[][] = new int[3][];
		array[0] = new int[] { 2, 2, 2 };
		array[1] = new int[] { 2, 2, 2 };
		array[2] = new int[] { 2, 2, 2 };

		int sum1 = 0;
		int chen = 1;
		int adve = 0;
		// 2重配列の和、積、平均値を求める
		for (int[] l1 : array) {
			for (int l2 : l1) {

				// 2次元配列のすべて要素の和
				sum1 += l2;
				// 2次元配列のすべて要素の積
				chen *= l2;
				// 2次元配列のすべて要素の平均値
				adve = sum1 / array.length;

			}

		}

		System.out.println(sum1);
		System.out.println(chen);
		System.out.println(adve);
	}

}
