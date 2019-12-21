package jp.dcnet.lss.chapter05;

public class Q2__階乗 {//n! =(n-1)*(n-2)...*2*1

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a =1;
		for (int n = 5; n > 0; n--) {
			System.out.println(n);
			a *= n;
		}
		System.out.println(a);
	}

}
