package jp.dcnet.lss.chapter04;
public class Q3最大値 {
	public static void main(String[] args) {
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int a =array[0];
		for(int x : array) {
			if(x > a){
				a = x;
			}
		}
		System.out.println(a);
	}
}
