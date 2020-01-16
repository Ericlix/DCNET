package jp.dcnet.cj.chapter05;

public class TestQuestion_five {
	
	//質問5:質問3の配列に値「7」のインデックスを求む。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int x = 7;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println("要素「7」对应的index数是" + i);
			}
		}
	}
}

