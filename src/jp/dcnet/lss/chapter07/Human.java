package jp.dcnet.lss.chapter07;

public class Human {

	//名前
	String humanProName;

	//年齢
	int humanProAge;

	//性別
	boolean humanProSex;

	//コンストラクタ:1.メソッド　＝クラス名2戻り値タイプの指定不要

	Human(String humanProName, int humanProAge, boolean humanProSex) {
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

	//普通メソッド　戻り値タイプの指定　　引数の指定
//	void addTex(int i){
//
//	}
	//コンストラクタ
	Human(){

	}



//	public static void main(String[] args) {
//
//
//
//
//
//	}

}
