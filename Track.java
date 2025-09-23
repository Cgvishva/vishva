import java.util.Scanner;
import java.util.Random;
class Track{
    public static void main(String[]args){
    Random rand = new Random();
    int secret=rand.nextInt(100)+1;
 
    Scanner scan = new Scanner(System.in);
  
int number;
boolean guess=false;

while(!guess){
System.out.println("Enter your guess");
number=scan.nextInt();

   if(number<secret)
   {
    System.out.println("Your guess is too low");
   }
   else if(number>secret)
   {
    System.out.println("Your guess is too high");
   }
else{
System.out.println("your guess correct");
guess=true;
}

}

}
} 
