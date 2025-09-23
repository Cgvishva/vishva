import java.util.Scanner;
class Mark{
    public static void main(String[]args)
    {
     Scanner scan = new Scanner(System.in);
     int s1 = scan.nextInt();
     int s2 = scan.nextInt();
     int s3 = scan.nextInt();
     int s4 = scan.nextInt();
     int s5 = scan.nextInt();

     int totalMark = (s1+s2+s3+s4+s5);
     int avg = (totalMark/5);

     if(avg<35)
     {
      System.out.println("Need To Improve");
     }
     else{
      System.out.println("Good Job");
         }
}
}

