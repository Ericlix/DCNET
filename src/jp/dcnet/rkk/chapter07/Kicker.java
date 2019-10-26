package jp.dcnet.rkk.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//実行ブロック

		//クラスタイプobj
		Human human1 = new Human();
		human1.setHumanProName("最高");
		human1.setHumanProAge(26);
		human1.setHumanProSex(true);
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSex);


		Human human2 = new Human("呂",31,true);
		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());

		if (human2.isHumanProSex()) {
			// 男性出力
			System.out.println("男性");
		} else {
			// 女性出力
			System.out.println("女性");
		}


		Human human3 = new Human("死神",22,true);
		System.out.println(human3.getHumanProName());
		System.out.println(human3.getHumanProAge());
		System.out.println(human3.isHumanProSex());

	}

}
