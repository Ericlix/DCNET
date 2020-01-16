package jp.dcnet.cj.chapter03;

public class TestJudge0116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1
		int a = 56;
		System.out.println("成績ランキング判断=" + a);
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		// Answer:成績ランキング判断=56 E

		// Question 2
		// 日本のコインを1円、5円、10円、100円、500円があります。3340 円のコイン数をもとめください。
		int C = 3340;
		System.out.println("3340は必要なコイン数以下表示になります");
		if (C > 500) {
			System.out.println("500円のコイン数は" + C / 500);
			C = C % 500;
			if (C > 100) {
				System.out.println("500円のコイン数は" + C / 100);
				C = C % 100;
				if (C > 10) {
					System.out.println("500円のコイン数は" + C/ 10);
					C = C % 10;
					if (C > 5) {
						System.out.println("500円のコイン数は" + C / 5);
						C = C % 5;
						if (C > 1) {
							System.out.println("500円のコイン数は" + C / 1);
						}
					}
				}
				//Answer:
				//3340は必要なコイン数以下表示になります
				//500円のコイン数は6
				//500円のコイン数は3
				//500円のコイン数は4
			}
		}
	}
}
