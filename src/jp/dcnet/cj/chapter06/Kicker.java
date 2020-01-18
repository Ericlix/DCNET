package jp.dcnet.cj.chapter06;

public class Kicker {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, String b) {
		return a + Integer.valueOf(b);
	}

	int add(String a, int b) {
		return Integer.valueOf(a) + b;
	}

	int add(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}

	// 可变长
	int add(int... args) {
		int sum = 0;
		for (int a : args) {
			sum += a;
		}
		return sum;
	}

	int fact(int n) {
		System.out.println(n);
		if (n == 0) {
			return 1;
		} else {
			return fact(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod0118 s = new TestMethod0118();
		Kicker ss = new Kicker();
		ss.fact(10);

		int a = 1;
		String b = "2";
		System.out.println(ss.add(a, b));

		String name = s.changeCatName("铁木真 ・", "小橘提");
		System.out.println(name);

		// 飞行モデール
		s.fly();

		if (s.getLive()) {
			System.out.println("Cat name is" + s.catName);
		} else {
			System.out.println("die");
		}
		System.out.println(s.catName);
	}

}
