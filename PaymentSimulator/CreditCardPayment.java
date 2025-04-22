package PaymentSimulator;

import java.util.Scanner;

class CreditCardPayment implements PaymentMethod, Refundable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment...");
        System.out.println("Payment of $" + amount + " successful!");
    }



    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Payment made with Credit Card");
    }

    @Override
    public void Refund(double amount) {
        System.out.println("Enter the amount you want to refund");
        amount = scanner.nextDouble();
        System.out.println("Success Fully refunded Credit Card  payment of: " + amount);
    }
}

