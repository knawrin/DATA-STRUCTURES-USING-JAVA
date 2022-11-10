
import java.io.*;

class Star4
{
	
	static void printPatternRowRecur(int n)
	{
		
		if (n < 1)
			return;
			
		
		System.out.print( "* ");
		printPatternRowRecur(n - 1);
	}
	
	static void printPatternRecur(int n)
	{
		
		if (n < 1)
			return;
		
		printPatternRowRecur(n);
		
		
		System.out.println ();
		
		printPatternRecur(n - 1);
		
	}

	public static void main (String[] args)
	{
		int n = 5;
		printPatternRecur(n);
		
	}
}
