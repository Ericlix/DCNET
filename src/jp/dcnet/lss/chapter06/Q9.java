package jp.dcnet.lss.chapter06;
public class Q9 {
	public static void main(String[] args) {
		int[] right = new int[] {1, 9, 3, 4};
		int[] left = new int[] {5, 6, 7, 8};
		megerArray(left,right);
	}
	public static void megerArray(int[]left,int[]right){
		int o = left.length + right.length;
		int[] result = new int[o];
		for(int m = 0;m < o;m++){
			if(m < left.length){
				result[m] = left[m];
			}else if(m >= left.length){
					result[m] = right[m - left.length];
			}
		}
		bubbleSort(result);
	}
	public static void bubbleSort(int[] array) {
		int a ;
		for(int i = 0; i < array.length;i++ ) {
			for(int j=array.length-1;j>i;j--){
				if(array[j]<array[j-1]){
				a = array[j];
				array[j] = array[j-1];
				array[j-1] = a;		
				}
			}
		}
		Object[] result = new Object[array.length];
		for (int m = 0; m < array.length; m++) {
			result[m] = array[m];
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
