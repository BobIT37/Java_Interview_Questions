package JavaInterviewQuestions;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_36_LargestNumberInArrayUsingCollections {

	public static void main(String[] args) {
		
		Integer x[] = {4,3,5,76,89};
		System.out.println(getLargest(x, 4)); // 4 is index number. If you have more index you have to change value

	}

	public static int getLargest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(total-1);  
		return element;  
	}  

}
