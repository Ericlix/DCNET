package jp.dcnet.yh.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		Human human1 = new Human();
//		human1.setHumanProName("大神");
//		human1.setHumanProAge(32);
//		human1.setHumanProSex(true);
//		System.out.println(human1.humanProName);
//		System.out.println(human1.humanProAge);
//		System.out.println(human1.humanProSex);




		Human human2 = new Human("李",31,true);
		System.out.println(human2.humanProName);
		System.out.println(human2.humanProAge);
//		System.out.println(human2.humanProSex);
		if(human2.isHumanProSex()) {
			System.out.println("男");
		}else{
				System.out.println("女");




			}




	}

}
