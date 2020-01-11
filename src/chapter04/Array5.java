package jp.dcnet.yjw.chapter04;

public class Array5 {

	//配列の設問の問題5
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array=new int[]{1,3,5,7,100,0,1};
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
	}

}
