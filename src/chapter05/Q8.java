package chapter05;

public class Q8 {
	public static void main(String[] args) {
		int[][] yh = new int[5][];

		for (int i = 0; i < yh.length; i++) {
			yh[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (i == 0 || j == 0 || i == j) {
					yh[i][j] = 1;
				} else {
					//
					yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
				}
				System.out.print(yh[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
