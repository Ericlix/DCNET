package jp.dcnet.lss.chapter09;

public class Math {

	public static void main(String[] args) {
		System.out.println("a");
	}
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

}
