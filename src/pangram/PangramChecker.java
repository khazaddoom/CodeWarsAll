package pangram;

public class PangramChecker {
	
	public static void main(String[] args) {
		
		System.out.println(check("The quick brown fox jumps over the lazy dog."));
		
		System.out.println(check("You shall not pass!"));
		
	}
	
	public static boolean check(String sentence) {
		
		String ref = "abcdefghijklmnopqrstuvwxyz";
		
		sentence = sentence.trim();
		
		sentence = sentence.toLowerCase();
		
		char[] charsRef = ref.toCharArray();
		
		for (int i = 0; i < charsRef.length; i++) {
			
			if (sentence.indexOf(charsRef[i]) == -1) return false;
			
		}
		
		
		return true;
	}
	

}
