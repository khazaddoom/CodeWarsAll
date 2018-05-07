package movieClerk;

import java.util.Arrays;

public class Clerk {
	
	public static void main(String[] args) {
		
		
		System.out.println(changeIssuePossible(new int[] {25, 25, 25, 25, 50, 100, 50}));
		
		
	}

	private static String changeIssuePossible(int[] peopleInLine) {
		
		System.out.println(Arrays.toString(peopleInLine));
		
		
		int ticketPrice = 25;
		
		int cashAvailable = 0;
		
		
		for (int cashNote : peopleInLine) {
			
			
			if(cashNote == ticketPrice) {
				
				cashAvailable += cashNote;
				
			}
			
			else if(cashNote > ticketPrice && (cashNote - ticketPrice) <= cashAvailable) {
				cashAvailable += ticketPrice;
				cashAvailable -= (cashNote - ticketPrice);
				
				
			} else 
				
				return "NO";

		}
		
		
		return "YES";
	}

}
