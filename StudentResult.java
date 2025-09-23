import java.util.Scanner;
abstract class Person{  //Abstraction
    abstract void disp();
}

class Student extends Person{  //Inheritance
    private String name;  
    private int rollNum;
    
    public Student(String name,int rollNum){ //Constructor
        this.name = name;
        this.rollNum = rollNum;
        }
        
        public String getName(){  //Encapsulation
            return name;
        }
        
        public int getrollNum(){
            return rollNum;
        }
        //  @Override
        void disp() //Polymorphism
        {
            System.out.println("Name : "+name);
            System.out.println("RollNumber : "+rollNum);
        }
}

class Result extends Student{
    private int mark1,mark2,mark3,mark4,mark5;
    
    public Result(String name,int rollNum,int mark1,int mark2,int mark3,int mark4,int mark5){
        super(name,rollNum);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        }
    
    void disp(){
       super.disp();
       int total = mark1 + mark2 + mark3 + mark4 + mark5;
       double avg = total/5;
       System.out.println("Mark 1 : "+mark1);
       System.out.println("Mark 2 : "+mark2);
       System.out.println("Mark 3 : "+mark3);
       System.out.println("Mark 4 : "+mark4);
       System.out.println("Mark 5 : "+mark5);
       System.out.println("Total Marks : "+total+"/500");
       System.out.println("Average : "+avg);
       }
}       
        
class StudentResult {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name of the Student : ");
        String name = scan.nextLine();
        
        System.out.print("Enter Roll Number : ");
        int roll = scan.nextInt();
        
        System.out.print("Enter Mark 1 : ");
        int m1 = scan.nextInt();
        
        System.out.print("Enter mark 2 : ");
        int m2 = scan.nextInt();
        
        System.out.print("Enter mark 3 : ");
        int m3 = scan.nextInt();
        
        System.out.print("Enter mark 4 : ");
        int m4 = scan.nextInt();
        
        System.out.print("Enter mark 5 : ");
        int m5 = scan.nextInt();
        
        Result r1 = new Result(name,roll,m1,m2,m3,m4,m5);
        System.out.println("-----Student Details-----");
        r1.disp();
    }
}    
