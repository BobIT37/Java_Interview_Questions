package JavaInterviewQuestions;


public class Java_15_FactorialNumber {

	public static void main(String[] args) {
		
		//!5 = 5x4x3x2x1 =120
		//!4 = 4x3x2x1 = 24
		
		int num = 5;
		int fac = 1;
		
		for(int i = 1; i<=num; i++) {
			fac = fac * i;
			
		}
		System.out.println("factorial of "+ num + " is:" + fac );
		
		//getFact(0);
		

	}
	
	public static void getFact(int num) {
		
		int fac = 1;
		
		for(int i = 1; i<=num; i++) {
			fac = fac * i;
			
		}
		System.out.println("factorial of "+ num + " is:" + fac );
	}

}
