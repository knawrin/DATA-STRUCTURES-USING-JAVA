

public class ArmStrongNumber_1toN {

	public static int isArmstrong(int num , int dig) {
		if(num==0) {
			return 0;
		}
		
		int rem = num%10;
		int ans = isArmstrong(num/10,dig);
		ans+=Math.pow(rem, dig);
		
		return ans ; 
	}
	

	static int countDigit(int num ,int count) {
		if(num==0) {

			return count;
		}
		return countDigit(num/10,count+1);
	}
	
	public static void ArmStrongNumber_1toN(int st,int end) {
		if(st>end) {
			return;
		}
		int dig = countDigit(st,0);
		int temp = isArmstrong(st,dig);
		if(st==temp) {
			System.out.println("Arm no : "+temp);
		}
		
		ArmStrongNum1toN(st+1,end);
		
	}
	
	public static void ArmStrongNumber1tonUsingLoop(int st,int end) {
		int total =0 ;
	  for(int i=st;i<=end;i++) {
			int dig = countDigit(i,0);
			int temp = isArmstrong(i,dig);
			if(i==temp) {
				System.out.println("Arm no : "+temp);
				total++;
			
			 }
		}
	  System.out.println("total no : "+total);
		
	}
	
	
	public static void main(String[] args) {
		
		
		ArmStrongNum1toN(1,4000);
		

	}

}