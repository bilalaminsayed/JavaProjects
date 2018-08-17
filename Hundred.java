//Bilal Sayed 6/11/18 Assignment 2
public class Hundred
{ 
	public static void main( String[] args ) 
	{ 	
		if ( args.length == 0 )
       		{
     			System.out.println( "No argument entered" );
       		}
    		else
       		{
			for( int i = 0; i <= 100; i++ )
			{
        	   	System.out.print( args[0] + " ");
			}
      		}
	}
}

	