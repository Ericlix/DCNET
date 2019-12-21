package jp.dcnet.cj.chapter09;

public class Animal {// モデル型Class
	int Age;
	String Name;
	String Ccation;

	public Animal(String name) {

		this.Name = name;

	}

	public Animal() {
	}

	void sayHello() {
		System.out.println("Are you pig ?");
	}

	public  void setName(String name) {
		this.Name = name;
	}
	public String getName() {

		return Name;
	}
}
