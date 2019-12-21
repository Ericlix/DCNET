package jp.dcnet.lss.chapter05;


public class Q7__配列を昇順 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a ;
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		
		for(int i = 0; i < array.length;i++ ) {
			for(int j=array.length-1;j>i;j--){
				if(array[j]<array[j-1]){
				a = array[j];
				array[j] = array[j-1];
				array[j-1] = a;		
				}
			}
		}
		for(int y = 0; y < array.length;y++ ) {
			System.out.println(array[y]); 
		}

	}

}
