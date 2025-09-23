import java.util.Scanner;
abstract class Shape{  // Abstraction(method area should override in all child class)
    abstract void area();
}
    
class Circle extends Shape{  //Inheritance
    private double radius;  // Encapsulation 
    
    public Circle(double radius)  //Constructor
    {
       this.radius = radius;
    }
    
@Override
    void area(){  //Polymorphism
       double result = 3.14 * radius * radius;
       System.out.println("Area of Circle = "+result);
       }
}  

class Rectangle extends Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length,double breadth)
    {
       this.length = length;
       this.breadth = breadth;
    }
    
    void area(){
    double result = length * breadth;
    System.out.println("Area of Rectangle = "+result);
    }
}    

class ShapeTest{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle : ");
        double r = scan.nextDouble();
        Circle c1 = new Circle(r);
        
        System.out.print("Enter the Length of Rectangle : ");
        double l = scan.nextDouble();
        System.out.print("Enter the Breadth of the Rectangle : ");
        double b = scan.nextDouble();
        Rectangle r1 = new Rectangle(l,b);
        
        c1.area();
        r1.area();
   scan.close();
   }
 }
    
    

