package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_26_PowerConcept {

	public static void main(String[] args) {
		
		//3^4 = 81
		
		int base = 2, exponent = 5;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
        
    }

}
