package jp.dcnet.lss.chapter06;
public class Q7 {
	public static void main(String[] arg){
		char[]  input = new char[]{' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		int n = 2;
		int i = 5;
		trim(input,n,i);
	}
	public static void trim(char[] a,int n,int i){
		Object[] result = new Object[a.length-n-1];
		for (int m = 0; m < i; m++,n++) {
			result[m] = a[n];
		}
		printArray(result);
	}
	public static void printArray(Object[] objs) {
		if(objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		 sb.append("{");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("}");
		System.out.println(sb.toString());
	}
}
