package jp.dcnet.cj.chapter05;

public class TestQuestion_Three {
	
	//質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 6, 7, 9, 2, 1 };
		int a, b, c;
		a = b = array[0];
		c = 0;
		for (int x = 0; a < array.length; a++) {
			if (array[x] > a) {
				a = array[x];
			}
			if (array[x] < b) {
				b = array[x];
			}
		}
		for (int y : array) {
			c += y;
		}
		System.out.println("最大值是" + a);
		System.out.println("最小值是" + b);
		System.out.println("平均值是" + c / array.length);
	}
}