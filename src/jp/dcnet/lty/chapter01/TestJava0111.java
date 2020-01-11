package jp.dcnet.lty.chapter01;

public class TestJava0111 {
	public static void main(String[] args) {
		int i = 10;
		int n = i % 5;
		System.out.println(n);

		int a = 100;
		a = a > 10 ? 11 : 0;
		if (a > 10) {
			a = 11;
		} else {
			a = 0;
		}
		System.out.println(a);

		int b = 10 / 5;
		if (b == 0) {
		}

		String Str1 = new String("ABC");
		String Str2 = new String("ABC");
		if (Str1 == Str2) {
			System.out.println(Str1 = Str2);
		} else {
			System.out.println(Str1 != Str2);
		}
		boolean flg1;
		flg1 = true;
		flg1 = false;
		Boolean flg2;
		flg2 = true;
		flg2 = false;
		flg2 = null;
		// System.out.println(flg2.toString());
		System.out.println(String.valueOf(flg2));
	}

}
