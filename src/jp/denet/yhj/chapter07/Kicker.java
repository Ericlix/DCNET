package jp.denet.yhj.chapter07;

public class Kicker {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		//���s�u���b�N

		//�^�C�vobj���� = new �R���X�g���N�^(����)
		Human human1 = new Human();
		human1.setHumanProName("�d���N");
		human1.setHumanProAge(26);
		human1.setHumanProSex(true);
		System.out.println(human1.humanProName);
		System.out.println(human1.humanProAge);
		System.out.println(human1.humanProSex);


		Human human2 = new Human("�d���N",26, true);
		System.out.println(human2.getHumanProName());
		System.out.println(human2.getHumanProAge());
		System.out.println(human2.isHumanProSex());


		if(human2.isHumanProSex()){
			System.out.println("���ʂ́F�j��");
		}else{
			System.out.println("���ʂ́F����");
		}

//		Human human3 = new Human("���苿��",26, true);
//		System.out.println(human3.getHumanProName());
//		System.out.println(human3.getHumanProAge());
//		System.out.println(human3.isHumanProSex());
//
//		Human human4 = new Human("�_�l",26, true);
//		System.out.println(human4.getHumanProName());
//		System.out.println(human4.getHumanProAge());
//		System.out.println(human4.isHumanProSex());
	}

}
