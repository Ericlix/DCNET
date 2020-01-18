package jp.dcnet.cj.chapter04;

import java.util.Arrays;

public class Test0118 {

	public static void main(String[] args) {
		// Integer -- String
//		String intStr = null;
//		System.out.print(intStr.toString());// 一定不能写
//		System.out.println(String.valueOf(intStr));// 正确

		// TODO Auto-generated method stub
//		// ①
////		int[] a = new int[] {};//必须指定长度
////		int[] b = { 1, 2, 3, 4, 5, 6 };
//		a[0] = 1;
//		a[1] = 1;
//		a[2] = 1;
//		a[3] = 1;
//		a[4] = 1;
//		// ②
////		int[] c = new int[2]; // 0 , 0 2サイズです。
////		System.out.println(Arrays.toString(c));
//
//		int[] array = new int[10];
//
//		// INDEXFOR
//		for (int q = 0; q < 10; q++) {
//			// i = i + 1 // i++ (重新给 i 赋值)
//			System.out.println(q + 1);
//		}
//		int i1 = 0;
//		for (;;) {//无限循环
//			if (i1 < 10) {//循环条件
//				System.out.println(" i1 :" + i1);
//				i1++;//自增长
//				continue;
//			} else {
//				break;
//			}
//		}

		int[] array = new int[10];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("<INDEXFOR>　index =" + i + "の要素です" + array[i]);
		}
		// System.out.println("int" + Arrays.toString(array));
		// 扩张FOR循环
		int Index = 0;
		for (int d : array) {
			System.out.println("<拡張FOR>　index =" + Index + "の要素です" + d);
			Index++;
		}
		Integer[] aa = new Integer[10];
		String[] bb = new String[10];
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		bb[0] = "ABC";
		// bb[0].equals(" "); NG
		// " ".equals(bb);//一定要把常量放在要判断数
//		String strE = " ";// 初期化设为空，不会出现nullpoint
//		if (false) {
//			strE = "ABC";
//		} else {
//			strE = null;
//		}
//		System.out.println("Integer :" + Arrays.toString(aa));
//		System.out.println("Integer :" + Arrays.toString(bb));

		int[][] aaa = new int[5][5];
		for (int x = 0; x < aaa.length + 5; x++) {
			if (x < aaa.length) {	//自增长变量
				for (int y = 0; y < aaa[x].length; y++) {
					System.out.print(aaa[x][y]);
				}
			} else {
				System.out.print("     1     ");
			}
			System.out.println();
		}
	}
}
