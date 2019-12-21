package Yoko;

public class NxTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 5; x++) {
			int a = 1;
			for (int y = 1; y <= x; y++) {
				a *= y;
			}
			System.out.println(a);
		}
	}
}
