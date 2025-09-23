import java.util.Scanner;

// 🔹 Abstraction
abstract class LibraryItem {
    abstract void displayInfo();
}

// 🔹 Encapsulation + Inheritance
class Book extends LibraryItem {
    private String title;
    private String author;
    private int bookId;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    // 🔹 Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("------------------------");
    }
}

// 🔹 Main class
public class BookDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many books you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        LibraryItem[] books = new LibraryItem[n];

        // Add books
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine(); // Consume newline

            books[i] = new Book(title, author, bookId);  // Polymorphism
        }

        // Display books
        System.out.println("\n--- Library Book List ---");
        for (LibraryItem book : books) {
            book.displayInfo();  // Polymorphic call
        }

        sc.close();
    }
}

