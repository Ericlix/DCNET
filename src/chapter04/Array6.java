package jp.dcnet.yjw.chapter04;

public class Array6 {

	//配列の設問の問題6
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int[] array=new int[4];
		int[] array=new int[]{1,3,5,7,100,0,1};
		int sum=0;
		for(int i = 0; i < array.length; i++) {
			 sum=sum+array[i];
		}
		System.out.println("Sum="+sum);
	}

}
