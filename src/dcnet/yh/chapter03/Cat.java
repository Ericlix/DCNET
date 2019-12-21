package dcnet.yh.chapter03;

public class Cat extends Animal {

	private int legs;

	public Cat(int age, String name, String kind, int legs) {
		super(age, name, kind);
		// TODO 自動生成されたコンストラクター・スタブ
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs() {

	}

}
