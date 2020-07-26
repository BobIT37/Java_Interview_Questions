package JavaInterviewQuestions;

public class Java_09_LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		//Question largest and smallest numbers finding
		
		int x = 600;
		int y = 200;
		int z = 500;
		
		//First way
		
		if(x>y && x>z) {
			System.out.println("x is greatest");
		}else if(y>z) {
			System.out.println("y is greatest");
		}else {
			System.out.println("z is greatest");
		}
		
		//Second way (nested if)
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greatest");
			}
			else {
				System.out.println("z is greatest");
			}
		}else {
			if(y>=z) {
				System.out.println("y is greatest");
			}else {
				System.out.println("z is greatest");
			}
		}
		
		
		//Smallest number 
		if(x<y && x<z) {
			System.out.println("x is smallest");
		}else if(y<z) {
			System.out.println("y is smallest");
		}else {
			System.out.println("z is smallest");
		}
		

	}

}
