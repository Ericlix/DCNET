package jp.dcnet.yjw.chapter05;

public class OuShuHe {

	//�V�ĂW��̐ݖ�1
	//1����100�܂ł̋����̘a�����߂�
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int sum = 0;
		// 1~100�̋����̘a�����߂�

		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				 // ���������f�����
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
