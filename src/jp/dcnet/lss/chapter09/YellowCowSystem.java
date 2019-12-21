package jp.dcnet.lss.chapter09;



public class YellowCowSystem {

	static int total = 200;

	YellowCowSystem(){
		YellowCowSystem.sell();
	}

	static void sell(){
		total--;
		System.out.println("チケット一枚を売りました" + "残すチケット：" + total);

	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int People = 20;

		for(int i = 0;i<People;i++ ){
			new YellowCowSystem();
			if(total == 0){
				System.out.println("チケットが売り切れ");
				System.out.println("残念人数："+(People-i-1));
				break;
			}
		}




	}

}
