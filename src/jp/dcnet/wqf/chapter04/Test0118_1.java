package jp.dcnet.wqf.chapter04;

public class Test0118_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array = new int[5][5];
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				if (x == y || (x + y) == (array.length - 1)) {

					System.out.println(array[x][y]);
				} else {
					System.out.print(" ");
				}

			}
		}
	}
}
