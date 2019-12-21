package polymorphism;

public class Cat extends Animal{
	private String eyeColor;

	public Cat(String n, String c){
		super(n);
		this.eyeColor = c;
	}
	@Override
	public void enjoy(){
		System.out.println("Mao Jiaosheng........");
	}
}
