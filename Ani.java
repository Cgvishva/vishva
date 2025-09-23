class Animals{
       void eat()
    {
      System.out.println("This can eat");
    }
}

class Dog extends Animals{
       void barks()
   {
     System.out.println("Barks");
   }
}

public class Ani{
      public static void main(String[]args){

     Dog d1 = new Dog();
     d1.barks();
     d1.eat();
}
}
