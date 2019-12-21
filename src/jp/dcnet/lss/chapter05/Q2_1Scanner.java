package jp.dcnet.lss.chapter05;

import java.util.Scanner;

public class Q2_1Scanner {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要的阶乘数：");
		long a =1;
		for (int n = scanner.nextInt() ; n > 0; n--) {
			a *= n;
		}
		System.out.println(a);
		scanner.close();

	}

}
