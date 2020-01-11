package jp.dcnet.yjw.chapter05;

public class JieCheng {

	//�V�ĂW��̐ݖ�2
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//5�̊K������߂�(for)
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();

		int x=5;
		int sum=1;

		if(x==0){
			sum=1;
			System.out.println(sum);
		}else{
			int pro=1;
			for(int i = 1; i <= x; i++) {
				pro=pro*i;
			}
			System.out.println(pro);
		}
	}

}
