package jp.dcnet.wqf.chapter06;

public class Method {
	/*
	 * 共通 静態
	 * 無戻り値
	 * 関数名（main）
	 * 引数 タイプ:String  配列
	 *  		名:args ○　可以重载
	 *
	 *
	 *
	 */
	//全局变量 クラスメンバー
	//Method k2 = new Method();
	 String str = "123";
	 String catFName ="Hello";
	 String catLName ="kitty";
	 boolean live = true;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//局部变量　メソッド変数
//		Method k1 = new Method();
//		k1.noneMethod();
//		k1.noneMethod2();

	}
	 void noneMethod(){
		 //ローカル変数
		 String str2 = "abc";
		System.out.println("KIKU"+str2);

	}
	  void noneMethod2(){
		    str="321";
			System.out.println("HELLO"+str);
		}
	  void changeCatName(String newFName,String newLName){
		  	catFName= newFName;
		  	catLName = newLName;
			System.out.println("HELLO"+catFName+catLName);
		}
	  boolean getLive(){


		  return live;
	  }
	  void fly(){
		  live=false;

	  }

	  String changeNa(String newFName,String newLName){
			catFName= newFName;
		  	catLName = newLName;
		  	return catFName+"・"+catLName;
	  }
	  String changeNa(String newFName){
			catFName= newFName;

		  	return newFName;
	  }


}
