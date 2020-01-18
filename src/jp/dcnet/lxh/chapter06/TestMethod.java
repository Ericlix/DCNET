package jp.dcnet.lxh.chapter06;

public class TestMethod {
	// 全局変量 クラスメンバー(属性)
	String catFName = "Hello";
	String catLName = "Kitty";
	// 生死区分 true:生  false:死
	boolean live = true;


	public String changeCatName(String newFName, String newLName){
		catFName = newFName;
		catLName = newLName;
		return catFName +"　"+ catLName;
	}
	public String changeCatName(String newName){
		return newName;
	}
	public String changeCatName(){
		return "";
	}





	boolean getLive(){
		return live;
	}

	void fly(){
		live = false;
	}






}
