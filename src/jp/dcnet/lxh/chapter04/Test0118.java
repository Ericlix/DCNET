package jp.dcnet.lxh.chapter04;

import java.util.Arrays;

public class Test0118 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Integer ⇒　String
		Integer intStr = null;
//		System.out.println(intStr.toString());// ×
		System.out.println(String.valueOf(intStr));




		// ①

		// ＩＮＤＥＸＦＯＲ
		// for (int i = 0; i < 10; i++) {
		// // i = i+1;// i++
		// System.out.println(i);
		// }
		//
		// int i10 = 0;
		// for (;;) {
		// if (i10 < 10) {
		// System.out.println("i10 : "+i10);
		// i10++;
		// continue;
		// } else {
		// break;
		// }
		// }
		int[] array1 = new int[10];
		array1[0] = 1;
		array1[1] = 1;
		array1[2] = 1;
		array1[3] = 1;
		array1[4] = 1;

		System.out.println("int:" + Arrays.toString(array1));
		Integer[] array1_1 = new Integer[10];
		System.out.println("Integer:" + Arrays.toString(array1_1));

		String[] array1_2 = new String[10];
		array1_2[0] = "ABC";
		array1_2[1] = "ABC";
		array1_2[2] = "ABC";
		array1_2[3] = "ABC";
		array1_2[4] = "ABC";
		array1_2[5] = "ABC";
		array1_2[6] = "ABC";
		// array1_2[7].equals("");

		String strE = "";
		// 10000
		if (false) {
			strE = "abc";
		}else {
			strE= null;
		}
		// 10000
		strE.equals(array1_2[7]);
		System.out.println("String:" + Arrays.toString(array1_2));

		for (int i = 0; i < array1.length; i++) {
			System.out.println("＜ＩＮＤＥＸＦＯＲ＞   index=" + i + "の要素の値は："
					+ array1[i]);
		}

		// 拡張ＦＯＲ
		int loopIndex = 0;
		for (int i : array1) {
			System.out.println("＜拡張ＦＯＲ＞   index=" + loopIndex + "の要素の値は：" + i);
			loopIndex++;
		}

		// ②
		int[] array2_1 = { 0, 0, 0, 0, 0 };
		int[] array2_2 = new int[] { 1, 2, 3, 4, 5 };
		array2_2[0] = 1;
		array2_1[0] = 1;
		array2_1[1] = 1;
		array2_1[2] = 1;
		array2_1[3] = 1;
		array2_1[4] = 1;

		// 拡張ＦＯＲ
		int loopIndex2 = 0;
		for (int i : array2_1) {
			System.out.println("＜拡張ＦＯＲ＞   index=" + loopIndex + "の要素の値は：" + i);
			loopIndex2++;
		}

	}

}
