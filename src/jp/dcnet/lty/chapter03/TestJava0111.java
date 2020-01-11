package jp.dcnet.lty.chapter03;

public class TestJava0111 {
	public static void main(String[] args) {
		int a = 0;
		if (a > 0) {
			a++;
		} else {
			a--;
		}
		System.out.println(a);

		int y = 20;
		int total = 100;
		if (total > 0) {
			int temp = total - y;
			System.out.println("sagaku:" + temp);
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
				System.out.println("pay218:" + kosu218);
				System.out.println("pay128:" + kosu128);
				System.out.println("pay36:" + kosu36);
				System.out.println("pay12:" + kosu12);
				System.out.println("pay6:" + kosu6);

			} else {
				y -= total;
				System.out.println("you pay:" + total+"," + "Y:" + y);

			}
		} else {
			System.out.println("senntakusitekudasia!");
		}
	}
}
