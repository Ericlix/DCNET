package jp.dcnet.wqf.chapter05;

/**
 * 配列を昇順でソートする
 *
 * @author 呉青芳
 * @date 2019-08-14
 */
public class Goseihou07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 第7問題
		int[] array = new int[] { 3, 2, 6, 7, 9, 5, 4, 1 };

		// {1,2,3,4,5,6,7,9}
		// 配列を昇順でソートする
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				// 判断i、 jの大小
				if (array[i] <array[j]) {
					int a = array[j];
					array[j] = array[i];
					array[i] = a;
				}
			}
		}
		// 新しい配列の要素を出力する
		for (int a : array) {
			System.out.println(a);
		}
	}

}