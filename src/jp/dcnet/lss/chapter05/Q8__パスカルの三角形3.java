package jp.dcnet.lss.chapter05;

import java.util.Scanner;

public class Q8__パスカルの三角形3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("パスカルの三角形のLV数：");
		int Nmax = input.nextInt() ;
		int [][] C = new int [Nmax +1][];
		for (int n = 0; n <= Nmax; n++)
			C[n] = new int[n + 1];
		for (int n = 0; n < C.length; n++)
			for (int k = 0; k <= n; k++) {
				int a = 1;
				for (int i = 1; i <= k; i++)
					a = a * (n - i + 1) / i;
				C[n][k] = a;
			}
			for (int[] R : C) {
				for (int O : R)
					System.out.printf("%4d", O);
					System.out.println();
				}
			input.close();
	}

}
