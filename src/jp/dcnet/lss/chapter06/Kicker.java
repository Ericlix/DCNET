package jp.dcnet.lss.chapter06;

public class Kicker {
	//共通的
	//static
	//無戻り値
	//関数名：main
	//引数　タイプ：String配列
	//名：args

	public static void main(String[] args) {
		//メソッドメンバー
		TestMethod obj = new TestMethod();
//		obj.fly();

		obj.changeCatName("Tom","tiemuzhen");

		System.out.println(obj.add(1,2,3,4,5));



//		if (obj.getLive()) {
//			System.out.println("Cat name is " + obj.catName);
//		} else {
//			System.out.println("Cat is deaded");
//
//		}





	}

}
