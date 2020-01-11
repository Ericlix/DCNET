package practise_of_class;

public class TestMax {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=3;
		int b=2;
		int c=max(a,b);
		
		System.out.println(a+"和"+b+"max is"+c);
	}

	public static int max(int a,int b){
		int res;
		if(a>b)
			res=a;
		else
			res=b;
		
		return res;
		
	}
}
