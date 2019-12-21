package jp.dcnet.lss.chapter06;

public class Q4__実施結果2 {
		private static void fillArray(String[] array) {
		 array[0] = "value2"; 
		 }
		public static void main(String args[]) {
			String[] array = new String[]{"value1"};
			fillArray(array);
			System.out.println(array[0]); 
		}
}
