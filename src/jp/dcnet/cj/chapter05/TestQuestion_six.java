package jp.dcnet.cj.chapter05;

public class TestQuestion_six {
	
	//質問6:任意行列(2次元配列)の積を求める。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int c = 1;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				c = c * a[x][y];
			}
		}
		System.out.println("2次元配列の積" + c);
	}
}