package logicalLearning;
import java.util.Scanner;
public class ReverseAnInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Numbers to Reverse : ");
		int n = scan.nextInt();
		
		String rem = "";
		
		while(n>0)
		{
			rem = rem+n%10;
			
			n=n/10;
			
		}
		
		System.out.println(rem);

	}

}
