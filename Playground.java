public class Playground {
    /*
       you are declaring a variable string type  with the name, name.
     */
    String name;

    /*
       you are declaring a variable int type  with the name, age.

     */
    int age;

    /*
        you are creating a method - Wrong
     */
    public Playground(){
    }

    /*
        you are creating a constructor
     */
    public Playground(String name, int age){
        /*
            this line is saying for the name variable to replace with the new name variable value
         */
        this.name = name;

        /*
            this line is saying for the age variable to replace with the new age variable value

         */
        this.age = age;
    }

    /*
      you have created your main method
     */
    public static void main(String[] args) {

        /*
          created an object with the name ibj1
        */
        Playground obj1 = new Playground();

        /*
            the obj1's names value is alex
         */
        obj1.name = "Alex";

        /*
             the obj1's ages value is 30

         */
        obj1.age = 30;

        /*
you created another object
         */
        Playground obj2 = new Playground("John", 50);



    }

    public void printName(){
        System.out.println("xyz");
    }

    public int printSum(){
       return 2+2;
    }

    public int printSumWithInputs(int a, int b){
       return a+b;
    }




}
