package logicalLearning;
import java.util.Scanner;
public class BinaryConvention {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Number : ");
	    int input = scan.nextInt();
	    
	    int rem = 0;
	    String res = "";
	    
	    while(input !=0) 
	    {
	    	rem =input%2;
	    	res = rem+res;
	    	input = input/2;
	    }
	    
	    System.out.println(res);
	}
}
