class A{
    void method(){
        System.out.println("This metho is Empty !!!");
    }
}

class B extends A{
    void method(){
        System.out.println("THis is Also empty !!!");
    }
}

class C extends A{
    
}

class D extends C{
    void method(){
        System.out.println("This method also Have some Contents ...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.method();

        D d1 = new D();
        d1.method();
    }
}
