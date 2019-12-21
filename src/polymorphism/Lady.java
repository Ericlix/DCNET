package polymorphism;

public class Lady {

	private String name;
	private Animal pet;

	public Lady(String name, Animal pet){
		this.name = name;
		this.pet = pet;
	}

	public void myPetEnjoy(){
		pet.enjoy();
	}
}
