import java.util.InputMismatchException;
import java.util.Scanner;
class Ticket{
	private String name;
	private int age;
	private String from;
	private String to;
	private int howmany;
	private int date;
	public int month;
	public int year;
	private final int priceperseat = 250;

	Ticket(String name,int age,String from,String to,int howmany,int date,int month,int year)
	{
		this.name = name;
		this.age = age;
		this.from = from;
		this.to = to;
		this.howmany = howmany;
		this.date = date;
		this.month=month;
		this.year=year;
	}

    public void disp()
    {
    	System.out.println("------Your Details------");
    	System.out.println("Name : "+name);
    	System.out.println("Age : "+age);
    	System.out.println("From : "+from);
    	System.out.println("To : "+to);
    	System.out.println("Total Number of Seats Booked : "+howmany);
    	System.out.println("Travel Date : "+date+"/"+month+"/"+year);
    	System.out.println("Total Fare ₹: "+(howmany*priceperseat));
        System.out.println("Booking Status : SuccessFull !!!");
    }

    public String getName() {
    	return name;
    }

    public int getAge() {
    	return age;
    }

    public String getFrom() {
    	return from;
    }

    public String getTo() {
    	return to;
    }

    public int getHowmany() {
    	return howmany;
    }

    public int getDate() {
    	return date;
    }
    
    public int getPrice() {
    	return priceperseat;
    }
}

public class TicketBooking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = scan.nextLine();
		
		
		int age=0;
		do{
			try {
		System.out.print("Ente your Age : ");
		age = scan.nextInt();
		scan.nextLine();
		
		if(age==0 || age>200){
        System.out.println("Invalid Age,Please try Again");			
		}
        }
		
			catch(InputMismatchException e) {
			System.out.println("Enter valid age in number");
			scan.nextLine();
			age = 0;
		}
		}
		
        while(age==0 || age>200);
           
		System.out.print("From : ");
	    String from = scan.nextLine();

		System.out.print("To : ");
		String to = scan.nextLine();
        
		int howmany=0;
		do {
			try {
		System.out.print("How many Seats do you want (Available 10) : ");
	    howmany = scan.nextInt();
	    
		if(howmany>10 || howmany<1) {
			System.out.println("Unavailable seats,please enter min amount of seats");
		}
		}
			catch(InputMismatchException e) {
				System.out.println("Enter valid Digits");
                
				scan.nextLine();
				howmany = 0;
			}
		}
		while(howmany>10 || howmany<1);
		
		int date=1;
		do {
			try {
		System.out.print("Enter your Travel Date : ");
		date = scan.nextInt();

		if(date<1 || date>31) {
			System.out.println("Invalid Date,Please try again");
		}
		}
			
		catch(InputMismatchException e) {
			System.out.println("Enter valid Digit");
			scan.nextLine();
			date = 0;
			}
		}
		
		while(date<1 || date>31);
		
		scan.nextLine();

		int month = 1;
		do {
			try {
		System.out.print("Month(In Numbers) : ");
		month = scan.nextInt();

		if(month<1 || month>12) {
		System.out.println("Invalid month,please try again");
		}
		}
			
		catch(InputMismatchException e) {
			System.out.println("Enter valid Digit");
			scan.nextLine();
			month = 0;
			}
		}
		while(month<1 || month>12);
		
		int year=1;
		do{
		try{
		System.out.print("Year : ");
	    year=scan.nextInt();
		
		if(year<2025) {
			System.out.println("Invalid year,Please select the Valid year");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter valid Digits");
			scan.nextLine();
			year = 0;
		}
		}
		
		while(year<2025);
		System.out.println("OK Done");

		Ticket t1 = new Ticket(name,age,from,to,howmany,date,month,year);
		t1.disp();
	

		scan.close();


		}

}

