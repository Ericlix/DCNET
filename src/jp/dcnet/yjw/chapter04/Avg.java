package jp.dcnet.yjw.chapter04;

public class Avg {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//���T
		//�z�� {1, 2, 6, 7, 9, 6, 2, 1} �̍Œl�A�Œl�A�a�A���ϒl�����߂�
		int[] array=new int[]{1,2,6,7,9,6,2,1};
		int max=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]>max){
				 max=array[i];
			 }
		}
		System.out.println("Max="+max);
		
		int min=array[0];
		for(int i = 0; i < array.length; i++) {
			 if(array[i]<min){
				 min=array[i];
			 }
		}
		System.out.println("Min="+min);
		
		int sum=0;
		for(int i = 0; i < array.length; i++) {
			 sum=sum+array[i];
		}
		
		System.out.println("Sum="+sum);
		System.out.println("Avg="+(float)sum/array.length);
		
	}

}
