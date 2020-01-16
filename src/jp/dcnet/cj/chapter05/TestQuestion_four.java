package jp.dcnet.cj.chapter05;

public class TestQuestion_four {
	
 //質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println(a[i]);
				}
			}
		}
	}
}