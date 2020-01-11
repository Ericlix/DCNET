package jp.dcnet.yjw.chapter04;

public class Array7 {

	//配列の設問の問題7
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array=new int[][]{
				{1,2,3,4},{5,6,7,8}
		};

		int sum=0;
		int pro=1;

		for(int i = 0; i < array.length; i++) {
			 for(int j=0;j<array[i].length;j++){
				 sum=sum+array[i][j];
				 pro=pro*array[i][j];
			 }
		}
		System.out.println(sum);
		System.out.println(pro);
	}

}
