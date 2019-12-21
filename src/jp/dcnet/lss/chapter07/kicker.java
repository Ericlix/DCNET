package jp.dcnet.lss.chapter07;

public class kicker {

	public static void main(String[] args) {
		//実行プロック

		//タイプ　obj名称　＝new　コンストラクタ(引数)
		Human human1 = new Human();
		human1.setHumanProName("a");
		human1.setHumanProAge(31);
		human1.setHumanProSex(true);
		System.out.print(human1.humanProName);
		System.out.print(human1.humanProAge);
		System.out.println(human1.humanProSex);

		Human human2 = new Human("b",31,true);
		System.out.print(human2.getHumanProName());
		System.out.print(human2.getHumanProAge());
		if(human2.isHumanProSex()){
			System.out.println("男性");
		}else{
		System.out.println("女性");
		}




	}

}
