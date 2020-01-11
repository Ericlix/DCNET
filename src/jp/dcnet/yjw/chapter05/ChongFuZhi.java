package jp.dcnet.yjw.chapter05;

public class ChongFuZhi {

	////�V�ĂW��̐ݖ�4
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//�z�� {1, 2, 6, 7, 9, 6, 2, 1} ��chongfuzhi

		int[] array=new int[]{1,2,6,7,9,6,2,1};
		findArray(array);




	}

	public static void findArray(int[] a){
		int count=0;

		//int jishuqi=0;

		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]==a[k]){
					count++;

					//jishuqi+=count;

					if(count==1){
						System.out.println("cfz:"+a[j]);
						count=0;
					}
				}
			}
		}

		//System.out.println(jishuqi);

	}

	/*public static void findArray(int[] a){
		int count=0;
		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]==a[k]){
					count++;
				}
			}
			if(count==1){
				System.out.println("cfz:"+a[j]);
				count=0;
			}
		}
	}*/




}
