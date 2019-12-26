package chapter05;

public class Q4 {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					a++;
				}
			}
			if (a == 1) {
				System.out.println(array[i]);
				a = 0;

			}
		}
	}
}
