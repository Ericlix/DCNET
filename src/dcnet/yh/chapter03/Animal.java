package dcnet.yh.chapter03;

public class Animal {
	private int age;
	private String name;
	private String kind;


//1122
	public Animal(int age, String name, String kind) {
		this.age = age;
		this.kind = kind;
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public String getKind() {
		return kind;
	}


}
