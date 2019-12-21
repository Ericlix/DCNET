package jp.dcnet.lss.chapter08;


public class cat extends animal {
	private String eyeColor;
	private String pet;

	public cat(String n, String pet) {
		super(n);
		this.pet = pet;
	}

	public void myPetEnjoy(){
	}

	public void hello(){
		System.out.println("ニャー");
	}

}
