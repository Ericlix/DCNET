package jp.dcnet.wqf.chapter05;

/**
 * 5の階乗を求める(for)
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou02 {

	public static void main(String[] args) {

		int v = 1;
		// 5の階乗
		for (int a = 1; a <= 5; a++) {
			// 1*2*3*4*5
			v *= a;

		}
		System.out.println(v);

	}

}
