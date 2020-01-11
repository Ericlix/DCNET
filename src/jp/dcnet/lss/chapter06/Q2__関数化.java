package jp.dcnet.lss.chapter06;

public class Q2__関数化 {
	public static int max(int[] datas){
		int a =datas[0];
		for(int x : datas) {
			if(x > a){
				a = x;
			}
		}
		return a;
	}
	public static int min(int[] datas){
		int a =datas[0];
		for(int x : datas) {
			if(x < a){
				a = x;
			}
		}
		return a;

	}
	public static int SUM(int[] datas){
		int a = 0;
		for(int x : datas) {
				a += x;
		}
		return a;
	}
	public static int AverageValue(int[] datas){
		int a = 0;
		for(int x : datas) {
				a += x;
		}
		return a/datas.length;
	}
	public static void main(String[] args) {
		int[] d = new int[]{200,0,2,4,5,7,9,101,121};
		System.out.println("配列の和："+SUM(d));
		System.out.println("MAX値："+max(d));
		System.out.println("MIN値："+min(d));
		System.out.println("平均値："+AverageValue(d));//
	}
}
