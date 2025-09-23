import java.util.Scanner;

class Student{

    String name;
    int m1,m2,m3,m4,m5;
    double average;
    String grade;

    void input(Scanner scan){
     System.out.println("Enter student name");
     name = scan.nextLine();

    System.out.println("Enter mark 1");
    m1 = scan.nextInt();

    System.out.println("Enter mark 2");
    m2 = scan.nextInt();

    System.out.println("Enter mark 3");
    m3 = scan.nextInt();

    System.out.println("Enter mark 4");
    m4 = scan.nextInt();

    System.out.println("Enter mark 5");
    m5 = scan.nextInt();
}

    void average(){
       average = (m1+m2+m3+m4+m5)/5;
}

   void grade(){
      if(average>=90)
        grade = "A+";

      else if(average>=80)
        grade = "A";

      else if(average>=70)
        grade = "B";

      else if(average>=50)
        grade = "C";

      else if (average>=35)
        grade = "D"; 

       else
        grade = "Fail";
}



    void display(){
    System.out.println("About Student:");
    System.out.println("Name :"+name);
    System.out.println("Average :"+average);
    System.out.println("Grade :"+grade);
    }


}

class StudentAvg{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
   Student s1 = new Student();

   s1.input(scan);
   s1.average();
   s1.grade();
   s1.display();
   }
}
