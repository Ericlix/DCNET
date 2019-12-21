package jp.dcnet.lss.chapter03;

public class Q2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 3340;
		int b = 500;
		int c = 100;
		int d = 10;
		int e = 5;
		int f = 1;
		System.out.println(a +"円のコイン数は");
		System.out.println(a/b +"枚" +b+"円");
		System.out.println(a%b/c +"枚" +c+"円");
		System.out.println(a%b%c/d +"枚" +d+"円");
		System.out.println(a%b%c%d/e +"枚" +e+"円");
		System.out.println(a%b%c%d%e/f +"枚" +f+"円");

	}

}
