package jp.dcnet.lss.chapter05;

public class Q4__重複要素 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1} ;
		int count=0;
        for(int j=0;j<array.length;j++) {
            for(int k =j+1;k<array.length;k++) {
                if(array[j]==array[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println( "重复元素 : " +  array[j] );
            count = 0;
        }



	}

}
