package practise_of_class;

import java.util.Arrays;

public class ShuZu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//数組　を理解
		String s[][] = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("Good");
		s[0][1] = new String("Luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");

		for (int i = 0; i < s.length; i++) {

			System.out.println(Arrays.toString(s[i]));
		}
	}

}
