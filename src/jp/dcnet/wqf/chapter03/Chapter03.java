package jp.dcnet.wqf.chapter03;

public class Chapter03 {
	public static void main(String[] args) {
		/*
		 * 質問１︓成績ランキング判断を作成する 「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓ D, 60以下︓E」
		 */
		int i = 88;
		if (i > 90) {
			System.out.println("A");
		} else if (i > 80) {
			System.out.println("B");
		} else if (i > 70) {
			System.out.println("C");
		} else if (i > 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

		int a = 0;
		if (a > 0 && a < 10) {
			a++;
		} else {
			a--;
		}
		System.out.println(a);

		int y = 0;
		int total = 0;
		if (total > 0) {
			int temp = total - y;
			if (temp > 0) {
				int kosu218 = 0;
				int kosu128 = 0;
				int kosu36 = 0;
				int kosu12 = 0;
				int kosu6 = 0;

				for (;;) {
					if (temp == 0) {
						break;
					}
					if (temp >= 218) {
						kosu218 = (int) temp / 218;
						temp = temp % 218;
					} else if (temp >= 128) {
						kosu128 = (int) temp / 128;
						temp = temp % 128;
					} else if (temp >= 36) {
						kosu36 = (int) temp / 36;
						temp = temp % 36;
					} else if (temp >= 12) {
						kosu12 = (int) temp / 12;
						temp = temp % 12;
					} else if (temp >= 6) {
						kosu6 = (int) temp / 6;
						temp = temp % 6;
					} else {
						kosu6++;
						break;
					}

				}
				System.out.println("pay218 :" + kosu218 + "回");
				System.out.println("pay128 :" + kosu128 + "回");
				System.out.println("pay36 :" + kosu36 + "回");
				System.out.println("pay12 :" + kosu12 + "回");
				System.out.println("pay6 :" + kosu6 + "回");

			} else {
				y -= total;
				System.out.println("支払い成功" + total + "y=" + y);

			}
		} else {
			System.out.println("選択してください");
		}

		// 最優先pay
		//
		// if ((temp - 6) < 0) {
		// System.out.println("6ください");
		// } else if ((temp - 12) < 0) {
		// System.out.println("12ください");
		// } else if ((temp - 36) < 0) {
		// System.out.println("36ください");
		// } else if ((temp - 128) < 0) {
		// System.out.println("128ください");
		// } else if ((temp - 218) < 0) {
		// System.out.println("218ください");
		// } else {
		// System.out.println("m(...)m NG");
		// }
		//
		// }
		//


	}

}
