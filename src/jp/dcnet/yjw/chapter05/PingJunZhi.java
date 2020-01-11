package jp.dcnet.yjw.chapter05;

public class PingJunZhi {

	//新米８問の設問3
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める
		int[] array=new int[]{1,2,6,7,9,6,2,1};

		//最大値
		int max=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]>max){
				 max=array[i];
			 }
		}
		System.out.println("Max="+max);

		//最小値
		int min=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]<min){
				 min=array[i];
			 }
		}
		System.out.println("Min="+min);

		//和
		int sum=0;
		for(int i = 0; i < array.length; i++) {
			 sum=sum+array[i];
		}
		System.out.println("Sum="+sum);

		//平均値
		double avg;
		avg=sum/array.length;
		System.out.println("Avg="+avg);

	}

}
