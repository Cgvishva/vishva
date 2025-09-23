class  Animal{ 
     String name;
     int age;

    void makeSound()
  { 
   System.out.println("Animal makes a sound");
  }
}
class dog extends Animal{
     String breed;

    void makeSound()
{
   System.out.println("Dog barks"); 
   }
    void fetch()
{
   System.out.println("Dog is fetching");
}
}
class cat extends Animal{

      String color;

      void makeSound()
{
   System.out.println("Cat meows");
}
     void climb()
{
    System.out.println("Cat is Climbing");
}
}
public class Inh{
       public static void main(String[]args){

       dog d1 = new dog();
       d1.name = "Guddu";
       d1.age = 6;
       d1.breed = "German";
       d1.makeSound();
       d1.fetch();

       cat c1 = new cat();
       c1.name = "Tap";
       c1.age = 7;
       c1.color = "white";
       c1.makeSound();
       c1.climb();
}
}

