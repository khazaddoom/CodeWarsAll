package phonenumber;

public class PhoneNumberFortmatter {
	
	public static String format(int[] numbers) {
		
		//load the resultant string with the format you need!
		String phoneNumber = new String("+91 xxxxxxxxxx"); 
		//new String("(xxx) xxx-xxxx");
	    
	    for (int i : numbers) {
	      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
	    }
	    
	    return phoneNumber;
	  }
	
	public static void main(String[] args) {
		
		int[] values = {9, 1, 0, 8, 7, 7, 6, 6, 2, 8};
		
		System.out.println(format(values));
		
	}

}
