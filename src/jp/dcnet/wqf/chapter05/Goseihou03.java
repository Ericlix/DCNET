package jp.dcnet.wqf.chapter05;

/**
 * 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める
 *
 * @author 呉青芳
 * @date 2019-08-14
 */

public class Goseihou03 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = a[0];
		int min = a[0];
		int sum = 0;
		int adv = 0;

		//最大値、最小値、和、平均値を求め
		for (int i = 0; i < a.length; i++) {
			int ii = a[i];
			// 判断最大値
			if (ii > max) {
				max = ii;
			}
			// 判断最小値
			if (ii < min) {
				min = ii;
			}
			// 配列すべての要素の和
			sum += ii;
			// 配列要素の平均値
			adv = sum / a.length;
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(adv);

	}

}
