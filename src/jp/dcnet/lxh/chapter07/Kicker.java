package jp.dcnet.lxh.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 実行ブロック
		// クラスタイプ obj名称 = new コンストラクタ(引数);
//		Human human1 = new Human();
//		human1.setHumanProName("大神");
//		human1.setHumanProAge(32);
//		human1.setHumanProSex(true);
//		System.out.println(human1.humanProName);
//		System.out.println(human1.humanProAge);
//		System.out.println(human1.humanProSex);

		Human human2 = new Human("李欣翰",31,false);


		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());

		boolean jug = human2.isHumanProSex();

		if (jug) {
			// 男性出力
			System.out.println("男性");
		} else {
			// 女性出力
			System.out.println("女性");
		}





//		Human human3 = new Human("野原新之助",5,true);
//		System.out.println(human3.getHumanProName());
//		System.out.println(human3.getHumanProAge());
//		System.out.println(human3.isHumanProSex());

	}

}
