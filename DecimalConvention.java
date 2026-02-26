package logicalLearning;
import java.util.Scanner;
public class DecimalConvention {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Binary Number :");
		int num = scan.nextInt();
		
		int res = 0;
		int n =0;
		int rem = 0;
		
		while(num>0)
		{
		    rem = num % 2;	
			res+=rem*Math.pow(2, n);
			num = num/10;
			n++;
		}
		System.out.println(res);
	}

}
