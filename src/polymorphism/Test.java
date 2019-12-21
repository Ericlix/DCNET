package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * polymorphism 螟壽��
 * @author chin
 *
 */
public class Test {

	public static void main(String[] args) {
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");

		Lady l1 = new Lady("guniang1", c);
		Lady l2 = new Lady("guniang2", d);

		l1.myPetEnjoy();
		l2.myPetEnjoy();

		List<String> list = new ArrayList<String>();
	}

}
