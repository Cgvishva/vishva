class User{
	String name;
  int id;
	
	public User(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void borrow() {
		System.out.println(getName()+"borrowing a book");
	}
}

class Student extends User{
	
	public Student(String name,int id) {
		super(name,id);
	}
	
	public void borrow() {
		System.out.println("For Student Borrowing Books is Allowed For 7 days...");
	}
}

class Teacher extends User{
	
	public Teacher(String name,int id) {
		super(name,id);
	}
	
	public void borrow() {
		System.out.println("For Teacher borrowing Book is Allowed for 30 Days...");
	}
}
public class MiniLibrary {
    public static void main(String[]args) {
        
    	User s1 = new Student("Vishva",178);
    	User t1 = new Teacher("Sundar",190);
    	
    	System.out.println("Name of the Student : "+s1.name);
    	System.out.println("ID : "+s1.id);
    	s1.borrow();
    System.out.println("Name of the Teacher : "+t1.name);
    System.out.println("ID : "+t1.id);
    t1.borrow();
    
    }
}
