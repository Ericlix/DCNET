package jp.dcnet.cj.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human human1 = new Human();
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSe);


		Human human2 = new Human("chen",44,true);


		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());
		System.out.println(human2.isHumanProSe());

		if(human2.isHumanProSe()){
			System.out.println("男性");
		}else{
				System.out.println("女性");
		}


		Human human3 = new Human("野原新之助",9,true);
		System.out.println(human3.getHumanProName());
		System.out.println(human3.getHumanProAge());
		System.out.println(human3.isHumanProSe());


	}

}
