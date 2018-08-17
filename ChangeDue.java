//Bilal Sayed Project 2 7/2/18
import java.util.Scanner; 
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

public class ChangeDue {

		public static void changeFinder(BigDecimal amntLeft ) {
			
			BigDecimal amntChange = amntLeft;
			
			int hundreds = 0;
			int fifties = 0;
			int twenties = 0;
			int tens = 0;
			int fives = 0;
			int ones = 0;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			
			BigDecimal hundredDollars = new BigDecimal(100.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal fiftyDollars = new BigDecimal(50.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal twentyDollars = new BigDecimal(20.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal tenDollars = new BigDecimal(10.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal fiveDollars = new BigDecimal(5.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal oneDollar = new BigDecimal(1.00, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal twentyfiveCents = new BigDecimal(0.25, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal tenCents = new BigDecimal(0.10, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal fiveCents = new BigDecimal(0.05, new MathContext(1, RoundingMode.HALF_EVEN));
			BigDecimal oneCent = new BigDecimal(0.01, new MathContext(1, RoundingMode.HALF_EVEN));
			
			if (amntLeft.compareTo(hundredDollars)> 0) {	
				hundreds = amntLeft.divide(hundredDollars).intValue();
				amntLeft = amntLeft.remainder(hundredDollars);
			}
			if (amntLeft.compareTo(fiftyDollars)> 0) {	
				fifties = amntLeft.divide(fiftyDollars).intValue();
				amntLeft = amntLeft.remainder(fiftyDollars);
			}
			if (amntLeft.compareTo(twentyDollars)> 0) {	
				twenties = amntLeft.divide(twentyDollars).intValue();
				amntLeft = amntLeft.remainder(twentyDollars);
			}
			if (amntLeft.compareTo(tenDollars)> 0) {	
				tens = amntLeft.divide(tenDollars).intValue();
				amntLeft = amntLeft.remainder(tenDollars);
			}
			if (amntLeft.compareTo(fiveDollars)> 0) {	
				fives = amntLeft.divide(fiveDollars).intValue();
				amntLeft = amntLeft.remainder(fiveDollars);
			}
			if (amntLeft.compareTo(oneDollar)> 0) {	
				ones = amntLeft.divide(oneDollar).intValue();
				amntLeft = amntLeft.remainder(oneDollar);
			}
			if (amntLeft.compareTo(twentyfiveCents)> 0) {	
				quarters = amntLeft.divide(twentyfiveCents).intValue();
				amntLeft = amntLeft.remainder(twentyfiveCents);
			}
			if (amntLeft.compareTo(tenCents)> 0) {	
				dimes = amntLeft.divide(tenCents).intValue();
				amntLeft = amntLeft.remainder(tenCents);
			}
			if (amntLeft.compareTo(fiveCents)> 0) {	
				nickels = amntLeft.divide(fiveCents).intValue();
				amntLeft = amntLeft.remainder(fiveCents);
			}
			if (amntLeft.compareTo(oneCent)> 0) {	
				pennies = amntLeft.divide(oneCent).intValue();
				amntLeft = amntLeft.remainder(oneCent);
			}
			
			System.out.println("Your change is $" + amntChange + " which is ");
			System.out.println("-----------------------------");
			System.out.println("Hundreds: " + hundreds);
			System.out.println("Fifties: " + fifties);
			System.out.println("Twenties: " + twenties);
			System.out.println("Tens: " + tens);
			System.out.println("Fives: " + fives);
			System.out.println("Ones: " + ones);
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			
		}
		
		public static void main(String[] args) {
			int again;
			BigDecimal amtDue;
			BigDecimal amtTendered;
			Scanner scan = new Scanner(System.in);
			do {
				do {
				    System.out.println("Enter amount due: ");
				    while (!scan.hasNextBigDecimal()) {
				        System.out.println("That's not a number!");
				        scan.next();
				    }
				    amtDue = scan.nextBigDecimal();
				} while (amtDue.compareTo(BigDecimal.ZERO)<= 0);
				
				do {
				    System.out.println("Enter amount tendered: ");
				    while (!scan.hasNextBigDecimal()) {
				        System.out.println("That's not a number!");
				        scan.next();
				    }
				    amtTendered = scan.nextBigDecimal();
				} while (amtTendered.compareTo(BigDecimal.ZERO)<= 0);
				
				BigDecimal amntChange = amtTendered.subtract(amtDue);
				
				changeFinder(amntChange);
				
				System.out.println("Calculate another transaction? Type 1 for yes or 2 for no");
				again = scan.nextInt();
			
			} while(again == 1);
			scan.close();
	}
}