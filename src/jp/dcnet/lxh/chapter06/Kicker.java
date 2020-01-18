package jp.dcnet.lxh.chapter06;

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

	int add(int[] args) {
		int sum = 0;
		for (int a : args) {
			sum += a;
		}
		return sum;
	}

	int fact(int n) {
		System.out.println(n);
		if (n == 0) {
			return 1; /* 脱出条件。0! は 1 である */
		} else {
			return fact(n - 1); /* n! は (n-1)! に n を乗じたもの。再帰呼出し */
		}
	}

	// 共通的　静態的　

	// 無戻り値　
	// 関数名（main）
	// 引数　タイプ：String Array 引数名：args ○
	public static void main(String[] args) {

		String abc = "abc";
		System.out.println(abc);
		int i = 100;
		System.out.println(i);
		boolean flg = true;
		System.out.println(flg);



		Kicker obj = new Kicker();
		obj.fact(10);

//		String a = "1";
//		int b = 2;

		int[] ar2r = {};

		int[] arr = {1, 2, 3, 5, 5, 0, 5, 3, 4, 2, 1, 2, 23, 2,
				2, 2, 2, 2, 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};

		System.out.println(obj.add(arr));

		//
		// TestMethod obj = new TestMethod();
		//
		// String newName = obj.changeCatName("铁木真","达瓦JU");
		// System.out.println(newName);

		// HelloKitty の 飛行モード
		// obj.fly();
		//
		// if (obj.getLive()) {
		// System.out.println("Cat's name is "+obj.catName);
		// } else {
		// System.out.println("Cat is deaded");
		// }

	}

}
