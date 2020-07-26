package JavaInterviewQuestions;

import java.time.Year;

public class Java_32_StepsReverse {

	public static void main(String[] args) {
		
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		for(int x = 0; x<=6; x++) {
			for(int y=5; y>x; y--) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
