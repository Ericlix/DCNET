package jp.dcnet.yjw.chapter05;

public class OuShuHe {

	//新米８問の設問1
	//1から100までの偶数の和を求める
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		// 1~100の偶数の和を求める

		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				 // 偶数が判断される
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
