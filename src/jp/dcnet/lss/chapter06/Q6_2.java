package jp.dcnet.lss.chapter06;
public class Q6_2 {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4};
		int startlndex =1;
		int length = 3;
		System.out.print("int[] result = new int[] ");
		Array(array, startlndex, length);
	}
	public static void Array(int[]array,int startlndex,int length){
		Object[] result = new Object[length];
		for (int m = 0; startlndex <= length; m++, startlndex++) {
			result[m] = array[startlndex];
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
