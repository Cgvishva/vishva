import java.util.Scanner;
class Check{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Name(String)");
     String name = scan.next();

   if(name.equals("java")){
     System.out.println("The String contains java");
       }
   else{
     System.out.println("The String dose not contain java");
       }
}
}

