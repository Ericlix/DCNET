package jp.dcnet.lxh.chapter07;


public class Kicker {


	private  String word = "abc";
	 public  void print(String name) {
	 System.out.println(name);
	 }



	public static void main(String[] args) {

		Kicker kickerObj = new Kicker();
		kickerObj.print("dcnet.java.����");
		 System.out.println(kickerObj.word);


//
//		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		// ���s�u���b�N
//		// �N���X�^�C�v obj���� = new �R���X�g���N�^(����);
//		// Human human1 = new Human();
//		// human1.setHumanProName("��_");
//		// human1.setHumanProAge(32);
//		// human1.setHumanProSex(true);
//		// System.out.println(human1.humanProName);
//		// System.out.println(human1.humanProAge);
//		// System.out.println(human1.humanProSex);
//
//		// Human human2 = new Human("���ӊ�",31,false);
//		//
//		//
//		// System.out.println(human2.getHumanProName());
//		// System.out.println(human2.getHumanProAge());
//		//
//		// boolean jug = human2.isHumanProSex();
//		//
//		// if (jug) {
//		// // �j���o��
//		// System.out.println("�j��");
//		// } else {
//		// // �����o��
//		// System.out.println("����");
//		// }
//		String humanProName1 = "ABC";
//		String humanProName2 = "ABC";
//
//		Human human3 = new Human(humanProName1, 5, true);
//		System.out.println(human3.getHumanProName());
//		System.out.println(Human.count);
//		Human human3333 = new Human(humanProName1, 5, true);
//		Human human3223 = new Human(humanProName1, 5, true);
//
//		Human human3344= new Human(humanProName1, 5, true);
//
//		Human human33344 = new Human(humanProName1, 5, true);
//
//
//
//		Human human4 = new Human();
//		System.out.println(Human.count);
//
//
////		System.out.println(human3.humanProName == human4.humanProName);
//
//		System.out.println(human3 == human4);
//
//
//
////		String str1 = new String("ABC");
//
////
////		System.out.println(str1);
////		System.out.println(str2);
////
////		System.out.println(str11 == str2);
////		System.out.println(str1 == str2);
////
////		System.out.println(str2.equals(str1));
//
//
//
//
//		// System.out.println(human3.getHumanProAge());
//		// System.out.println(human3.isHumanProSex());

	}

}
