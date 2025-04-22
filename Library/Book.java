package Library;

/*
    Independent Book class with its own memebers and methods.
*/
class Book {
    /*
        Instance variables of book class.
        Meaning these are the properties of this book class so any other class that instantiate
        this Book class, will have ability to interact with these properties only.
    */
    private String title;
    private String author;
    private boolean isBorrowed;

    /*
        Constructor to initialize the instance variables of the Book
        whenever a new Book object is created
    */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Default: available
    }

    /*
        Instance Method to mark that a book has been borrowed
    */
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Successfully borrowed " + title + ".");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    /*
        Instance method to return the book and mark it available
    */
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Successfully returned " + title + ".");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    /*
        Instance method to display the status of the book
    */
    public void displayBook() {
        String status = isBorrowed ? "Borrowed" : "Available";
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + status);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
