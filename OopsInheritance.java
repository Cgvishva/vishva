import java.util.Scanner;
class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	int rollNumber;
	String course;
	
	Student(String name,int age,int rollNumber,String course){
		super(name,age);
		this.rollNumber = rollNumber;
		this.course = course;
	}
	
	void disp() {
		System.out.println("---Student Details---");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Roll Number :"+rollNumber);
		System.out.println("Course : "+course);
	}
}

public class OopsInheritance {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
                System.out.print("Enter the Student Name : ");
                String NAME = scan.nextLine();
                System.out.print("Enter the Student Age : ");
                int AGE = scan.nextInt();
                System.out.print("Enter the Student Roll Number : ");
                int ROLLNUM = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the Student Course : ");
                String COURSE = scan.nextLine();
                Student s1 = new Student(NAME,AGE,ROLLNUM,COURSE);
	    
		s1.disp();
	}

}
