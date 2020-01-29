package jp.dcnet.wqf.chapter05;

/**
 * 1から100までの偶数の和を求める(for + if)
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou {

	public static void main(String[] args) {

		int sum = 0;

		// 1から100までの偶数の和
		for (int i = 1; i <= 100; i++) {
			// 偶数を判断
			if (i % 2 == 0) {
				// 1~100の偶数の和
				sum += i;
			}
		}

		System.out.println(sum);

	}

}
