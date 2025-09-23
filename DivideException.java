
import java.util.Scanner;
class DivideException{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
    try{
        System.out.print("Enter the Numerator : ");
        int num = scan.nextInt();

        System.out.print("Enter the denominator : ");
        int den = scan.nextInt();

        int result = num/den;
        System.out.println("Result : "+result);
       }

    catch(ArithmeticException e){
        System.out.println("Error,Please Enter Valid Numbers");
       }

    finally{
        System.out.println("Program Ended !");
       }
    }
}
