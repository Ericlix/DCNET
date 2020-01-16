package jp.dcnet.cj.chapter05;

	//質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。

public class TestQuestion_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int zz;
		int xx;
		for (int i = 0; i < a.length; i++) {
			zz = i;
			for (int j = i; j < a.length; j++) {
				if (a[zz] > a[j])
					zz = j;
			}
			if (i != zz) {
				xx = a[i];
				a[i] = a[zz];
				a[zz] = xx;
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
