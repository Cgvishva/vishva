 import java.util.Scanner;
class Lar{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     System.out.println("size?");
     int size = scan.nextInt();
     int[] arr = new int[size];
     System.out.println("Enter numbers");
     for(int i=0;i<size;i++){
     arr[i] = scan.nextInt();}
      int max = arr[0];
     for(int i=0;i<arr.length;i++){
     if(arr[i]<max){
    System.out.println(max);}
}
}
}
