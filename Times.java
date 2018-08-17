
public class Times {
	
	 static String leftText( String s , int newLen )
	    {
	        while ( s.length() < newLen )
	        {
	            s = " " + s;
	        }
	        return s ;
	    }

	public static void main(String[] args) {
		
		System.out.print("    ");
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(leftText(String.valueOf(i), 4));
		}
		
		System.out.print("\n");
		
		for (int i = 0; i <= 9; i++) {
	         
			System.out.print(leftText(String.valueOf(i), 4));
			
	         for (int j = 0; j <= 9; j++) {
	        	 
	            System.out.print(leftText(String.valueOf(i*j), 4));
	         }
	         System.out.println();
	      }
	   
	}

}
