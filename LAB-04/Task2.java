
package task2;

class Library {
    String bookName;
    String authorName;
    int quantity;
    Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    void issueBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Book issued: " + bookName);
        } else {
            System.out.println("Sorry, book not available.");
        }
    }
    void returnBook() {
        quantity++;
        System.out.println("Book returned: " + bookName);
    }
    void display() {
        System.out.println("Book: " + bookName + ", Author: " + authorName + ", Quantity: " + quantity);
}
}
public class Task2 {
    public static void main(String[] args) {
        Library b1 = new Library("Java Programming", "James Gosling", 3);
        Library b2 = new Library("Python Basics", "Guido van Rossum", 2);
        Library b3 = new Library("C++ Fundamentals", "Bjarne Stroustrup", 1);
        b1.display();
        b2.display();
        b3.display();
        b1.issueBook();
        b1.display();
        b1.returnBook();
        b1.display();
    }
}
