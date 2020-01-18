package jp.dcnet.yjw.chapter0118;

public class Substring {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String address="2020東京都千代田区　3-2-1　301室";

		System.out.println(address.substring(0,11));
		System.out.println(address.substring(12));

		String[] strArr=address.split("");
		System.out.println(address.split(""));
	}

}
