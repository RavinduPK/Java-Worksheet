package LW_05;
import java.util.Scanner;

import java.util.ArrayList;

// Abstract class for Borrowable Items
abstract class BorrowableItems {
    public abstract void displayInfo();
}

// Book class that inherits from BorrowableItems
class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true; // default: available
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    // Implement abstract method
    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

// Person class
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// Student class inherits from Person
class Student extends Person {
    public Student(String name) {
        super(name);
    }
}

// Library class
class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    // Add library item
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // Checkout item by title
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Checked out: " + book.getTitle());
                    } else {
                        System.out.println(book.getTitle() + " is already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println("Item not found.");
    }

    // List all available items
    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    // Display library info
    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                if (((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("Total items in library: " + borrowableItemsList.size());
        System.out.println("Available items: " + availableCount);
        System.out.println("---------------------------");
    }
}

// Main class to test the library system
public class Q1 {
    public static void main(String[] args) {
        // Create book instances
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        // Create library instance
        Library library = new Library();

        // Add books to library
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        // Display library info
        library.displayLibraryInfo();

        // List available items
        library.listAvailableItems();

        // Checkout a book
        library.checkoutItem("Island of a Thousand Mirrors");

        // List available items again
        library.listAvailableItems();
    }
}







