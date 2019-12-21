package jp.dcnet.lxh.chapter08;

public class Cat {


//	public static class NaibuCat implements Run{
//
//		@Override
//		public void run() {
//			// TODO 自動生成されたメソッド・スタブ
//			System.out.println("内部クラスで実現");
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
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("匿名 Cat is running");
			}

		};




		run.run();


		Run run2 = () -> {
			System.out.println(" ラムダ でCat is running");
		};

		run2.run();


	}

}