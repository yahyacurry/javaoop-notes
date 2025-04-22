package Library2;

import java.util.Timer;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private boolean isAvailable;

    Book(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isAvailable = false;
    }

    void borrowBook() {
        if (!isAvailable) {
            isAvailable = true;

            System.out.println("Successfully borrowed " + title);
        }
        else {
            System.out.println( title + "Is already Borrowed");
        }
    }


    void returnBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Successfully Returned: " + title);
        }
        else{
            System.out.println( title + " was never borrowed");
        }
    }

    public void display(){
        String status = isAvailable ? "Borrowed" : "Available";
        System.out.println("Title: " + title + " By: " + author + " Status " + status + " Publisher: " + publisher);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
