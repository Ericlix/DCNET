package jp.dcnet.yjw.chapter03;

public class Ranking {

	//フロー制御の質問１
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
		 System.out.println("A");
		} else if(a<90&&a>=80) {
		 System.out.println("B");
		} else if(a<80&&a>=70) {
		 System.out.println("C");
		} else if(a<70&&a>=60) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}
	}

}
