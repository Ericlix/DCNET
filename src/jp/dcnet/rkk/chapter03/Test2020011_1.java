package jp.dcnet.rkk.chapter03;

public class Test2020011_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// for (int i = 0 ; i < 10; i++){
		//
		// }

		// int y = 101;
		// int total =100;
		//
		// int temp = total -y;
		// if (temp > 0) {
		// if ((temp - 6) < 0) {
		// System.out.println("6 please");
		// } else if ((temp - 12) < 0) {
		// System.out.println("6 please");
		// } else if ((temp - 36) < 0) {
		// System.out.println("36 please");
		// } else if ((temp - 128) < 0) {
		// System.out.println("128 please");
		// } else if ((temp - 218) < 0) {
		// System.out.println("218 please");
		// } else {
		// System.out.println("NG");
		// }
		// } else {
		// y -= total;
		// System.out.println("you NB" + total + "Y " + y);
		// }

		int y = 0;
		int total = 100;
		if (total > 0) {
			int temp = total - y;
			System.out.println("sagaku :" + temp);
			if (temp > 0) {
				// PAY
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

				System.out.println("pay 218 :" + kosu218);
				System.out.println("pay 128 :" + kosu128);
				System.out.println("pay 36 :" + kosu36);
				System.out.println("pay 12 :" + kosu12);
				System.out.println("pay 6 :" + kosu6);

			} else {
				y -= total;
				System.out.println("you pay!" + total + " Y = " + y);
			}
		} else {
			System.out.println("senntakusitekudasia!");
		}
	}
}
