package jp.dcnet.lss.chapter05;//矩阵的积
//1、当矩阵A的列数等于矩阵B的行数时，A与B可以相乘。
//2、矩阵C的行数等于矩阵A的行数，C的列数等于B的列数。
//3、乘积C的第m行第n列的元素等于矩阵A的第m行的元素与矩阵B的第n列对应元素乘积之和。
public class Q6__次元配列の積み1 {
	public static void main(String[] args) {
		int[][] a = new int[][]{
				{1,2},
				{2,2},
		};
		int[][] b = new int[][]{
				{3,2},
				{1,3}
		};
		int[][] C= new int[2][2];
		for(int m = 0;m < a.length;m++){
			for(int n = 0;n < b.length;n++){
				for(int i = 0;i< 2;i++)
				C [m][n] += a[m][i]* b[i][n] ;
				System.out.println(C[m][n]);//		矩阵的积
			}
		}
	}
}
