package jp.dcnet.cj.chapter06;

public class TestMethod0118 {
	// 全局变量クラスメンバー
	// TestMethod0118 a = new TestMethod0118();
	String str = "abc";
	String catName = "Hellokitty";
	String catLName = "小黄狗";
	boolean live = true;

	// 如果去掉public（修饰子）的话，受到保护，同包下可视。
	// 共通的 静态的 无返回值 函数名：（main）引数 タイプString 名：args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 局部变量メソットメンバー
		TestMethod0118 a = new TestMethod0118();
		a.noneMethod();
		a.noneMethod2();
	}

	void noneMethod() {
		// ローカル変数
		String str = "avbn";
		System.out.println("HELLO" + str);
	}

	void noneMethod2() {
		str = "YYY";
		System.out.println("HELLO" + str);
	}

	String changeCatName(String newName, String newLName) {
		catName = newName;
		catLName = newLName;
		return catName + "   " + catLName;
	}
	String changeCatName(String newName) {
		return newName;
	}
	String changeCatName() {
		return("");
	}

	boolean getLive() {

		return live;
	}

	void fly() {
		System.out.println("小橘猫摔死了");
	}
}
