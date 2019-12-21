package jp.dcnet.lss.chapter03;

public class Test9_1continue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i); 
				}
			}
			// continueの使⽤する場合↓
		for(int y = 0; y < 10; y++) {
			if(y % 2 != 0) {
				continue; 
			}
			System.out.println(y); 
		}

	}

}
