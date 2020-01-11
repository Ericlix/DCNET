package jp.dcnet.yjw.chapter03;

public class coins {

	//�t���[����̎���Q
	public static void main(String[] args) {
		int x=3348;

		if(x >= 500){
			System.out.println("500 yuan needs:"+x / 500);
			x = x % 500;
			if(x >= 100){
				System.out.println("100 yuan needs:"+x / 100);
				x = x % 100;
				if(x >= 10){
					System.out.println("10 yuan needs:"+x / 10);
					x = x % 10;
					if(x >= 5){
						System.out.println("5 yuan needs:"+x / 5);
						x = x % 5;
						if(x >= 1){
							System.out.println("1 yuan needs:"+x / 1);
							x = x / 1;
						}
					}
				}
			}
		}

		//System.out.println(x);


	}
}
