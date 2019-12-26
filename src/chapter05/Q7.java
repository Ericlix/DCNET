package chapter05;

import java.util.Arrays;

public class Q7 {
	public static void main(String[] args) {
		int[] array = new int[] { 6, 2, 4, 5, 3, 4, 1 };
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					a = array[j];
					array[j] = array[j + 1];
					array[j + 1] = a;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}
}
