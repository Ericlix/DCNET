package jp.dcnet.lss.chapter09;

public class Cat extends Animal{

	@Override
	void sayHello() {
		System.out.println("ニャー");

	}

	public Cat(String name) {
		super(name);
	}


}
