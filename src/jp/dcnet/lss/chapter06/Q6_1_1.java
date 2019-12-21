package jp.dcnet.lss.chapter06;
public class Q6_1_1 {
	public static void main(String[] args) {
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		System.out.print("int[] result = new int[] ");
		int[] a = megerArray(left,right);
		Object[] result = new Object[a.length];
		for (int m = 0; m <a.length; m++) {
			result[m] = a[m];
		}
		printArray(result);
	}
	public static int[] megerArray(int[]left,int[]right){
		int o = left.length + right.length;
		int[] result =  new int[o];
		for(int m = 0;m < o;m++){
			if(m < left.length){
				result[m] = left[m];
			}else if(m >= left.length){
					result[m] = right[m - left.length];
			}
		}
		return result;
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
