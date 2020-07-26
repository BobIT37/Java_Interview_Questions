package JavaInterviewQuestions;

public class Java_08_AlphabetVowelOrConsonant {

	public static void main(String[] args) {
		
      //Question: Check whether an alphabet is Vowel or Consonant
		// a e i o u
		
		char ch = 'c';
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		}
		else {
			System.out.println(ch + " is consonant");
		}
		
		//Second way
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;

		default:
			System.out.println(ch + " is consonant");
			break;
		}

	}

}
