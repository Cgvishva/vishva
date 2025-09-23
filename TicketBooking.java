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
    	System.out.println("Total Numer of Seats Booked : "+howmany);
    	System.out.println("Travel Date : "+date+"/"+month+"/"+year);
        System.out.println("Booking Status : SuccesFull !!!");
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
}

public class TicketBooking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = scan.nextLine();

		System.out.print("Ente your Age : ");
		int age = scan.nextInt();

		scan.nextLine();

		System.out.print("From : ");
		String from = scan.nextLine();

		System.out.print("To : ");
		String to = scan.nextLine();

		int howmany;
		do {
		System.out.print("How many Seats do you want (Available 10) : ");
	    howmany = scan.nextInt();
		if(howmany>10) {
			System.out.println("Seats are UnAvailable,please enter min amount of seats");
		}
		}
		while(howmany>10);
		System.out.println("ok done");

		int date;
		do {
		System.out.print("Enter your Travel Date : ");
		date = scan.nextInt();

		if(date<0 || date>31) {
			System.out.println("Invalid Date,Please try again");
		}
		}
		while(date<0 || date>31);
		System.out.println("ok Done");

		scan.nextLine();

		int month;
		do {
		System.out.print("Month(In Numbers) : ");
		month = scan.nextInt();

		if(month<0 || month>12) {
		System.out.println("Invalid month,please try again");
		}
		}
		while(month<0 || month>12);
		System.out.println("ok done");

		System.out.print("Year : ");
		int year=scan.nextInt();

		Ticket t1 = new Ticket(name,age,from,to,howmany,date,month,year);
		t1.disp();

		scan.close();


	}

}

