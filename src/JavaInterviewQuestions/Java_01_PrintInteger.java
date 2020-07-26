package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_01_PrintInteger {

	public static void main(String[] args) {
		
		//Question: Print an integer getting input from user
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		System.out.println("You entered "+ num);

	}

}
