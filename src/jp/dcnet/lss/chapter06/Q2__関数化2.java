package jp.dcnet.lss.chapter06;

public class Q2__関数化2 {
	public static void Test(int[][]A,int[][]B,int[][]C){
		for(int m = 0;m < A.length;m++){
			for(int n = 0;n < B.length;n++){
				for(int i = 0;i< 2;i++)
					C [m][n] += A[m][i]* B[i][n] ;
				System.out.println(C [m][n]);//矩阵的积
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = new int[][]{
				{1,3},
				{2,2},
		};
		int[][] b = new int[][]{
				{3,2},
				{1,3}
		};
		int[][] c = new int[2][2];
		Test(a,b,c);
	}

}
