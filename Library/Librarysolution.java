package Library;

import java.util.ArrayList;
import java.util.List;


class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title + " by " + author);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayBooks() {
        System.out.println("\nCurrent Library Books:");
        for (Book book : books) {
            book.displayBook();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("The Hobbit", "J.R.R. Tolkien");
        library.addBook("Harry Potter", "J.K. Rowling");

        library.borrowBook("The Hobbit");
        library.displayBooks();

        library.returnBook("The Hobbit");
        library.displayBooks();
}
}

