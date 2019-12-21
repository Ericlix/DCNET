package jp.dcnet.lxh.chapter09;

public class Oop09Kicer {


	public Oop09Kicer(){
		count++;
	}


	Oop09Kicer(String a){
		this.a = Integer.valueOf(a);

		count++;
	}



	Oop09Kicer(int a,String b){
		int abc = a * Integer.valueOf(b);
		this.a = abc;
		count++;
	}



	Oop09Kicer(int a){
		this.a = a;
		count++;
	}





	 int a = 10;
	 static int count = 200;

	public static void main(String[] args) {


		System.out.println("count:"+Oop09Kicer.count);// 0

		Oop09Kicer obj1 = new  Oop09Kicer();
		System.out.println("a:"+obj1.a);// 10
		System.out.println("count:"+Oop09Kicer.count);// 0
		obj1.a = 15;
		obj1.count = 1;
		System.out.println("a:"+obj1.a);// 15
		System.out.println("count:"+Oop09Kicer.count);// 1

		Oop09Kicer obj2 = new  Oop09Kicer();
		System.out.println("a:"+obj2.a);// 10
		System.out.println("count:"+Oop09Kicer.count);// 1

		Oop09Kicer obj3 = new  Oop09Kicer();
		System.out.println("a:"+obj3.a);// 10
		System.out.println("count:"+Oop09Kicer.count);// 1


		// TODO 自動生成されたメソッド・スタブ
//
//		Oop09Kicer cls1 = new Oop09Kicer();
//		System.err.println(cls1.a);//10
//
//		Oop09Kicer cls2 = new Oop09Kicer(100);
//		System.err.println(cls2.a);//1 ⇒ X 1 10
//
//		Oop09Kicer cls3 = new Oop09Kicer("2");
//		System.err.println(cls3.a);//2
//
//		Oop09Kicer cls4 = new Oop09Kicer(1,"2");//10
//		System.err.println(cls4.a);

//		Oop09Kicer cls5 = new Oop09Kicer("1","2");




	}

}
