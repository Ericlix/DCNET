package jp.dcnet.yjw.chapter05;

public class PascalSanJiaoXing0 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[][] array=arr(10);
		printArr(array);
		
	}
	
	public static int[][] arr(int n){
		
		int[][] arr=new int[n][n];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][0]=1;
				arr[i][i]=1;
			}
		}
		
		for(int i=2;i<arr.length;i++){
			for(int j=1;j<arr[i].length;j++){
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				
			}
		}
		
		return arr;
	}
	
	public static void printArr(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
