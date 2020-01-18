package jp.dcnet.cj.chapter04;

import java.util.Arrays;

public class TestQM0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "123456789"; // ブランク　空文字　BLANK
		String str1 = " ";// 半角スペース
		String str2 = " ";//全角スペース
		System.out.println(str1.trim());
		if(str1.trim().equals(str)) {  //去空格的
			System.out.println("正しい");
		}
		String adress ="2020東京都墨田区 3-2-1";
		System.out.println(adress.substring(0,11));// 截取字符串
		System.out.println(adress.substring(12));
		
		adress.split(" ");
		System.out.println(Arrays.toString(adress.split(" ")));
		
		
		int[][] aaa = new int[5][5];
		for (int x = 0; x < aaa.length + 5; x++) {
			if (x < aaa.length) { // 自增长变量
				for (int y = 0; y < aaa[x].length; y++) {
					if (x == y || (x + y) == (aaa.length - 1) ||
							(x == ((int)aaa.length/2)) || 
							(y == ((int)aaa.length/2))) {
						System.out.print(aaa[x][y]);
					} else {
						System.out.print("  ");
					}
				}
			} else {
				System.out.println(" ¥ ");
			}
			System.out.println();
		}
	}
}
