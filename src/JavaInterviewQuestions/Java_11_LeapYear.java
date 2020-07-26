package JavaInterviewQuestions;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year
		
		
		int year = 1900;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		} else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
