import java.util.Scanner;
class Grade{
    public static void main(String[]args){

     Scanner scan = new Scanner(System.in);

     System.out.println("Enter Student name");
     String name = scan.nextLine();

     System.out.println("Enter the class of the student");
     int clas = scan.nextInt();

     int[] marks = new int[5];
     int total = 0;
