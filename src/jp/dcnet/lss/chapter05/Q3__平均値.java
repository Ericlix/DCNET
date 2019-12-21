package jp.dcnet.lss.chapter05;

public class Q3__平均値 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 0;
		int b = 10;
		float c = 0;
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1} ;
		for(int x : array) {
			if(x > a){
				a = x;
			}
			if(x < b){
				b = x;
			}			
			c += x;
			
			
		}
		System.out.println(a); //最大値
		System.out.println(b);//最小値
		System.out.println(c);//SUM
		System.out.println(c/array.length);//平均値

	}

}
