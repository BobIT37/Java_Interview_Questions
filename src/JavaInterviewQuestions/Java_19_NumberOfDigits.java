package JavaInterviewQuestions;

public class Java_19_NumberOfDigits {

	public static void main(String[] args) {
		
		//1234 4
		//123 =  3
		
		long num = 12342222l;
		int count = 0;
		
		while(num != 0) {
			num = num/10; //123
			++count;
		}
		
		System.out.println("number of digits: "+ count);
		
	}

}
