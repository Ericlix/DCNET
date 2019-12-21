package Yoko;

public class NxEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] yoko = new int[10][10];
		for (int i = 0; i < yoko.length; i++) {
			yoko[i] = new int[i + 1];
			for (int x = 0; x <= i; x++) {
				if (x == 0 || i == x) {
					yoko[i][x] = 1;
				} else {
					yoko[i][x] = yoko[i - 1][x] + yoko[i - 1][x - 1];
				}
				System.out.println(yoko[i][x]);
			}
			System.out.println();
		}
	}
}
