package jp.dcnet.lss.chapter08;



public class Test {

	public static void main(String[] args, Object Lady) {

		cat c = new cat("catname","blue");
		cat d = new cat("dogname","black");

		Lady a = new Lady("g1", c);
		Lady b = new Lady("g2", d);

		a.myPetEnjoy();
		b.myPetEnjoy();

	}

}
