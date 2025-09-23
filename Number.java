import java.util.Scanner;
class Number{
   public static void main(String[]args)
    {
   Scanner scan = new Scanner(System.in);
 {
   System.out.println("Enter your Salary");
 }
 int salary = scan.nextInt();
 { 
 System.out.println("Enter your age");
 }
  int age = scan.nextInt();
 if(salary>=20000 || age=>18)
  {
   System.out.println("Eligible for loan");
System.out.println("How much loan do you want ");
  int loan = scan.nextInt();
if(loan<=50000)
  { 
    System.out.println("Loan Available");
  }
  }
  else{
    System.out.println("Loan Not Available");
      }

}
}
