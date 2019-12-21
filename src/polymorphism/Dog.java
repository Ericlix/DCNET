package polymorphism;

public class Dog extends Animal{
	private String furColor;

	public Dog(String n, String c){
		super(n);
		this.furColor = c;
	}

	public void enjoy(){
		System.out.println("Gou Jiaosheng........");
	}
}
