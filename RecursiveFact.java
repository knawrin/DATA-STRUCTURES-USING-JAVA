public class RecursiveFact {
	
	static int factorial(int num) {
		
		
		
		if(num<2)
			return 1;
		
		
		
		return num*factorial(num-1);
	}

	public static void main(String[] args) {
		
			int recur = factorial(5);
			System.out.println(recur);
	}

}