package jp.dcnet.lss.chapter09;

public class Animal {
	public int age;
	public String name;
	public String type;

	public Animal(String name){

		this.name = name;
	}

	void sayHello(){
		System.out.println("Hello");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[]arg){
		Animal an = new Animal("にゃん");
		System.out.println(an.getName());
		an.sayHello();

	}
}
