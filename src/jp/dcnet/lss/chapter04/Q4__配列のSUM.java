package jp.dcnet.lss.chapter04;

public class Q4__配列のSUM {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		for(int x : array) {			
			a += x;
			System.out.println(x);
		}
		System.out.println(a);
	}

}
