package jp.dcnet.lxh.chapter09;

public class YellowCowSystem {

	 int total = 200;// �`�P�b�g�̑���

	YellowCowSystem() {
		sell();
	}

	 void sell() {
		total--;
		System.out.println("�`�P�b�g1���𔄂�܂����I" + "�c���`�P�b�g�F" + total);
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int people = 100;
		for (int i = 0; i < people; i++) {
			// �`�P�b�g����܂�
			YellowCowSystem obj = new YellowCowSystem();
			// ���f����؂�̎��_
			if (obj.total == 0) {
				System.out.println("�`�P�b�g������؂�");
				System.out.println("�c�O�l���F" + (people - (i + 1)));
				break;
			}
		}

	}

}
