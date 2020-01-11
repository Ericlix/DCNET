package jp.dcnet.yjw.chapter05;

public class JieCheng {

	//新米８問の設問2
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//5の階乗を求める(for)
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
