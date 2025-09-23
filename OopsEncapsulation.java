class Employee{
    private String name;
    private int id;
    private double salary;

    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

    public double getSalary() {
    	return salary;
    }

    public void setSalary(double salary) {
    	this.salary = salary;
    }
}

public class OopsEncapsulation {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setName("Vishva CG");
		e1.setId(1033);
		e1.setSalary(100000);

		System.out.println("Name : "+e1.getName());
		System.out.println("ID : "+e1.getId());
		System.out.println("Salary : "+e1.getSalary());
	}

}

