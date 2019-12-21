package jp.dcnet.lxh.chapter09;

public class YellowCowSystem {

	 int total = 200;// チケットの総数

	YellowCowSystem() {
		sell();
	}

	 void sell() {
		total--;
		System.out.println("チケット1枚を売りました！" + "残すチケット：" + total);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int people = 100;
		for (int i = 0; i < people; i++) {
			// チケット売ります
			YellowCowSystem obj = new YellowCowSystem();
			// 判断売り切れの時点
			if (obj.total == 0) {
				System.out.println("チケットが売り切れ");
				System.out.println("残念人数：" + (people - (i + 1)));
				break;
			}
		}

	}

}
