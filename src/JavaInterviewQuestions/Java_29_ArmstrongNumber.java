package JavaInterviewQuestions;

public class Java_29_ArmstrongNumber {

	public static void main(String[] args) {
		
		//153 = 1*1*1 5*5*5 3*3*3 = 1 + 125 + 27 = 153
		
		int num = 153; 
		int number; 
		int temp; 
		int total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }


}
