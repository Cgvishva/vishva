import java.util.Scanner;
class Division{
	
	int result;
	
	void divideNumbers(int a,int b) {
		
		try {
			result = a/b;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception,Cannot Divided by Zero");
		}
       if( b!=0){
          System.out.println("Final Result : "+result); 
           System.out.println("Program Ended");
                   }
}
	
}


public class DivisionExample {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
                System.out.print("Enter the Numarator : ");
                int n1 = scan.nextInt();
                System.out.print("Enter the Denominator : ");
                int n2 = scan. nextInt();
        	Division d1 = new Division();
		d1.divideNumbers(n1,n2);
	   
}

}
