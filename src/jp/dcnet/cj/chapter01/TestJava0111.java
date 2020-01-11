package jp.dcnet.cj.chapter01;

public class TestJava0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int n = i % 5;
		// 0
		System.out.print(n);

		int a = 0;
		a = a > 10 ? 11 : 0;
		if (a > 10) {
			a = 11;
		} else {
			a = 0;
		}
		System.out.print(a);

		int a3 = 100 / 5;
		if (a3 == 0) {
		}
		
		
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		if (str1 == str2) {
			System.out.print(str1 = str2);
		} else {
			System.out.print(str1 != str2);
		}
		
		
		if("".equals(str1)) {
			//文字规范
		}
		
		boolean flg1;
		flg1  = true;
		flg1 = false;
		Boolean flg2;
		flg2 = true;
		flg2 = false;
		flg2 = null;
		
		

	}
}
