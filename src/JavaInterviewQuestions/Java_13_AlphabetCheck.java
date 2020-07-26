package JavaInterviewQuestions;

public class Java_13_AlphabetCheck {

	public static void main(String[] args) {
		
		char c = '$';
		
		if((c >= 'a' && c <='z') ||(c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is in alphabet");
		}else {
			System.out.println(c + " is in not alphabet");
		}

	}

}
