package jp.dcnet.lss.chapter05;
public class Q6__２次元配列の積 {
	public static void main(String[] args) {
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
				c *= b;
			}
		}
		System.out.println();
		System.out.println(c);//積
	}
}
