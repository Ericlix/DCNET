package jp.dcnet.lxh.chapter07;

public class Human {

	// ���O
	String humanProName;
	// �N��
	int humanProAge;
	// ����
	boolean humanProSex;

	 Human(String humanProName,
		   int humanProAge,
		   boolean humanProSex) {
		this.humanProName = humanProName;
		this.humanProAge = humanProAge;
		this.humanProSex = humanProSex;
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
	public boolean isHumanProSex() {
		return humanProSex;
	}
	public void setHumanProSex(boolean humanProSex) {
		this.humanProSex = humanProSex;
	}




	// ���ʃ��\�b�h�@�߂�l�^�C�v�̎w��@�����̎w��
//	void addTex(int i){
//
//	}

}
