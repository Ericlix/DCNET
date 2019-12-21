package jp.dcnet.lss.chapter06;
public class Q8 {
	public static void main(String[] args) {
		int[] array = new int[]{1,8,6,4,9};
		bubbleSort(array);

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
