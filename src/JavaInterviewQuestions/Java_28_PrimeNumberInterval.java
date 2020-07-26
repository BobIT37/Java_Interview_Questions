package JavaInterviewQuestions;

public class Java_28_PrimeNumberInterval {

	public static void main(String[] args) {
		
		//20 to 50
		
		 int low = 2, high = 10;

	        while (low < high) {
	            boolean flag = false;

	            for(int i = 2; i <= low/2; ++i) {
	                // condition for nonprime number
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag && low != 0 && low != 1)
	                System.out.print(low + " ");

	            ++low;
	        }
	}

}
