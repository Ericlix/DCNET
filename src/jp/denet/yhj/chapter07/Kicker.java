package jp.denet.yhj.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//実行ブロック

		//タイプobj名称 = new コンストラクタ(引数)
		Human human1 = new Human();
		human1.setHumanProName("妖怪君");
		human1.setHumanProAge(26);
		human1.setHumanProSex(true);
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSex);


		Human human2 = new Human("妖怪君",26, true);
		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());
		System.out.println(human2.isHumanProSex());


		if(human2.isHumanProSex()){
			System.out.println("性別は：男性");
		}else{
			System.out.println("性別は：女性");
		}

//		Human human3 = new Human("黒崎響き",26, true);
//		System.out.println(human3.getHumanProName());
//		System.out.println(human3.getHumanProAge());
//		System.out.println(human3.isHumanProSex());
//
//		Human human4 = new Human("神様",26, true);
//		System.out.println(human4.getHumanProName());
//		System.out.println(human4.getHumanProAge());
//		System.out.println(human4.isHumanProSex());
	}

}
