//Bilal Sayed 6/21/18 Assignment 6
public class Say {

	static String numbers[] =
	    {
	        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
	        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", 
	        "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five"
	    };
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		
		if((i > 25) || (i < 0)) {
			System.out.println("Only numbers between 0 and 25");
		}
		else
		System.out.println(numbers[i]);
	}

}
