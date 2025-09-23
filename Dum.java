class Animal{
	String name;
	int age;
	
	Animal(String name,int age)
	{
	   	this.name = name;
	   	this.age = age;
	}
    public void disp()
    {
    	System.out.println(name);
    	System.out.println(age);
    }
}

class Cat extends Animal{
	String colour;
	
	Cat(String name,int age,String colour)
	{
		super(name,age);
		this.colour = colour;
	}

    public void dispInfo()
    {
    	
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(colour);
    }
}

public class Dum {
     public static void main(String[] args) {
		Animal a1 = new Animal("Lion",7);
		a1.disp();
		
		Cat c1 = new Cat("Blackey",5,"Black");
		c1.dispInfo();
	}
}
