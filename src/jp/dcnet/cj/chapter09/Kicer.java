package jp.dcnet.cj.chapter09;

public class Kicer {
	static int total = 2000;

	Kicer() {
		Kicer.sell();

	}

	static void sell() {
		total--;
		System.out.println("チッケト１枚を売りました" + "余ったチッケト数：" + total);
	}

	public static void main(String[] ags) {

		int people = 1000;
		for (int i = 0; i < people; i++) {
			new Kicer();

			if (Kicer.total == 0) {
				System.out.println("チッケトが売り切れった");
				System.out.println("残念人数：" + (people - (i + 1)));
				break;
			}
		}
	}
}
