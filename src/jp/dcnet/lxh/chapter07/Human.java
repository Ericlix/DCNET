package jp.dcnet.lxh.chapter07;

public class Human {

	// ���O
	private  String humanProName;
	// �N��
	private  int humanProAge;
	// ����
	private  boolean humanProSex;

	// �l�̑���
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





	// ���ʃ��\�b�h�@�߂�l�^�C�v�̎w��@�����̎w��
//	void addTex(int i){
//
//	}

}
