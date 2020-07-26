package JavaInterviewQuestions;

public class Java_33_StepsSameOrder {

	public static void main(String[] args) {
		
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		 for(int x = 1; x<=5; x++) {
			 for(int y=1; y<=x; y++) {
				 System.out.print(x+" ");
			 }
			 System.out.println();
		 }

	}

}
