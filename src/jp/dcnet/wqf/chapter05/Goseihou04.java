package jp.dcnet.wqf.chapter05;

/**
 * 配列の重複ある要素を探す
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou04 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, 1, 2 };
		int[] a = new int[array.length];
		int z = 0;
//		配列の重複ある要素を探す
		for (int i = 0; i < array.length; i++) {
			// 重複判断
			for (int y = 0; y < a.length; y++) {

				if (array[i] == array[z]) {

					break;
				}
			}
			// イコールの場合
			if (array[i] == array[z]) {
				// aの配列イコールarrayの配列の元素
				for (int j = 0; j < array.length; j++) {
					// 判断i！＝ｊ、i とｊの長さ
					if (i != j && array[i] == array[j]) {
						// System.out.println(array[i]);
						a[z] = array[i];
						z++;
						// 抜け
						break;
					}

				}
			}

		}
		for (int s : a) {
			System.out.println(s);
		}

	}
}
