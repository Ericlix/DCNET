package you;

public class TestPassByValue {

	
	//Ž¿–â‚W
	public static void main(String[] args) {
		// TODO 


		int num1 = 1;
		int num2 = 2;

		 System.out.println("swap before num1 is " +
		                        num1 + " ,num2 is " + num2);

		//the method of swap
		swap(num1, num2);
		System.out.println("swap after num1 is " +
		                       num1 + " ,num2 is " + num2);
	}

	public static void swap(int n1, int n2) {
		System.out.println("\tenter the method of swap");
		System.out.println("\t\tswap before n1 is " + n1
		                         + ",n2 is " + n2);
		// swap n1 and n2's value
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("\t\t swap after n1 is " + n1
		                         + ",n2 is " + n2);
	}


}
