package jp.dcnet.lss.chapter07;



public class Q01{

	public static void main(String[] args) {
		Pet cat = new Pet();
		Pet dog = new Pet();
		cat.age = 2;
		dog.age = 5;
		cat.name = "cat";
		System.out.print(cat.name);
		System.out.println(cat.age +"歳");
		dog.name = "dog";
		System.out.print(dog.name);
		System.out.println(dog.age +"歳");

	}

}
