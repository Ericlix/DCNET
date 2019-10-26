package jp.dcnet.yjw.chapter09;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//実行ブロック

		//タイプobj
		Human human1=new Human();
		human1.setHumanProName("李花");
		human1.setHumanProAge(30);
		human1.setHumanProSex(true);
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSex);

		Human human2=new Human("林",10,true);
		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());

		boolean jug=human2.isHumanProSex();

		if(jug==true){
			System.out.println("男");
		}else{
			System.out.println("女");
		}

		//System.out.println(human2.isHumanProSex());
	}

}
