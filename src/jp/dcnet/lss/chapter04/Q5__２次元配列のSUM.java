package jp.dcnet.lss.chapter04;

public class Q5__２次元配列のSUM {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		int c = 1;
		int[][] array2d = new int[][]{
				{1,2},
				{2,3},
				{3,4},
				{4,5}
		};
		for (int[] out : array2d) {
			for (int b : out) {
				System.out.printf("%d",b);
				a += b;
				c *= b;

			}
		}
		System.out.println();
		System.out.println(a);//SUM
		System.out.println(c);//積
	}

}
