package JavaInterviewQuestions;

public class Java_06_SwapTwoNumbers {

	public static void main(String[] args) {
		
		
		//Swap numbers with temporary variable
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping: ");
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
		
		System.out.println("After swapping: ");
		
		int temp;
		temp  = a;
		a = b;
		b = temp;
		
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
		
		//swap two numbers without using a temporary
		
		System.out.println("before swapping: ");
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
		
		System.out.println("After swapping: ");
		
		a = a-b;
		b = a+b;
		a= b-a;
		
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
		
		

	}

}
