package oopsproblems;
//2. Create a class Calculator with the following methods:
//calculateSum(int number1, int number2) to calculate the sum of two numbers.
//calculateDifference(int number1, int number2) to calculate the difference between two numbers.
public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void add(){

        System.out.println(this.a+this.b);
    }

    public void subtract(){
        System.out.println(this.a-this.b);
    }

    public static void main(String[] args) {
        Calculator add = new Calculator(2,4);
        add.add();
        Calculator subtract = new Calculator(6,4);
        subtract.subtract();
    }
}
