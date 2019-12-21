package jp.dcnet.lss.chapter09;

public class Cat_1 extends Animal_1 {

	private int legs;

	public Cat_1(int age, String name, String type,int legs) {
		super(age, name, type);
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}


	public static void main(String[]arg){
		Cat_1 an = new Cat_1(5,"easy","fat",4);
		System.out.println(an.getName());
		System.out.println(an.getAge());
		System.out.println(an.getType());
		System.out.println(an.getLegs());

	}




//	String color;
//	void sayHello(){
//		System.out.println("ニャー");
//	}

}
