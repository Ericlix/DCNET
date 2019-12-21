package jp.dcnet.lss.chapter03;

public class Test7__while {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		 }
		// ↑↓同じ
		int b =0;
		while (true) {
			System.out.println(b);
			if(b >= 10) {
				break; 
		}
		 b++;
		 }

	}

}
