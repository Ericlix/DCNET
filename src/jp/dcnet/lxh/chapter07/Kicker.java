package jp.dcnet.lxh.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		// ���s�u���b�N
		// �N���X�^�C�v obj���� = new �R���X�g���N�^(����);
//		Human human1 = new Human();
//		human1.setHumanProName("��_");
//		human1.setHumanProAge(32);
//		human1.setHumanProSex(true);
//		System.out.println(human1.humanProName);
//		System.out.println(human1.humanProAge);
//		System.out.println(human1.humanProSex);

		Human human2 = new Human("���ӊ�",31,false);


		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());

		boolean jug = human2.isHumanProSex();

		if (jug) {
			// �j���o��
			System.out.println("�j��");
		} else {
			// �����o��
			System.out.println("����");
		}





//		Human human3 = new Human("�쌴�V�V��",5,true);
//		System.out.println(human3.getHumanProName());
//		System.out.println(human3.getHumanProAge());
//		System.out.println(human3.isHumanProSex());

	}

}
