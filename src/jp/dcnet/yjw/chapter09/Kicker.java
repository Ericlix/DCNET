package jp.dcnet.yjw.chapter09;

public class Kicker {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		//���s�u���b�N

		//�^�C�vobj
		Human human1=new Human();
		human1.setHumanProName("����");
		human1.setHumanProAge(30);
		human1.setHumanProSex(true);
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSex);

		Human human2=new Human("��",10,true);
		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());

		boolean jug=human2.isHumanProSex();

		if(jug==true){
			System.out.println("�j");
		}else{
			System.out.println("��");
		}

		//System.out.println(human2.isHumanProSex());
	}

}
