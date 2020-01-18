package jp.dcnet.lss.chapter06;

public class TestMethod {
	//クラスメンバー
	String catFName = "Hello";
	String catLName = "Kitty";

	boolean live = true;

	void changeCatName(String newFName,String newLName){
		catFName = newFName;
		catLName = newLName;
		System.out.println(catFName +"・ " + newLName);

	}
	boolean getLive(){
		return live;
	}
	void fly(){
		live = false;

	}
	int add(String a,String b){
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	int add(int...args){
		int sum =0;
		for(int a : args){
			sum+=a;
		}
		return sum;

	}








}
