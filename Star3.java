/*   
    * 
   * * 
  * * * 
 * * * * 
* * * * *
*/

class Star3
{
	

static void print_row(int no, int val)
{
	
	if (no == 0)
		return;
	System.out.print(val + " ");

	print_row(no - 1, val);
}

static void pattern(int n, int num)
{
	
	if (n == 0)
		return;
	print_row(num - n + 1, num - n + 1);
	System.out.println();

	pattern(n - 1, num);
}


public static void main(String[] args)
{
	int n = 5;
	pattern(n, n);
}
}


