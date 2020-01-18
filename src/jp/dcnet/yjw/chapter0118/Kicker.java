package jp.dcnet.yjw.chapter0118;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestMethod tm0=new TestMethod();
		tm0.fly();

		if(tm0.live){
			System.out.println("This cat is "+tm0.catName);
		}else{
			System.out.println("This cat has gone!");
		}

		TestMethod tmadd=new TestMethod();
		System.out.println(tmadd.add(1,"1"));

		TestMethod tmdg=new TestMethod();
		System.out.println("The result is "+tmdg.dg(5));
	}

}
