package jp.dcnet.lxh.chapter01;

public class TestJava0111 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// int i = 10;
		// int n = i % 5;
		//
		// System.out.println(n);
		//
		// int a = 100;
		// a = a > 10 ? 11 : 0;
		//
		// if (a > 10) {
		// a = 11;
		// } else {
		// a = 0;
		// }
		//
		// System.out.println(a);
		//
		//
		//
		//
		// int a3= 100/5;
		//
		// if (a3 == 0) {
		//
		// }

		String str1 = "ABC";
		String str2 = "ABC";
		if (str1 == str2) {
			System.out.println("str1 = str2");
		} else {
			System.out.println("str1 != str2");
		}

		if ("".equals(str1)) {

		}



		boolean flg1;
		flg1 = true;
		flg1 = false;


		//flg1 = null;
		Boolean flg2;
		flg2 = true;
//		flg2 = false;
		flg2 = null;
//System.out.println(flg2.toString());
System.out.println(String.valueOf(flg2));



	}

}
