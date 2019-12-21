package jp.dcnet.lss.chapter05;

public class Q1__偶数の和 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				a += i;
				}
		}
		System.out.println(a);

	}

}
