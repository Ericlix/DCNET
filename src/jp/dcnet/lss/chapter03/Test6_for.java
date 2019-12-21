package jp.dcnet.lss.chapter03;

public class Test6_for {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int a = 0; a < 10; a++) {
			System.out.println(a); 
		}
			// ↑↓同じ
		int b = 0;
		for (; b < 10;) {
			System.out.println(b);
			 b++;
		}
			// ↑↓同じ
		int c = 0;
		for (;;) {
			System.out.println(c);
			if (c >= 10) {
			break; 
			}
			 c++; 
		 }

	}

}
