package chapter05;

public class Q5 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int a = 0; a < array.length; a++) {
			if (array[a] == 7) {
				System.out.println("指数" + a);

			}
		}
	}
}
