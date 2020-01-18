package jp.dcnet.wqf.chapter04;

import java.util.Arrays;

public class Test0118 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 *
		 * 数组的特点 类型一致 初期化指定长度 不可改变长度 长度与index之间的关系 index 从0开始 数组下标越界
		 * 注意nullpointer String 要记得设值
		 *
		 *
		 *
		 * 初期化:String str = "";  blank ブランク          "".equals(array[1]);
		 *　String strHspace =" ";
		 * String strZspance = "　";
		 * 		 *
		 */
		String n = "2001東京都墨田区　3-2-1　301室";
		System.out.println(n.substring(0, 10));
		System.out.println(n.substring(11));
		String ss ="123456";
		String sss =" 123456 ";
		String sss2 = "　123　";
		if(sss.trim().equals(ss)){
		System.out.println("正しい");
		}
		if(sss2.trim().equals(sss)){
			System.out.println("===");
		}
		System.out.println(ss.substring(1));
		System.out.println(ss.substring(0,5));
		
		n.split("　");
		System.out.println(Arrays.toString(n.split("　")));

		// ①
		int[] array1 = new int[] { 0, 0, 0, 0, 0 };
		// System.out.println(array1.length);
		// System.out.println(Arrays.toString(array1));
		array1[0] = 1;
		array1[1] = 1;
		array1[2] = 1;
		array1[3] = 1;
		array1[4] = 1;

		int index = 0;
		for (int arr : array1) {
			System.out.println("拡張for=" + index + "の要数の値" + arr);
			index++;

		}

		// ②
		int indexfor = 0;
		int[] array2 = new int[10];

		for (int i = 0; i < array2.length; i++) {
			System.out.println("indexfor=" + i + "要素" + array2[i]);
		}

		for (int arr : array2) {
			System.out.println("拡張for=" + index + "の要数の値" + arr);
			index++;

		}
		System.out.println("int:" + Arrays.toString(array2));

		Integer[] array22 = new Integer[3];
		String[] array222 = new String[3];
		// array222[0].equals(""); ⇒ nullpointerException
		System.out.println("Integer:" + Arrays.toString(array22));
		System.out.println("String:" + Arrays.toString(array222));
		// for(int k =0;k<10;k++){
		// System.out.println(k);
		// }
		//
		// int i10 =0;
		// for(;;){
		// if(i10<10){
		// System.out.println("i10;"+i10);
		// i10++;
		// continue;
		//
		// }else{
		// break;
		// }
		// }
		// String ser = null;
		// if(false){
		// ser="abc";
		// }
		// ser.equals(array222[0]);

		// String ⇒ int;
		String intStr = null;
		// System.out.println(intStr.toString());✖
		System.out.println(String.valueOf(intStr));// valueOf静态方法

		int[][] array2d = new int[5][5];

		for (int x = 0; x < array2d.length+5; x++) {
			if (x < array2d.length) {
				for (int y = 0; y < array2d[x].length; y++) {
					if(x==y||(x+y)==(array2d.length-1)||
							(x==((int)array2d.length/2))||
							(y==((int)array2d.length/2))){
						System.out.print(array2d[x][y]);
					}else{
						System.out.print(" ");
					}
				}
//				System.out.println();
			} else {
				System.out.print("  1  ");
			}
			System.out.println();
		}

	}

}
