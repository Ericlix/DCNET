package practise_of_class;

public class Pet {
	static int count = 0;

	private String type;
	private String name;
	private String sex;
	private int age;
	Pet(){

	}
	public Pet(String type, String name, String sex, int age) {
		this.type = type;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getSex() {

		return sex;
	}
	public int getAge() {
		return age;
	}






}
