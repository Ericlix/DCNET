package jp.dcnet.wqf.chapter06;

import java.util.Arrays;

/**
 *
 * @author 呉青芳 19/08/17
 */
public class TestMethod_01 {

	/*
	 * 問題6
	 */
	static int[] megerArray(int[] left, int[] right) {
		int[] megeArray = new int[left.length + right.length];
		int index = 0;
		// mege 処理
		// mege left
		//

		for (int l : left) {
			megeArray[index] = l;
			index++;

		}
		for (int r : right) {
			boolean flg = false;

			for (int m : left) {
				if (r == m) {
					flg = true;

					break;
				}
			}
			if (!flg) {
				megeArray[index] = r;
				index++;
			}
		}

		// 配列再定義
		int[] reArray = new int[index];
		for (int x = 0; x < reArray.length; x++) {
			reArray[x] = megeArray[x];
		}

		return reArray;
	}

	/*
	 * 問題7
	 */
	static char[] trim(char[] ip) {
		// char[] input = new char[] { ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		// String s = new String(input);
		// s = s.trim();
		// char[] charArray = s.toCharArray();
		// return charArray;
		String str = "";
		for (char c : ip) {
			str += c;
			// str = str+c;
		}
		System.out.println(str);
		return str.trim().toCharArray();

	}

	/*
	 * 問題8
	 */

	static int[] bubbleSort(int[] ar) {

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		return ar;
	}

	/*
	 * 問題１ public static void main(String[] args); 修飾⼦ public static 返却型はvoid
	 * 関数名main 引数型 String 引数名 args
	 */

	/*
	 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、 main関数に呼び出してく ださい。
	 */
	public static int max(int[] arr) {

		int max;
		if (null != arr && arr.length > 0) {
			max = arr[0];

			for (int x : arr) {
				if (x > max)
					max = x;

			}
			System.out.println(max);
			return max;

		} else {
			return 0;
		}
	}

	public static int min(int[] arr) {

		int min;
		if (null != arr && arr.length > 0) {
			min = arr[0];

			for (int x : arr) {
				if (x < min)
					min = x;

			}
			System.out.println(min);
			return min;

		} else {
			return 0;
		}
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		System.out.println(sum);
		return sum;
	}

	//

	public static void main(String[] args) {
		TestMethod_01 array = new TestMethod_01();

		int[] d = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		array.max(d);
		array.min(d);
		array.sum(d);
		int[] left = new int[] { 1, 2, 3, 4, 5 };
		int[] right = new int[] { 4, 5, 6, 7, 9, 8 };
		int[] rtn = array.megerArray(left, right);
		System.out.println(Arrays.toString(rtn));
		System.out.println("-------------------");
		char[] input = new char[] { ' ', 'A', 'b', ' ', ' ', 'C', ' ' }; // ⼊⼒引数
		System.out.println(Arrays.toString(array.trim(input)));
		// char[] output = array.trim(input);
		// System.out.println(Arrays.toString(output));
		int[] arra = new int[] { 3, 2, 6, 7, 9, 5, 4, 1, 8, 87, 76,45,176 };
		int[] yrra = array.bubbleSort(arra);
		System.out.println(Arrays.toString(yrra));
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★");
		/*
		 * 問題９
		 */
		System.out.println(Arrays.toString(bubbleSort(megerArray(left, right))));

		/*
		 * 問題３ null
		 */

		/*
		 * 問題４ value2
		 */

		/*
		 * 問題5
		 *
		 * true
		 */

	}
}
