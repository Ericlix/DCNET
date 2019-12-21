package jp.dcnet.lss.chapter05;

public class Q6__次元配列のSUM {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = new int[][]{
				{1,2},
				{2,2},
		};
		int[][] b = new int[][]{
				{3,2},
				{1,3}
		};
		int[][] c = new int[2][2];
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j< b.length;j++){
				c [i][j]= a[i][j]+ b[i][j];
				System.out.printf("%d",c [i][j]);//		矩阵的和
			}
		}

	}

}
