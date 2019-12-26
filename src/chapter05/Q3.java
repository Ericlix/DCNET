package chapter05;

public class Q3 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		int min = array[0];
		float sum = 0;
		float awg = 0;
		for (int x : array) {
			if (max < x) {
				max = x;
			}
			if (min > x) {
				min = x;
			}
			sum = sum + x;
			awg = sum / array.length;
		}
		System.out.println("平均" + awg);
		System.out.println("最大" + max);
		System.out.println("最小" + min);
		System.out.println("和" + sum);
	}

}
