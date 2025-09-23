import java.util.Scanner;
class Drome{

    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a String");
    String name = scan.nextLine();
    String rev = "";

    for(int i=name.length()-1;i>=0;i--){
    rev=rev+name.charAt(i);
}

if(rev.equals(name))
    {
     System.out.println("It is palindrome");
    }
    else{
     System.out.println("It is not a palindrome");
        }

}
} 

