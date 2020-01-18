package jp.dcnet.lss.chapter04;

import java.util.Arrays;

public class Test0118_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] C = new int[7][5];
		for (int i = 0; i < C.length+5; i++) {
			if (i<C.length) {
				for (int j = 0; j < C[i].length; j++) {
					System.out.print(C[i][j]);
				}
			} else {
				System.out.print("   1   ");
			}
			System.out.println();

			}
		String a = "1234567890";
		String b = "";
		String H = " ";
		String Z = "　";
		System.out.println(H.trim());
		if(H.trim().equals(b)){
			System.out.println("正しい");

		}
		String adress = "2020東京都川崎　1区　3-2-1　302";
		String adress2 = "A,32,2020東京都川崎,1区,3-2-1,302";
		System.out.println(a.substring(0,5));
		System.out.println(adress.substring(0,5));
		System.out.println(adress.substring(5));
		String[] strArr = adress.split("　");
		System.out.println(Arrays.toString(strArr));
		String[] strArr2 = adress2.split(",");
		System.out.println(Arrays.toString(strArr2));



	}

}
