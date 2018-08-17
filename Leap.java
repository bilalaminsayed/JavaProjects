//Bilal Sayed 9/18/18 Assignment 5
public class Leap {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		boolean leapYear = false;
		
		if (i % 4 == 0) {
			
			if (i % 100 == 0) {	
				
				if (i % 400 == 0) 
					leapYear = true;
				else
					leapYear = false;
			}
			else
				leapYear = true;
		}
		else
			leapYear = false;
		
		if (leapYear)
			System.out.println("leap year!");
		else
			System.out.println("not a leap year!");
	}
	
}
