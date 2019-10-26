package jp.dcnet.yjw.chapter09;

public class Human {
	//名前
	String humanProName="李王";
	//年齢
	int humanProAge=31;
	//性別
	boolean humanProSex=true;

	/*//普通メソッド　
	void addTax(int i){

	}*/
	//コンストラクタ
	Human(){

	}
	//

	public Human(String humanProName, int humanProAge, boolean humanProSex) {
		super();
		this.humanProName = humanProName;
		this.humanProAge = humanProAge;
		this.humanProSex = humanProSex;
	}

	public String getHumanProName() {
		return humanProName;
	}
	public void setHumanProName(String humanProName) {
		this.humanProName = humanProName;
	}

	public int getHumanProAge() {
		return humanProAge;
	}

	public void setHumanProAge(int humanProAge) {
		this.humanProAge = humanProAge;
	}

	public boolean isHumanProSex() {
		return humanProSex;
	}

	public void setHumanProSex(boolean humanProSex) {
		this.humanProSex = humanProSex;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("");
	}




}
