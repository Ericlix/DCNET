package jp.dcnet.yjw.chapter04;

public class JuZhenJiaFa {

	//���V
	//2�����z��̘a
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int[][] a = new int[][] {{1,2},{4,6}};
		int[][] b = new int[][] {{3,5},{6,9}};

		int[][] c =new int[a.length][b.length];
		
		for(int i = 0; i < a.length; i++) {
			 for(int j=0;j<a[i].length;j++){
				 c[i][j]=a[i][j]+b[i][j];
				 System.out.println(c[i][j]);
			 }
		
		}	 
	}

}
