package jp.dcnet.lss.chapter04;

public class Test3__foreach {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[] {5 ,6, 7, 8};
		for(int x : array) {
			System.out.println(x); // 配列の要素を出⼒する
		}
	//	↑↓同様
		for(int i = 0; i < array.length; i++) {
			int x = array[i];
			System.out.println(x); // 配列の要素を出⼒する
		}

	}

}
