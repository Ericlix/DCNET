package jp.dcnet.cj.chapter05;

public class TestQuestion_one {
	
	//設問1:1から100までの偶数の和を求める(for + if)。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}