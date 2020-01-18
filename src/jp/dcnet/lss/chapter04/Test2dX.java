package jp.dcnet.lss.chapter04;

public class Test2dX {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] C = new int[7][7];
		for (int i = 0; i < C.length+5; i++) {
			if (i<C.length) {
				for (int j = 0; j < C[i].length; j++) {
					if (i==j || (i+j)==(C.length-1) ||
						(i ==((int)C.length/2)) ||
						(j ==((int)C.length/2))) {//汎用

						System.out.print(C[i][j]);
					} else {
						System.out.print(" ");

					}
				}
			} else {
				System.out.print("   1   ");
			}
			System.out.println();

			}


		}

}
