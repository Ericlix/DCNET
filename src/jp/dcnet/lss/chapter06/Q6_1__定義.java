package jp.dcnet.lss.chapter06;
public class Q6_1__定義 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		megerArray(left,right);
	}
	public static void megerArray(int[]left,int[]right){
		int o = left.length + right.length;
		int[] result = new int[o];
		System.out.print("int[] result = new int[] {");
		for(int m = 0;m < result.length;m++){
			if(m < left.length){
				result[m] = left[m];
			}else if(m >= left.length){
					result[m] = right[m - left.length];
			}
			System.out.print(result[m]);
		}
		System.out.print("}");
	}
	public static void printArray(Object[] objs) {
		if(objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		 sb.append("[");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
