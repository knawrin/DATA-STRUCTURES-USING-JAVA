import java.util.Scanner;
class RecursionArmstrong
{
   int number, sum;
   RecursionArmstrong(int num1)
   {
      number = num1;
      sum = 0;
   }
   long powerOf(int a, int b)
   {
      if(b == 0)
      {
         return 1;
      }
      else
      {
         return a * powerOf(a, b - 1);
      }
   }
   void executePowerOf()
   {
      int d = number, r;
      long total = (long)sum;
      while(d > 0)
      {
         r = d % 10;
         d = d / 10;
         total = total + powerOf(r, 3);
      }
      if(number == total)
      {
         System.out.println("Given number is Armstrong number.");
      }
      else
      {
         System.out.println("Not an Armstrong number.");
      }
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the number: ");
      int num = sc.nextInt();
      RecursionArmstrong obj = new RecursionArmstrong(num);
      obj.executePowerOf();
      sc.close();
   }
}


