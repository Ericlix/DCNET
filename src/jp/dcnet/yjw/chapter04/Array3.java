package jp.dcnet.yjw.chapter04;

public class Array3 {

	////�z��̐ݖ�̖��3
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		int[][] array=new int[2][3];

		/*int[][] array=new int[][]{
				{1,2,3,4},{5,6,7,8}
		};*/

		for(int i = 0; i < array.length; i++) {
			 for(int j=0;j<array[i].length;j++){
				 System.out.print(array[i][j]+" ");
			 }
			 System.out.println();
		}
	}

}
