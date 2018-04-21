package stringsorter;

public class Main {
		
	//our task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

	//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
	
	//If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
	
	//For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
		
	public static void main(String[] args) {
		
		System.out.println(Order.order("is2 Thi1s T4est 3a"));
		
		System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));


		
		
	}

}
