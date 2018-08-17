//Bilal Sayed 6/16/18 Assignment 3
import java.util.Scanner;

public class TelephoneNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" Enter 10-digit telephone number:");

		String n =sc.next();
		
		System.out.println("You entered " + n);
		
		System.out.println("The area code is " + n.substring(0,3));
		
		System.out.println("The exchange is " + n.substring(3,6));
		
		System.out.println("The number is " + n.substring(6,10));
		
		System.out.println("The complete telephone number is ("  + n.substring(0,3) + 
				") " + n.substring(3,6) + "-" + n.substring(6,10));
	}

}
