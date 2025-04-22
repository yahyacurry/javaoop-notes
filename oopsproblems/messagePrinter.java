package oopsproblems;

//1. Create a class MessagePrinter with a method printMessage(String name)
// which prints the message"hello<name>".
 public class messagePrinter {
     String name;

     public messagePrinter(String name){
         this.name = name;
     }

     public void printName(){
         System.out.println("Hello "+ this.name);
     }

    public static void main(String[] args) {
        messagePrinter obj1 = new messagePrinter("yahya");
        obj1.printName();
    }

}
