package practise_of_class;

public class TestMax {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int a=3;
		int b=2;
		int c=max(a,b);
		
		System.out.println(a+"�a"+b+"max is"+c);
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
