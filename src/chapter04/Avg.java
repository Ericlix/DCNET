package jp.dcnet.yjw.chapter04;

public class Avg {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題５
		//配列 {1, 2, 6, 7, 9, 6, 2, 1} の最値、最値、和、平均値を求める
		int[] array=new int[]{1,2,6,7,9,6,2,1};
		int max=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]>max){
				 max=array[i];
			 }
		}
		System.out.println("Max="+max);
		
		int min=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]<min){
				 min=array[i];
			 }
		}
		System.out.println("Min="+min);
		
		int sum=0;
		for(int i = 0; i < array.length; i++) {
			 sum=sum+array[i];
		}
		
		System.out.println("Sum="+sum);
		System.out.println("Avg="+(float)sum/array.length);
		
	}

}
