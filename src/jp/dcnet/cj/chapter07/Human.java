package jp.dcnet.cj.chapter07;

public class Human {



//名前
	String humanProName;
//年齢
	int humanProAge;
//性別
	boolean humanProSe;

	
	
	public Human(String humanProName, int humanProAge, boolean humanProSe) {
		this.humanProName = humanProName;
		this.humanProAge = humanProAge;
		this.humanProSe = humanProSe;
	}
	Human(){

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
	public boolean isHumanProSe() {
		return humanProSe;
	}
	public void setHumanProSe(boolean humanProSe) {
		this.humanProSe = humanProSe;
	}
}

