package jp.dcnet.wqf.chapter01;

public class JavaTest0111 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i =10;
		int n = i%5;
		System.out.println(n);


		int a = 100;
		a = a>10?11:0;
		if(a>10){
			a=11;
		}else{
			a=0;
		}
		System.out.println(a);

		System.out.println("this is line1\tthis line2");

		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1==str2){
			System.out.println("str1=str2");
		}else{
			System.out.println("str1!=str2");//new 対象地址不同

		}
		if("".equals(str1)){
			System.out.println("代码规范");
		}

		boolean fag1;
		fag1=true;
		fag1=false;
		Boolean fag2 ;
		fag2=true;
		fag2=false;
		fag2=null;
		//System.out.println(fag2.toString());NullPointerException
		System.out.println(String.valueOf(fag2));

	}

}
