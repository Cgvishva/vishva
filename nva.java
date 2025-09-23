import java.util.Scanner;
class nva{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     System.out.println("How many numbers do you want to enter?");
     int a = scan.nextInt();
int check=0;
     for(int i=0;i<a;i++)
   { 
    System.out.println("Enter ur numbers");
     int v = scan.nextInt();
    check+=v;
}

int result=check/a;

System.out.println("AVERAGE:"+result);

}
}


