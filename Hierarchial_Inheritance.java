class A{
    void office(){
        System.out.println("Going to Office");
    }
}

class B extends A{
    void office(){
        System.out.println("Leaving the Office");
    }
}

class C extends A{
    void office(){
        System.out.println("THis is Hierarchial Inheritance!!!");
    }
}
public class Hierarchial_Inheritance {
   public static void main(String[] args) {
       C c1 = new C();
       c1.office();
   }
}
