package jp.dcnet.lss.chapter04;

import java.util.Arrays;



public class Test0118 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array1 = new int[10];
		array1[0] = 1;
		array1[1] = 1;
		array1[2] = 1;


		array1[9] = 100;

		System.out.println("int:" +Arrays.toString(array1));
		//INDEXFOR
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
			System.out.println("<INDEXFOR> index ="+i +"の要素の値は:"+ array1[i]);
		}






//		int i10 =0;
//		for (;;) {
//			if (i10 < 10) {
//				System.out.println("i10 :" +i10);
//				i10++;
//				continue;
//			} else {
//				break;
//
//			}
//
//		}





//		int loopIndex = 0;
//		for (int i : array1) {
//			System.out.println(loopIndex);
//			System.out.println("<拡張　FOR> index ="+loopIndex +"の要素の値は:"+ array1[i]);
//			loopIndex++;
//		}

		Integer[] array = new Integer[10];
		System.out.println("Integer:" + Arrays.toString(array));

		String[] Array2 = new String[10];
		Array2[0] = "ABC";
		Array2[1] = "ABC";
		Array2[2] = "ABC";
		"S".equals(Array2[7]);

//		Array2[7].equals("");
		System.out.println("String:" + Arrays.toString(Array2));




	}

}
