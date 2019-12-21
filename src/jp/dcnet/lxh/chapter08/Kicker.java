package jp.dcnet.lxh.chapter08;

public class Kicker {


	static void say (Parent pt) {
		System.out.println("aaaaaaaa");
	}


	static void jump (Child pt) {
		System.out.println("bbbbbbbbbb");
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Cat cat = new Cat();





		Child chd = new Child();
		chd.hello();
		chd.cry();

		String givename = chd.getGivenName();
		Wanju wanju = chd.getWanju();


		Parent oet = new Parent();
		oet.hello();


		say(chd);

		Object str = new String("DCNET");
		 String value1 = (String)str;
		 String value2 = String.class.cast(value1);


		 Object i = new Integer("1");
		 Integer excep = (Integer)i; // エラー：変数strの実型はStringである。



	}

}
