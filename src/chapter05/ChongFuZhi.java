package jp.dcnet.yjw.chapter05;

public class ChongFuZhi {

	////新米８問の設問4
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//配列 {1, 2, 6, 7, 9, 6, 2, 1} のchongfuzhi

		int[] array=new int[]{1,2,6,7,9,6,2,1};
		findArray(array);




	}

	public static void findArray(int[] a){
		int count=0;

		//int jishuqi=0;

		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]==a[k]){
					count++;

					//jishuqi+=count;

					if(count==1){
						System.out.println("cfz:"+a[j]);
						count=0;
					}
				}
			}
		}

		//System.out.println(jishuqi);

	}

	/*public static void findArray(int[] a){
		int count=0;
		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]==a[k]){
					count++;
				}
			}
			if(count==1){
				System.out.println("cfz:"+a[j]);
				count=0;
			}
		}
	}*/




}
