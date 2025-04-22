package Library;


import java.util.Scanner;

class Library1 {
    Scanner scanner = new Scanner(System.in);

    String bookName = "All About Stephen Curry";
    String author = "Yahya Ahmed";
    Boolean isAvailable = true;
    String bookName2;
    String author2;
    String add;
    String availability = "Available";
    public void addBooks(){
       if (!isAvailable){
           availability.equals("Borrowed");
       }

      System.out.println("Welcome to the Library");
      System.out.println("There is currently one book in the library");
      System.out.println("Would you like to add more? -- Yes/No");
       add = scanner.nextLine();
      if (add.equals("Yes")|| add.contains("yes")){
          addMore();
      }
       else{
           checkOut();
       }
  }
  public void addMore(){
      System.out.println("Please provide the information below to add a book");
      System.out.println("Book Name: ");
       bookName2 = scanner.nextLine();
      System.out.println("Author: ");
       author2 = scanner.nextLine();
      System.out.println("Book successfully Added");
      checkOut();
  }
  public void checkOut(){
        if (add.equals("No") || add.equals("no")){
            System.out.println("Would you like to check this book out?");
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + author);
            System.out.println("Status: " + availability);
            String checkOut = scanner.nextLine();
            if ((checkOut.contains("y") || checkOut.contains("Y"))){
                System.out.println("Successfully Checked Out: "+ bookName);
                System.out.println("Thanks for visiting");
            }
        }
        else{
            System.out.println("Type the number of the book you want to check out");
            System.out.println("1");
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + author);
            System.out.println("Status: " + availability);
            System.out.println("2");
            System.out.println("Book Name: " + bookName2);
            System.out.println("Author: " + author2);
            System.out.println("Status: " + availability);
            int checkOut2 = scanner.nextInt();
            if (checkOut2 == 1){
                System.out.println("Successfully Checked Out: " + bookName);
                System.out.println("Thanks for visiting");
            }
            System.out.println("Successfully Checked Out: " + bookName2);
            System.out.println("Thanks for visiting");
        }
  }


    public static void main(String[] args) {
        Library1 books = new Library1();
        books.addBooks();
    }



}