package jp.dcnet.yjw.chapter0118;

public class TestMethod {

	void add(){

	}

	int add(int a,String b){
		return a+Integer.valueOf(b);
	}

	String catName="HelloKitty!";
	boolean live=true;

	String catFName;
	String catLName;

	boolean getLive(){
		return live;
	}

	void fly(){
		live=false;
	}

	void changeCatName0(){
		catName="HelloMicky!";
		System.out.println(catName);
	}

	void changeCatName1(String newCatName){
		catName=newCatName;
		System.out.println(newCatName);
	}

	String changeCatName2(String newFName,String newLName){
		catFName=newFName;
		catLName=newLName;
		return catFName+" "+catLName;
	}

	/*public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestMethod tm=new TestMethod();
		System.out.println(tm.catName);
		tm.changeCatName1("SB!");
	}*/

	int dg(int n){
		//System.out.println(n);
		if(n==0){
			return 1;
		}else{
			return dg(n-1);
		}
	}

}
