import java.util.Scanner;
class Hund{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a Number between 1-100");
     int num = scan.nextInt();

     if(num>=1 && num<=50)
      {
       System.out.println("The number is in the Lower half");
      }
     else if(num>=51 && num<=100)
      {
       System.out.println("The number is in upper half");
      }
    else{
       System.out.println("Invalid Number");
        }
}
}
