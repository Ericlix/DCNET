package jp.dcnet.wqf.chapter05;

/**
 * 2つ配列の違う位置の和
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] x = new int[][] { { 1, 2 }, { 3, 4 } };
		int[][] y = new int[][] { { 5, 6 }, { 7, 8 } };


		int[][] sum = new int[2][2];
		int[][] chen = new int[2][2];
		// 2つ配列の違う位置の和を求める
		for (int i = 0; i < x[0].length; i++) {
			for (int j = 0; j < x.length; j++) {
//				 二つ配列の違う位置の和を出力する
//				sum[i][j] = x[i][j] + y[i][j];
//				System.out.println(sum[i][j]);
				chen[i][j]=x[i][j]*y[i][j];
				System.out.println(chen[i][j]);
			}
		}
	}

}
