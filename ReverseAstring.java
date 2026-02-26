package logicalLearning;
import java.util.Scanner;
public class ReverseAstring {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to Reverse : ");
		String a = scan.nextLine();
		
		String rev = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev = rev+a.charAt(i);
		}
		System.out.println(rev);
	}
}
