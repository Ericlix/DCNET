package jp.dcnet.cj.chapter02;

public class TestTextColumn0116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		// System.out.println(“this is line1\this line2“); は何行出力しますか?
		//Answer: (this is line 1	this line2)
		System.out.println("this is line1\this line2");
		
		//Question 2
		//Stringを比較方法は?	1. ==	2.equals
		//Answer: equals
		
		//Question 3
		//Float値⇒String文字列変更する場合、どうなメソッドを利用しますか
		//1. String.valueOf(“1.0F“)
		//2. 1.0F + ““
		//Answer:	String.valueOf(“1.0F“)
		
		
		//Question 4
		//以下式の値を記載してください
		//	1.0 + 2.0
		//	1.0 + “2.0“
		System.out.println(1.0 + 2.0);//Answer:		3.0
		System.out.println(1.0 + "2.0");//Answer:	1.02.0
		
		//Question	5
		//以下ステートメントの出力を記載してください。
		//public static void main(String[] ages)
		// int a = 0;
		// System.out.println("a");
		//Answer:	a
	}

}
