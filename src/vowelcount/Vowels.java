package vowelcount;

public class Vowels {
	
	public static void main(String[] args) {
		
		System.out.println(getCount("aeiou"));
		
		
	}
	
	 public static int getCount(String str) {
	    int vowelsCount = 0;
	    // your code here
	    
	   char[] charArray = str.toCharArray();
	   
	   for (int i = 0; i < charArray.length; i++) {
		   char c = charArray[i];
		   switch (c) {
		   
			   case 'a':
					vowelsCount++;
					break;
				case 'e':
					vowelsCount++;
					break;
				case 'i':
					vowelsCount++;		
					break;
				case 'o':
					vowelsCount++;
					break;
				case 'u':
					vowelsCount++;
					break;
				default:
					break;				
		   }
		
	   }
	    
	    return vowelsCount;
	}


}
