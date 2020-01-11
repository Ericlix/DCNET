package jp.dcnet.yjw.chapter03;

public class Ranking {

	//�t���[����̎���P
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int a = 56;
		System.out.println("���у����L���O���f�B���͒l=" + a);
		// �ȉ��R�[�h���������Ă��������B
		if(a>=90) {
		 System.out.println("A");
		} else if(a<90&&a>=80) {
		 System.out.println("B");
		} else if(a<80&&a>=70) {
		 System.out.println("C");
		} else if(a<70&&a>=60) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}
	}

}
