package jp.dcnet.lxh.chapter07;

public class Human {

	// 名前
	private  String humanProName;
	// 年齢
	private  int humanProAge;
	// 性別
	private  boolean humanProSex;

	// 人の総数
	static int count = 0;

	 public Human(String humanProName,
		   int humanProAge,
		   boolean humanProSex) {
		this.humanProName = humanProName;
		this.humanProAge = humanProAge;
		this.humanProSex = humanProSex;
		count++;
	}

	 Human(){

	 }



	public String getHumanProName() {
		return humanProName;
	}

	public int getHumanProAge() {
		return humanProAge;
	}

	public boolean isHumanProSex() {
		return humanProSex;
	}





	// 普通メソッド　戻り値タイプの指定　引数の指定
//	void addTex(int i){
//
//	}

}
