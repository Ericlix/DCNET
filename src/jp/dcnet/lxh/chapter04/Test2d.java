package jp.dcnet.lxh.chapter04;

import java.util.Arrays;

public class Test2d {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

String str ;//NULL

String str2 = "1234567890";// ブランク　空文字　BLANK 空白
String strHSpace = "　 1 2 3     　あいうえお　ｱｲｳｴｵ ";// 半角スペース
String strZSpace = "　";// 全角スペース

System.out.println(strHSpace.trim());
if (strHSpace.trim().equals(str2)){
	System.out.println("正しい");
}
String adress = "鉄木真・たわまいてぃ,男,2020東京都墨田1区　3-2-1　301室";

System.out.println(adress.substring(0,11));
System.out.println(adress.substring(12));




String[] strArr = adress.split(",");
System.out.println(Arrays.toString(strArr));


		int[][] arr2D = new int[1][1];

		for (int i = 0; i < arr2D.length + 5; i++) {
			if (i < arr2D.length) {
				for (int j = 0; j < arr2D[i].length; j++) {
					if (i == j || (i + j) == (arr2D.length - 1) ||
							(i == ((int)arr2D.length/2)) ||
							(j == ((int)arr2D.length/2))) {
						System.out.print(arr2D[i][j]);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
