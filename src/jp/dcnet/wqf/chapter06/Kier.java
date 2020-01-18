package jp.dcnet.wqf.chapter06;

public class Kier {

	int add(int a ,int b){
		return a+b;
	}
	int add(int a,String b){
		return a+Integer.valueOf(b);
	}
	int add(String a ,int b){
		return Integer.valueOf(a)+b;
	}
	int add(int[]args){
		int sum =0;
		for(int a:args){
			sum+=a;
		}
		return sum;
	}
	int fact(int n){
		System.out.println(n);
		if(n==0){
			return 1;
		}else{
			return fact(n-1);
		}

	}

	/*
	 * 共通 静態 無戻り値 関数名（main） 引数 タイプ:String 配列 名:args
	 */

	public static void main(String[] args) {
		// // TODO 自動生成されたメソッド・スタブ
		Method k = new Method();
		k.fly();

		k.changeCatName("JU","KIKU");

		String name =k.changeNa("KK", "KIKU");
				System.out.println(name);
//		if(k.getLive()){
//			System.out.println("cat's name is"+" "+k.catName);
//		}else{
//			System.out.println(" cat is dead");
//		}



		// }
		// void noneMethod(){
		// System.out.println("KIKU");
				Kier ki = new Kier();
				int a =1;
				int b = 2;
				String a1 ="11";
				String  b1 ="3";
				int [] aaaa= {1,2,3,4,5,6,7,8};
				System.out.println(ki.add(a, b1));
				System.out.println(ki.add(a,b));
				System.out.println(ki.add(a1, b));
				//System.out.println(ki.add(1,2,3,4,5,6,7,8));
				System.out.println(ki.add(aaaa));
				System.out.println(ki.fact(10));

	}

}
