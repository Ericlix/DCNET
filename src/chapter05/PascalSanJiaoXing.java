package jp.dcnet.yjw.chapter05;

public class PascalSanJiaoXing {

	
	//質問８
	public static void main(String[] args) {
		int length = 5;
	    int arr[][] = new int[length][];

	    yanghui(length, arr);
	}

	public static void yanghui(int length,int[][] arr){
		// 驕榊紙莠檎ｻｴ謨ｰ扈�
	    for (int i = 0; i < arr.length; i++) {
	      // 遑ｮ螳壻ｺ檎ｻｴ謨ｰ扈�蜈�邏�逧�螟ｧ蟆�
	      arr[i] = new int[i+1];

	      // 謇灘魂遨ｺ譬ｼ
	      for (int j = 0; j < arr.length-i-1; j++) {
	        System.out.print("  ");
	      }

	      // 驕榊紙荳�扈ｴ謨ｰ扈�
	      for (int j = 0; j < arr[i].length; j++) {
	        if(j == 0 || arr[i].length-1 == j) {
	          // 荳芽ｧ貞ｽ｢荳､閻ｰ蜈ｨ荳ｺ 1
	          arr[i][j] = 1;
	        }else {
	          // 蜈ｶ莉門��邏�遲我ｺ惹ｸ､閧ｩ謨ｰ蟄嶺ｹ句柱
	          arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
	        }
	        System.out.printf("%4d",arr[i][j]);
	      }
	      System.out.println();
	    }

	}

}
