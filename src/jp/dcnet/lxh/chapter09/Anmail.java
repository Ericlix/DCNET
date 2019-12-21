package jp.dcnet.lxh.chapter09;

public class Anmail {

	int age ;
	String name;
	String type;// CAT DOG DUCK



	public Anmail(String name) {
		this.name = name;
	}

	void sayHello() {
		System.out.println("HELLO");
	}


	public String getName() {
		return name;
	}


}
