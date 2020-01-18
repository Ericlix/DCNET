package jp.dcnet.yjw.chapter0118;


public class Array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int[] array1=new int[]{1,2,3};
		//int[] array2=new int[3];

		//System.out.println(Arrays.toString(array1));

		/*int loopIndex=0;
		for(int x:array1){
			System.out.println(loopIndex);
			loopIndex++;
		}

		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}*/

		/*for(int i=0;i<array2.length;i++){
			System.out.println(i);
		}

		//Stringのnull pointerを避けることが必要で、判断する
		//初期化String str="";
		//"".equals(array[i]);

		Integer inStr=null;
		System.out.println(String.valueOf(inStr));
		System.out.println(inStr);
		//String str=null;

		int[][] ab=new int[5][5];
		for(int i=0;i<ab.length;i++){
			for(int j=0;j<ab[i].length;j++){
				System.out.print(ab[i][j]);
			}
			System.out.println();
		}*/

		/*int[][] ba=new int[5][5];
		ba[0][2]=1;
		ba[1][2]=1;
		ba[2][2]=1;
		ba[3][2]=1;
		ba[4][2]=1;
		for(int i=0;i<ba.length;i++){
			for(int j=0;j<ba[i].length;j++){
				if(ba[i][j]==1){
					System.out.print(ba[i][j]);
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}*/

		/*int[][] arr=new int[5][5];

		for(int i=0;i<arr.length + 5;i++){
			if(i<arr.length){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
			}else{
				System.out.print("  1  ");
			}
			System.out.println();
		}*/

		//the shape of x
		int[][] array=new int[5][5];

		for(int i=0;i<array.length;i++){

			for(int j=0;j<array[i].length;j++){
				if(i==j||(i+j)==array.length-1){
					System.out.print(array[i][j]);

				}else{
					System.out.print(" ");
				}

			}


			System.out.println();
		}

	}

}
