package chapter05;

public class Q1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 0; a <= 100; a += 2) {
			sum = sum + a;
		}
		System.out.println(sum);
	}
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int a = 1; a <= 100; a += 2) {
//			sum = sum + a;
//		}
//		System.out.println(sum);
//	}
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int a = 1; a <= 100; a++)
//			if (a % 2 == 1) {
//				sum = sum + a;
//			}
//		System.out.println(sum);
//	}
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int a = 1; a <= 100; a++)
//			if (a % 2 == 0) {
//				sum = sum + a;
//			}
//		System.out.println(sum);
//	}
}
