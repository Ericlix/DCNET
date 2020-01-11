package jp.dcnet.yjw.chapter04;

public class Array7 {

	//�z��̐ݖ�̖��7
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
