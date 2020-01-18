package jp.dcnet.yjw.chapter0118;

public class Constract {

	//blue ->全局変量　クラスメンバー
	Constract ct0=new Constract();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//pink ->局部変量　メソッド変数
		Constract ct=new Constract();
		ct.noneMethod();
	}

	void noneMethod(){
		System.out.println("Hello!");
	}

	void noneMethod2(){
		System.out.println("Kitty!");
	}

}
