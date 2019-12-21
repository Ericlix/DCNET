package jp.dcnet.lss.chapter05;
import java.util.Scanner;
public class Q8__パスカルの三角形2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("パスカルの三角形のLV数：");
		int Nmax = input.nextInt() ;
		int[][] C = new int[Nmax +1][];
		for (int n = 0; n <= Nmax; n++)
			C[n] = new int[n+1];
		for (int n = 0; n < C.length; n++)
			for (int k = 0; k <= n; k++) {
				if( k == 0 || n == k){
					C[n][k] = 1;
				}else if(n >= 2 && k >= 1 ){
					C[n][k] = C[n-1][k-1] + C[n-1][k];
				}
			}
		for (int[] R : C) {
			for (int O : R)
				System.out.printf("%4d", O);
			System.out.println();
		}
		input.close();
	}

}
