package jp.dcnet.yjw.chapter05;

public class Index0 {

	//質問５
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問３の配列に値「７」のインデックスを求む
		int[] array=new int[]{1,2,6,7,4,6,2,1};
		int cfz=7;

		for(int i = 0; i < array.length; i++) {
			 if(array[i]==cfz){
				 System.out.println("no."+(i+1)+" is:"+array[i]);
			 }

		}

	}

}
