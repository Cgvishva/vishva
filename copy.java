import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter date: ");
        int date = sc.nextInt();

        // Month offset array
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        // Adjust year if month is Jan or Feb
        if (month < 3) {
            year = year - 1;
        }

        // Calculate day index (0=Sunday ... 6=Saturday)
        int dayIndex = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + date) % 7;

        // Weekday names
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Print output with corrected year for Jan/Feb
        System.out.println("\nSelected Date: " + date + "-" + month + "-" + (month < 3 ? year + 1 : year));
        System.out.println("Day of the Week: " + weekDays[dayIndex]);

        sc.close();
    }
}

