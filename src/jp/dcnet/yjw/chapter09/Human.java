package jp.dcnet.yjw.chapter09;

public class Human {
	//���O
	String humanProName="����";
	//�N��
	int humanProAge=31;
	//����
	boolean humanProSex=true;

	/*//���ʃ��\�b�h�@
	void addTax(int i){

	}*/
	//�R���X�g���N�^
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("");
	}




}
