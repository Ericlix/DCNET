package jp.dcnet.cj.chapter03;

public class TestIF0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 0;
//		if (a > 0 && a < 10) {
//			a++;
//		} else {
//			a--;
//		}
//
//		System.out.println(a);

		int y = 10;
		int total =100;
		if(total > 0){
		int temp = total - y;
		System.out.println("差額" + temp);
		if (temp > 0) {
			int kosu218 = 0;
			int kosu128 = 0;
			int kosu36 = 0;
			int kosu12 = 0;
			int kosu6 = 0;

			for (;;) {
				if(temp==0){
					break;
				}
				if (temp >= 218) {
					kosu218 = (int) temp / 218;
					temp = temp % 218;
				} else if (temp >= 128) {
					kosu128 = (int) temp / 128;
					temp = temp % 128;
				} else if (temp >= 36) {
					kosu36 = (int) temp / 36;
					temp = temp % 36;
				} else if (temp >=12) {
					kosu12 = (int) temp / 12;
					temp = temp % 12;
				} else if (temp >= 6) {
					kosu6 = (int) temp / 6;
					temp = temp % 6;
				} else {
					kosu6++;
					break;
				}

			}
			System.out.println("pay218 :" + kosu218+"回");
			System.out.println("pay128 :" + kosu128+"回");
			System.out.println("pay36 :" + kosu36+"回");
			System.out.println("pay12 :" + kosu12+"回");
			System.out.println("pay6 :" + kosu6+"回");

		} else {
			y -= total;
			System.out.println("支払い成功" + total + "y=" + y);

		}
		}else{
			System.out.println("選択してください");
		}
	}
}

		

		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		if (temp > 0) {
//			if ((temp - 6) < 0) {
//				System.out.println("$6$ PLEASE");
//			} else if ((temp - 12) < 0) {
//				System.out.println("$12$ PLEASE");
//			} else if ((temp - 36) < 0) {
//				System.out.println("$36$ PLEASE");
//			} else if ((temp - 128) < 0) {
//				System.out.println("$128$ PLEASE");
//			} else if ((temp - 218) < 0) {
//				System.out.println("$218$ PLEASE");
//			} else {
//				System.out.println("支払いNG");
//			}
//		} else {
//			y -= total;
//			System.out.println("you pay!" + total + "Y=" + y);
//		}
//			}
//				
