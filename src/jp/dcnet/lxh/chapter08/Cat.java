package jp.dcnet.lxh.chapter08;

public class Cat {


//	public static class NaibuCat implements Run{
//
//		@Override
//		public void run() {
//			// TODO �����������ꂽ���\�b�h�E�X�^�u
//			System.out.println("�����N���X�Ŏ���");
//		}
//
//	}



	public static void main(String[] args) {


//		NaibuCat naibuCat = new NaibuCat();
//		naibuCat.run();

		Animail an = new Animail();
		an.sum();

		Run run = new Run() {

			@Override
			public void run() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				System.out.println("���� Cat is running");
			}

		};




		run.run();


		Run run2 = () -> {
			System.out.println(" �����_ ��Cat is running");
		};

		run2.run();


	}

}