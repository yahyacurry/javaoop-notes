package Library2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }
    public void addBook(String title, String author, String publisher){
        books.add(new Book(title, author, publisher));
        System.out.println("Book added: " + title + " by: " + author + " Publisher: "  + publisher);
    }
    public void borrowBooks(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void display() {
        System.out.println("\nCurrent Library Books");
        for (Book book : books) {
            book.display();
        }
    }

    public static void main(String[] args) {
        Library lb1 = new Library();
        lb1.addBook("Yahya Ahmed ", "James", "Yah");
        lb1.addBook("Syed Ahmed ", "Curry", " Yahs");

        lb1.borrowBooks("yahya ahmed");
        lb1.display();
        lb1.returnBook("Syed ahmed");
        lb1.display();
    }


}
