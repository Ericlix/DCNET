package jp.dcnet.yh.chapter07;

public class Human {
	//名前
				String humanProName ;
	//年齢
				int humanProAge;
	//性別
				boolean humanProSex ;

				Human(){

				}





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




}
