package jp.dcnet.lss.chapter01;

public class Test3 {
	//論理演算子
	public static void main(String[] args) {
		// 変数 代⼊ 初期値
		int a = 10;
		int b = 20;
		if (a < b || b == a) {
			System.out.println(1);
		// true ? false ?
		}
		if (a < b && b == a) {
			System.out.println(2);
		// true ? false ?
		}
		if (!(a > b)) {
			System.out.println(3);
		// ここに到着できますか
		}
	}

}
