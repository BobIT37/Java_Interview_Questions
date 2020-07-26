package JavaInterviewQuestions;

public class Java_14_NaturalNumberSum {

	public static void main(String[] args) {
		
		int num = 50;
		int sum = 0;
		int sum1 = 0;
		
		//1+2+3+4+5...100= 5050
		
		for(int i = 1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("sum is: "+ sum);
		
		//Second way
		System.out.println("-------");
		
		int k = 1;
		while(k <= num) {
			sum1 = sum1+ k;
			k++;
		}
		System.out.println("sum with while is: "+ sum1);

	}

}
