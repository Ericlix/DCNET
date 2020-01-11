package Chapter03;

public class chapter0301 {
	public static void main(String[] args) {
		int y = 0;
		int total = 0;

		if (total > 0) {
			int temp = total - y;
			System.out.println("sagaku :" + temp);
			if (temp > 0) {
				int kosu218 = 0;
				int kosu128 = 0;
				int kosu36 = 0;
				int kosu12 = 0;
				int kosu6 = 0;
					for (;;) {
						if (temp == 0) {
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
						} else if (temp >= 12) {
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

					System.out.println("pay 218 :" + kosu218);
					System.out.println("pay 128 :" + kosu128);
					System.out.println("pay 36 :" + kosu36);
					System.out.println("pay 12 :" + kosu12);
					System.out.println("pay 6 :" + kosu6);
				} else {
					y -= total;
					System.out.println("you pay!" + total + " Y = " + y);
				}
			} else {
				System.out.println("senntakusitekudasia!");
			}

		}

	}


//		int temp = total - y;
//		if(temp  >= 0) {
//		if ((temp - 6) < 0) {
//			System.out.println("6");
//		} else if ((temp - 12) < 0) {
//			System.out.println("12");
//		} else if ((temp - 36) < 0) {
//			System.out.println("36");
//		} else if ((temp - 128) < 0) {
//			System.out.println("128");
//		} else if ((temp - 218) < 0) {
//			System.out.println("218");
//		} else {
//			System.out.println("你太有钱了");
//		}
//		}else {
//			y -= total;
//			System.out.println("有钱" + total + "y=" + y);
//		}
