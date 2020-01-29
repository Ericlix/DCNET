package jp.dcnet.wqf.chapter05;

/**
 * 配列に値「７」のインデックスを求む
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou05 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		// 配列に値「７」のインデックスを求む
		for (int i = 0; i < array.length; i++) {
			// 判断値イコール７の場合
			if (array[i] == 7) {
				System.out.println(i);
			}
		}
	}

}
