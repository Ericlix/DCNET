package jp.dcnet.lty.chapter03;

public class TestJava0113 {
	public static void main(String[] args) {
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if (a > 90) {
			System.out.println("A");
		} else if (a > 80 && a < 90) {
			System.out.println("B");
		} else if (a > 70 && a < 80) {
			System.out.println("C");
		} else if (a > 60 && a < 70) {
			System.out.println("D");
		} else if (a < 60) {
			System.out.println("E");

		}

		int temp = 3340;
		if (temp > 0) {
			int kosu500 = 0;
			int kosu100 = 0;
			int kosu10 = 0;
			int kosu5 = 0;
			int kosu1 = 0;
			for (;;) {
				if (temp == 0) {
					break;
				}
				if (temp >= 500) {
					kosu500 = (int) temp / 500;
					temp = temp % 500;
				} else if (temp >= 100) {
					kosu100 = (int) temp / 100;
					temp = temp % 100;
				} else if (temp >= 10) {
					kosu10 = (int) temp / 10;
					temp = temp % 10;
				} else if (temp >= 5) {
					kosu5 = (int) temp / 5;
					temp = temp % 5;
				} else if (temp >= 1) {
					kosu1 = (int) temp / 1;
					temp = temp % 1;
				} else {

					break;
				}
			}
			System.out.println("kosu500:" + kosu500);
			System.out.println("kosu100:" + kosu100);
			System.out.println("kosu10:" + kosu10);
			System.out.println("kosu5:" + kosu5);
			System.out.println("kosu1:" + kosu1);

		}
	}

}
